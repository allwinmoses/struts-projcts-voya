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
Student details<br>
<s:property value="student.name"/><br>
<s:property value="student.email"/><br>
<s:property value="student.course"/><br>
<s:property value="student.hobby"/><br>
<s:property value="student.age"/><br>
<s:property value="student.gender"/><br>
</body>
</html>