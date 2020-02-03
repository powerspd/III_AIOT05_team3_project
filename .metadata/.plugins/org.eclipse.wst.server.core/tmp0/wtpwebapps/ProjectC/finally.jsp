<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>User Management Application</title>
	    <style>
        fieldset{  	  width:800px;
                        margin:0px auto;
                        border:3px solid turquoise;
                        border-radius: 20px;
                        text-align: center;  }
        
        .font{        	font-size: 20px;
            			color:black;
            			font-family:'Courier New', Courier, monospace;
            			padding:5px
            			}
        .table{ 		border:1px;
        				border-color:gree;
        }
    </style>
</head>
<body>
<fieldset>
    <div align="center">
       <a href="index.jsp" ><image src="image/door3.png"></a>
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
                <th>Sign out</th>
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
</fieldset>
</body>
</html>