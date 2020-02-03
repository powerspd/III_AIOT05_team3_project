<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/demo2?useSSL=false&serverTimezone=CST"
user="root" password="22523322"/>

<sql:query dataSource="${db}" var="rs">
SELECT * from tableb;
</sql:query>
<table border="3" >
<tr>
<th>ID</th>
<th>NAME</th>
<th>password</th>
<th>Email</th>
<th>country</th>
</tr>
<c:forEach var="tableb" items="${rs.rows}">
<tr>
<td><c:out value="${tableb.id}"/></td> 
<td><c:out value="${tableb.name}"/></td>
<td><c:out value="${tableb.password}"/></td>
<td><c:out value="${tableb.email}"/></td>
<td><c:out value="${tableb.country}"/></td>
</tr>
</c:forEach>    
</table>
</body>
</html>