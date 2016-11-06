package com.sjoj.bean;


public class AddProblem {
	//测试输入-存入文件
	private String test_input;
	//测试输出-存入文件
	private String test_output;
	//题目信息-存入problem表中
	private Problem problem;
	public String getTest_input() {
		return test_input;
	}
	public void setTest_input(String test_input) {
		this.test_input = test_input;
	}
	
	public String getTest_output() {
		return test_output;
	}
	public void setTest_output(String test_output) {
		this.test_output = test_output;
	}
	public Problem getProblem() {
		return problem;
	}
	public void setProblem(Problem problem) {
		this.problem = problem;
	}
	

}
