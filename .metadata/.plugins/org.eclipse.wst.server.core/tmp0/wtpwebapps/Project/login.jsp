
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:setPro>
        <c:forEach var="user" items="${listUser}">
        
        
        
        </c:forEach>
<%String a =request.getParameter("name"); 
out.println(a); %>
</body>
</html>