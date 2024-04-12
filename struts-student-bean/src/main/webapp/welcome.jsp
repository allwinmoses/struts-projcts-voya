<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hi<br>
	<s:property value="student.studentName"></s:property><br>
	<s:property value="student.studentId"></s:property><br>
	<s:property value="student.city"></s:property><br>
	<s:property value="student.department"></s:property><br>

</body>
</html>