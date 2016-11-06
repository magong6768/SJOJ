package com.sjoj.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sjoj.bean.Problem;
import com.sjoj.bean.Solution;
import com.sjoj.mapper.ProblemMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring-application.xml")
public class ProblemTest {
	 @Autowired
	 private ProblemMapper problemMapper;
	 
	 @Test
	 public void testgettotalPage() {
		int pageSize=10;
		int totalPage=problemMapper.gettotalPage(pageSize);
		System.out.println(totalPage);
	}
	 
	 @Test
	 public void testgetproblemList() {
		int pageSize=10;
		int row=10;
		List<Problem> lp=problemMapper.getProblemList(row, pageSize);
		for(Problem p:lp){
			System.out.println(p.getProblem_id());
		}
	}

	 @Test
	 public void addNewProblem() {
		Problem p=new Problem();
		p.setTitle("test");
		p.setDescription("test");
		p.setTime_limit(1);
		p.setMemory_limit(128);
		p.setHint("test");
		p.setInput("test");
		p.setOutput("test");
		p.setSample_input("test");
		p.setSample_output("test");
		int i=problemMapper.addNewProblem(p);
		System.out.println(i);
	}
	 
	 @Test
	 public void getProblemContent() {
		int id=1000;
		Problem p=problemMapper.getProblemContent(id);
		System.out.println(p.getInput());
	}
	 
	 @Test
	 public void insertsolution() {
		Solution s=new Solution();
		s.setCode_length(1000);
		s.setIp("127.0.0.1");
		s.setLanguage(0);
		s.setUser_id("cccgg");
		s.setProblem_id(1002);
		s.setCode("asdsadasdsa");
		int  p=problemMapper.insertsolution(s);
		int i=problemMapper.insertsourcecode(s.getSolution_id(), s.getCode());
		int f=problemMapper.insertsourcecodeuser(s.getSolution_id(), s.getCode());
		System.out.println(s.getSolution_id()+"************"+i+"***********"+f);
	 }
	 
	 
	 @Test
	 public void getRankList() {
		 
		 int pageSize=5;
			int row=0;
		int i=problemMapper.gettotalPageSolution(pageSize);
		List<Solution> p=problemMapper.getRankList(row, pageSize);
		for(Solution s:p)
		System.out.println(i+"********"+s.toString());
	}
	

}
