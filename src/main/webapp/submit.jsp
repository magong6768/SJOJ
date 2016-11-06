<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="submitcode.do">
<input type="hidden" name="user_id" value="${sessionScope.user_id}">
题号：${problem_id }<br><input type="hidden" name="problem_id" value="${problem_id }">
选择语言：<select name="language">
<option value="0">C</option>
<option value="3">Java</option>
</select><br>
<textarea rows="20" cols="10" name="code"></textarea>
<input type="submit" value="提交">
</form>
</body>
</html>