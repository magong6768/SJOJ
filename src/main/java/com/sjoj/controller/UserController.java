package com.sjoj.controller;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sjoj.bean.User;
import com.sjoj.mapper.UserMapper;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	//用户登录
	@RequestMapping("/login.do")
	public ModelAndView login(User user,HttpSession session){
		User u=userMapper.login(user);
		System.out.println(u.toString());
		session.setAttribute("user_id", user.getUser_id());
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:getProblemList.do");
		//mv.setView("redirect:getProblemList.do");
		return mv;		
	}
	//注册新用户
	//ajax实现检查用户名是否存在
	@RequestMapping("/register.do")
	public ModelAndView register(User user,HttpSession session){
		System.out.println("hereh");
		//测试时字段user_id,email，ip,password,nick,school不能为空，后期更改
		//Mybatis参数为空时候的默认值设置
        user.setEmail("testemail");
        user.setIp("testip");
        user.setNick("testNick");
        user.setSchool("testschool");
        System.out.println("here2"+user.toString());
        
        //判断用户名是否存在，可以后期在ajax中实现
        String name=userMapper.checkregister(user.getUser_id());
        System.out.println("name:"+name);
        
        if(user.getUser_id().equals(name)){
        	ModelAndView mv=new ModelAndView();
    		mv.setViewName("/register");
        	return mv;
        }else{
        	//注册
        	int succ_flag=userMapper.register(user);
        	if(1==succ_flag){
        		session.setAttribute("user_id",user.getUser_id());
        		ModelAndView mv=new ModelAndView();
        		mv.setViewName("redirect:getProblemList.do");
            	return mv;
        	}else {
        		ModelAndView mv=new ModelAndView();
        		mv.setViewName("/register");
            	return mv;
			}
        }	
	}
	
	
	//验证验证码
	@RequestMapping({"authCode"})
    public void getAuthCode(HttpServletRequest request, HttpServletResponse response,HttpSession session)
            throws IOException {
        int width = 63;
        int height = 37;
        Random random = new Random();
        //设置response头信息
        //禁止缓存
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);

        //生成缓冲区image类
        BufferedImage image = new BufferedImage(width, height, 1);
        //产生image类的Graphics用于绘制操作
        Graphics g = image.getGraphics();
        //Graphics类的样式
        g.setColor(this.getRandColor(200, 250));
        g.setFont(new Font("Times New Roman",0,28));
        g.fillRect(0, 0, width, height);
        //绘制干扰线
        for(int i=0;i<40;i++){
            g.setColor(this.getRandColor(130, 200));
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int x1 = random.nextInt(12);
            int y1 = random.nextInt(12);
            g.drawLine(x, y, x + x1, y + y1);
        }

        //绘制字符
        String strCode = "";
        for(int i=0;i<4;i++){
            String rand = String.valueOf(random.nextInt(10));
            strCode = strCode + rand;
            g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
            g.drawString(rand, 13*i+6, 28);
        }
        //将字符保存到session中用于前端的验证
        session.setAttribute("strCode", strCode);
        g.dispose();

        ImageIO.write(image, "JPEG", response.getOutputStream());
        response.getOutputStream().flush();

    }
	 //生成颜色
	 Color getRandColor(int fc,int bc){
	        Random random = new Random();
	        if(fc>255)
	            fc = 255;
	        if(bc>255)
	            bc = 255;
	        int r = fc + random.nextInt(bc - fc);
	        int g = fc + random.nextInt(bc - fc);
	        int b = fc + random.nextInt(bc - fc);
	        return new Color(r,g,b);
	    }

}
