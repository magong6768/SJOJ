<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
题目编号：${problemContent.problem_id }<br>
题目名称：${problemContent.title }<br>
题目内容：${problemContent.description }<br>
运行时间限制：${problemContent.time_limit }s<br>
运行大小限制：${problemContent.memory_limit }MByte<br>
样例输入：${problemContent.input }<br>
样例输出：${problemContent.output }<br>
sample_input：${problemContent.sample_input }<br>
sample_output：${problemContent.sample_output }<br>
<h2>
<a href="tosubmit.do?problem_id=${problemContent.problem_id }">submit</a>
</h2>
</body>
</html>