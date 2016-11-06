package com.sjoj.bean;

import java.util.Date;
import java.util.List;


public class Contest {
	//竞赛ID
	private  int contest_id;
	//竞赛名字
	private String title;
	//开始时间
	private Date start_time;
	//结束时间
	private Date end_time;
	//是否展示 'N':不展示     'Y'展示
    private String defunct;
    //竞赛说明
    private String description;
    //是否私有化 '1':是   '0'否
    private int privatee;
    //没搞懂
    private int langmask;
    //密码（可为空）
    private String password;
    //竞赛题目列表
    private List<Integer> contest_problem_id;
	public int getContest_id() {
		return contest_id;
	}
	public void setContest_id(int contest_id) {
		this.contest_id = contest_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public String getDefunct() {
		return defunct;
	}
	public void setDefunct(String defunct) {
		this.defunct = defunct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrivatee() {
		return privatee;
	}
	public void setPrivatee(int privatee) {
		this.privatee = privatee;
	}
	public int getLangmask() {
		return langmask;
	}
	public void setLangmask(int langmask) {
		this.langmask = langmask;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Contest [contest_id=" + contest_id + ", title=" + title + ", start_time=" + start_time + ", end_time="
				+ end_time + ", defunct=" + defunct + ", description=" + description + ", privatee=" + privatee
				+ ", langmask=" + langmask + ", password=" + password + "]";
	}
	public List<Integer> getContest_problem_id() {
		return contest_problem_id;
	}
	public void setContest_problem_id(List<Integer> contest_problem_id) {
		this.contest_problem_id = contest_problem_id;
	}
    
}
