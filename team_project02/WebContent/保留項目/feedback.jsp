<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="userData.sys.userModel" %>
<%  userModel user=(userModel)session.getAttribute("user"); %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>意見回饋</title>
</head>
<body>
	<h1>意見回饋</h1>
	<form action="feedback" method="post">
		主題:<input type="text" maxlength="30" name="topic"/><br>
		敘述:<textarea rows="30" cols="50" name="description"></textarea><br>
		<input type="text" value="${user.email}" readonly/>
		<input type="submit" value="submit">
	</form>
</body>
</html>