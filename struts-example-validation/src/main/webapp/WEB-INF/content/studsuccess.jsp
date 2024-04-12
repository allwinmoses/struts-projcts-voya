<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${student} Name:${student.name}
	<br> City:${student.city}
	<br> Age:${student.age}
	<br> Allowance:${student.allowance}
	<br> Course:${student.course}
	<br> Email:${student.email}
	<br> Gender:${student.gender}
	<br> Hobby:${student.hobby}
	<br>


</body>
</html>