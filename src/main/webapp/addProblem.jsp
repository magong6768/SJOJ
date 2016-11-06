<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addProblem.do">
Title:<input type="text" name="problem.title"><br>
Description:<input type="text" name="problem.description"><br>
Time_limit:<input type="text" name="problem.time_limit">s(阿拉伯数字)<br>
Memory_limit:<input type="text" name="problem.memory_limit">MByte(阿拉伯数字)<br>
Input:<input type="text" name="problem.input"><br>
Output:<input type="text" name="problem.output"><br>
Sample_input:<input type="text" name="problem.sample_input"><br>
Sample_output:<input type="text" name="problem.sample_output"><br>
Test_input:<textarea rows="10" cols="10" name="test_input"></textarea><br>
Test_output:<textarea rows="10" cols="10" name="test_output"></textarea><br>
<input type="submit" value="提交">
</form>

</body>
</html>