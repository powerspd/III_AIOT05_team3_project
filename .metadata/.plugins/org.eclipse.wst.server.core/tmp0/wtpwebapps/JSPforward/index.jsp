<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>this is index page</h2>
<jsp:forward page="printdate.jsp">
<jsp:param name="name" value="tom" />
</jsp:forward>
</body>
</html>