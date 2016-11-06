package com.sjoj.bean;

import java.sql.Date;

public class Problem {
	private int problem_id ;
	private String title ;
	private String description  ;
	private String input;
	private String output ;
	private String sample_input ;
	private String sample_output ;
	private String spj ;
	private String hint ;
	private String source ;
	private Date in_date  ;
	private int time_limit ;
	private int memory_limit ;
	private String defunct ;
	private int accepted ;
	private int submit ;
	private int solved;
	public int getProblem_id() {
		return problem_id;
	}
	public void setProblem_id(int problem_id) {
		this.problem_id = problem_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getSample_input() {
		return sample_input;
	}
	public void setSample_input(String sample_input) {
		this.sample_input = sample_input;
	}
	public String getSample_output() {
		return sample_output;
	}
	public void setSample_output(String sample_output) {
		this.sample_output = sample_output;
	}
	public String getSpj() {
		return spj;
	}
	public void setSpj(String spj) {
		this.spj = spj;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Date getIn_date() {
		return in_date;
	}
	public void setIn_date(Date in_date) {
		this.in_date = in_date;
	}
	public int getTime_limit() {
		return time_limit;
	}
	public void setTime_limit(int time_limit) {
		this.time_limit = time_limit;
	}
	public int getMemory_limit() {
		return memory_limit;
	}
	public void setMemory_limit(int memory_limit) {
		this.memory_limit = memory_limit;
	}
	public String getDefunct() {
		return defunct;
	}
	public void setDefunct(String defunct) {
		this.defunct = defunct;
	}
	public int getAccepted() {
		return accepted;
	}
	public void setAccepted(int accepted) {
		this.accepted = accepted;
	}
	public int getSubmit() {
		return submit;
	}
	public void setSubmit(int submit) {
		this.submit = submit;
	}
	public int getSolved() {
		return solved;
	}
	public void setSolved(int solved) {
		this.solved = solved;
	}
	

}
