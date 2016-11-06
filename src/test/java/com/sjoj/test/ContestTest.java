package com.sjoj.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sjoj.bean.Contest;
import com.sjoj.mapper.ContestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring-application.xml")
public class ContestTest {
	
	@Autowired
	private  ContestMapper contestMapper;
	
	
	@Test
	public void testaddContest() throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String starttime="2016-10-04 12:00:00";
		String endtime="2016-12-04 12:00:00";
		Contest c=new Contest();
		c.setTitle("testcontest1");
		c.setDescription("testcontest1");
		c.setStart_time(sdf.parse(starttime));
		c.setEnd_time(sdf.parse(endtime));
		c.setPrivatee(1);
		c.setPassword("aaa");
		c.setDefunct("N");
		contestMapper.addContest(c);
		System.out.println(c.getContest_id());
	}

}
