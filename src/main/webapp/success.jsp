<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
success<br>
<form action="getProblemList.do">
<select name="pageNo">	    
			<option value="1">1</option>
		    <option value="2">2</option>
		    <option value="3">3</option>
	</select>
	<select name="pageSize">
			<option value="10">10</option>
			<option value="20">20</option>
			<option value="30">30</option>		
	</select>
	<input type="submit" value="提交">
</form><a href="getProblemList.do">getproblemlsit</a>
</body>
</html>