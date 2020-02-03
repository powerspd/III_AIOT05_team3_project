<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
welcome.jsp	<br>
<%
out.print("welcome"+request.getParameter("uname"));
String a =config.getInitParameter("dname");
out.print("welcome"+a);
%>
</body>
</html>