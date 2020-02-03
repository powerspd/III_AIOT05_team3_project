<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="process.jsp">
Enter Name :<input type="text" name="name"/><br>
<input type="submit" value="go">

<hr>

<h3>welcom EL session</h3>
<%
session.setAttribute("user", "sonoo"); 
%>
<a href="process.jsp">visit session</a>

<hr>

<h3>cookie </h3>
<%
Cookie ck =new Cookie("name","abhishek");
response.addCookie(ck);
%>
<a href="process.jsp">visit cookie</a>
</form>
</body>
</html>