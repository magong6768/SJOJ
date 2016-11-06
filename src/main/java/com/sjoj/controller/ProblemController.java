package com.sjoj.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sjoj.bean.AddProblem;
import com.sjoj.bean.Problem;
import com.sjoj.bean.Solution;
import com.sjoj.mapper.ProblemMapper;
import com.sjoj.utils.InputOutputFileSave;

@Controller
public class ProblemController {
	@Autowired
	private ProblemMapper problemMapper;
	
	
	//获取主页题目列表
	@RequestMapping("/getProblemList.do")
	public  ModelAndView getProblemList(@RequestParam(value="pageNo",required=false,defaultValue="1")int  pageNo,@RequestParam(value="pageSize",required=false,defaultValue="10")int  pageSize,ModelMap mp){
		if(pageNo==0){
			pageNo=1;
			if(pageSize==0){
				pageSize=10;
			}else{
				//这不是强迫症，还是一个if对应一个else,避免程序抽风
			}
		}else{
			//再说一遍，这不是强迫症，还是一个if对应一个else,避免程序抽风
		}
		System.out.println("这是第"+pageNo+"页，每页显示"+pageSize+"行");
		int totalPage=problemMapper.gettotalPage(pageSize);
		List<Integer> totalPagelist=new ArrayList<Integer>();
		for(int i=1;i<=totalPage;i++){
			totalPagelist.add(i);
		}
		int nowPage=(pageNo-1)*pageSize;
		List<Problem> lp=problemMapper.getProblemList(nowPage, pageSize);
		mp.addAttribute("problemlist", lp);
		mp.addAttribute("totalPagelist", totalPagelist);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("/index");
		return mv;		
	}
	
	//增加新题目
	@RequestMapping("/addProblem.do")
	public ModelAndView addProblem(AddProblem ap) throws IOException{
		System.out.println("here"+ap.getTest_input());
		ModelAndView mv=new ModelAndView();		
		int i=problemMapper.addNewProblem(ap.getProblem());
		System.out.println(ap.getProblem().getProblem_id());
		InputOutputFileSave iofs=new InputOutputFileSave();
		iofs.saveFile(ap.getProblem().getProblem_id(), ap.getTest_input(), ap.getTest_output());
		if(i==1){
			mv.setViewName("success");
			return mv;
		}else{
			mv.setViewName("addproblem");
			return mv;
		}		
	}
	
	
	//根据题号获取题目内容
	@RequestMapping("/{problemlist.problem_id}")
	public ModelAndView getProblemContent(@PathVariable("problemlist.problem_id") int problem_id,ModelMap mp){
		System.out.println("here"+problem_id);
		Problem problem=problemMapper.getProblemContent(problem_id);
		mp.addAttribute("problemContent", problem);
		ModelAndView mv=new ModelAndView();	
		mv.setViewName("problemContent");
		return mv;
	}
	
	
	//根据题号跳转到提交页面
	@RequestMapping("/tosubmit.do")
	public ModelAndView toSubmit(@RequestParam("problem_id") String problem_id,ModelMap mp,HttpSession session,ModelAndView mv){
		mp.addAttribute("problem_id", problem_id);
		mv.setViewName("submit");
		return mv;		
	}
	
	
	//提交代码，把代码存入数据库solution，source_code，source_code_user三张表，并跳转到成绩页面
	@RequestMapping("/submitcode.do")
	public ModelAndView getachievement(Solution solution,HttpSession session,ModelMap mp,HttpServletRequest request){
		System.out.println(solution.toString());
		//获取访问用户的IP
		String ip = request.getHeader("x-forwarded-for"); 
		    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		      ip = request.getHeader("Proxy-Client-IP"); 
		    } 
		    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		      ip = request.getHeader("WL-Proxy-Client-IP"); 
		    } 
		    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		      ip = request.getHeader("HTTP_CLIENT_IP"); 
		    } 
		    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		      ip = request.getHeader("HTTP_X_FORWARDED_FOR"); 
		    } 
		    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		      ip = request.getRemoteAddr(); 
		    } 
        solution.setIp(ip);
        solution.setCode_length(solution.getCode().length());
        System.out.println(solution.toString());
        problemMapper.insertsolution(solution);
		problemMapper.insertsourcecode(solution.getSolution_id(), solution.getCode());
		problemMapper.insertsourcecodeuser(solution.getSolution_id(), solution.getCode());
		ModelAndView mv=new ModelAndView();	
		mv.setViewName("redirect:getranklist.do");
		return mv;
	}
	
	
	//根据题号跳转到提交页面
		@RequestMapping("/getranklist.do")
		public ModelAndView getRankList(@RequestParam(value="pageNo",required=false,defaultValue="1")int pageNo,
				@RequestParam(value="pageSize",required=false,defaultValue="20")int  pageSize,
				HttpSession session,ModelAndView mv,ModelMap mp){
//			if(pageNo==0){
//				pageNo=1;
//				if(pageSize==0){
//					pageSize=20;
//				}else{
//					//这不是强迫症，还是一个if对应一个else,避免程序抽风
//				}
//			}else{
//				//再说一遍，这不是强迫症，还是一个if对应一个else,避免程序抽风
//			}
			System.out.println("这是第"+pageNo+"页，每页显示"+pageSize+"行");
			int totalPage=problemMapper.gettotalPageSolution(pageSize);
			List<Integer> totalPagelist=new ArrayList<Integer>();
			for(int i=1;i<=totalPage;i++){
				totalPagelist.add(i);
			}
			int nowPage=(pageNo-1)*pageSize;
			List<Solution> ls=problemMapper.getRankList(nowPage, pageSize);
			mp.addAttribute("solutionlist", ls);
			mp.addAttribute("totalPagelist", totalPagelist);
			mv.setViewName("ranklist");
			return mv;		
		}

}
