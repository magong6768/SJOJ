package com.sjoj.bean;

import java.util.List;

public class PageCount<T> {
	//数据库记录总条数(题目总数)
	private int totalCount;
	//按页面显示条数，生成页面数  totalPage=totalcount/pageSize
	private int totalPage;
	//一页显示数据条数
	private int pageSize;
	//当前所在页数
	private int pageNo;
	//当前页面的数据
	private List<T> rows;
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
//	public List<Problem> getRows() {
//		return rows;
//	}
//	public void setRows(List<Problem> rows) {
//		this.rows = rows;
//	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	

}
