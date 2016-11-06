<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><a href="getProblemList.do">主页</a></h2>
<form action="getranklist.do">
	<table >
		<tr>
			<td>编号</td>
			<td>题号</td>
			<td>用户名</td>
			<td>语言</td>
			<td>结果</td>
		</tr>
		<c:forEach var="solutionlist" items="${solutionlist }">
			<tr>
				<td>${solutionlist.solution_id}</td>
				<td><a href="${solutionlist.problem_id}">${solutionlist.problem_id}</a></td>
				<td>${solutionlist.user_id}</td>
				<td>${solutionlist.language}</td>
				<td>${solutionlist.result_name}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<select name="pageNo">
	    <c:forEach var="totalPagelist" items="${totalPagelist }">
			<option value="${totalPagelist}">
				${totalPagelist}
			</option>
		</c:forEach>
	</select>
	<select name="pageSize">
			<option value="10">10</option>
			<option value="20">20</option>
			<option value="30">30</option>		
	</select>
	<input type="submit" value="提交">
	</form>
</body>
</html>