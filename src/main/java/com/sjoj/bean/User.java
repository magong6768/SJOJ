package com.sjoj.bean;

import java.util.Date;

public class User {
	 private String user_id ;
	 private String email ;
	 private int submit ;
	 private int solved ;
	 private char defunct ;
	 private String ip    ;
	 private Date accesstime  ;
	 private int volume ;
	 private int language ;
	 private String password;
	 private Date reg_time ; 
	 private String nick ;
	 private String school;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public char getDefunct() {
		return defunct;
	}
	public void setDefunct(char defunct) {
		this.defunct = defunct;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getAccesstime() {
		return accesstime;
	}
	public void setAccesstime(Date accesstime) {
		this.accesstime = accesstime;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getReg_time() {
		return reg_time;
	}
	public void setReg_time(Date reg_time) {
		this.reg_time = reg_time;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", submit=" + submit + ", solved=" + solved
				+ ", defunct=" + defunct + ", ip=" + ip + ", accesstime=" + accesstime + ", volume=" + volume
				+ ", language=" + language + ", password=" + password + ", reg_time=" + reg_time + ", nick=" + nick
				+ ", school=" + school + "]";
	}
	 
	 

}
