package com.sjoj.test;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sjoj.bean.User;
import com.sjoj.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring-application.xml")
public class TestUser {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testlogin(){
	String name="aaa";
	String passsword="aaa";
    User user=new User();
    user.setUser_id(name);
    user.setPassword(passsword);
    User uss=userMapper.login(user);
    System.out.println(uss.toString());
	}
	
	@Test
	public void testcheckregister(){
	String name="bb";
	String passsword="aaa";
    User user=new User();
    user.setUser_id(name);
    user.setPassword(passsword);
    String test=userMapper.checkregister(user.getUser_id());
    System.out.println(test);
	}
	
	@Test
	public void testregister(){
	String name="bb";
	String passsword="22";
    User user=new User();
    user.setUser_id(name);
    user.setPassword(passsword);
    user.setIp("12.1.1.1");
    user.setNick("bb");
    user.setEmail("cc");
    user.setSchool("ss");
    int test=userMapper.register(user);
    System.out.println(test);
	}


}
