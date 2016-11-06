package com.sjoj.bean;

public class Solution {
	private int solution_id;
	private int problem_id;
	private String user_id;
	private int language;
	private int result;
	private String result_name;
	private String ip;
	private String code;
	private int code_length;
	
	public int getSolution_id() {
		return solution_id;
	}
	public void setSolution_id(int solution_id) {
		this.solution_id = solution_id;
	}
	public int getProblem_id() {
		return problem_id;
	}
	public void setProblem_id(int problem_id) {
		this.problem_id = problem_id;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCode_length() {
		return code_length;
	}
	public void setCode_length(int code_length) {
		this.code_length = code_length;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Solution [solution_id=" + solution_id + ", problem_id=" + problem_id + ", user_id=" + user_id
				+ ", language=" + language + ", ip=" + ip + ", code=" + code + ", code_length=" + code_length + "]";
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getResult_name() {
		return result_name;
	}
	public void setResult_name(String result_name) {
		this.result_name = result_name;
	}
    
}
