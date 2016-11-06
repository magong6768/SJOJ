<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h1>${sessionScope.user_id}</h1>
	
	<h2><a href="getranklist.do">ranklist</a></h2>
   <form action="getProblemList.do">
	<table >
		<tr>
			<td>题号</td>
			<td>题名</td>
			<td>已提交</td>
			<td>已解决</td>
		</tr>
		<c:forEach var="problemlist" items="${problemlist }">
			<tr>
				<td>${problemlist.problem_id}</td>
				<td><a href="${problemlist.problem_id}">${problemlist.title}</a></td>
				<td>${problemlist.submit}</td>
				<td>${problemlist.solved}</td>
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
