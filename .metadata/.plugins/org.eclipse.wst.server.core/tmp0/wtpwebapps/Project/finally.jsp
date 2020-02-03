<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>User Management Application</title>
</head>
<body>

    <div align="center">
       <a href="index.jsp" ></a>
        <table border="1" cellpadding="5">
            <caption><h2>List of Users</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>password</th>
                <th>Email</th>
                <th>Country</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.password}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.country}" /></td>
                    <td><a href="edit?id=<c:out value='${user.id}' />"><img src="image/2pencil.png"></a></td>
                    <td><a href="delete?id=<c:out value='${user.id}' />"><img src="image/delete.png"></a>                    	
                    </td>
                    
                </tr>
            </c:forEach>
        </table>
    </div>	
   <a href="index.jsp" >登出</a>&nbsp

</body>
</html>