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
	Student Form
	<s:form action="register">

		<s:textfield key="student.name"></s:textfield>
		<s:textfield key="student.city"></s:textfield>
		<s:textfield key="student.age"></s:textfield>
		<s:textfield key="student.stipend"></s:textfield>
		<s:select key="student.course" list="{'Java','Spring','Angular'}"></s:select>
		<s:radio key="student.gender" list="{'Male','Female'}"></s:radio>
		<s:textfield key="student.email"></s:textfield>
		<s:checkboxlist key="student.hobby" list="hobbies"></s:checkboxlist>
		<s:submit key="Register"></s:submit>
	</s:form>
</body>
</html>