<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<meta charset="UTF-8">
<title>Insert title here</title>
<head>
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
                <th>id</th> 
                <th>帳號</th> 
                <th>建立日期</th>
                <th>內容</th>
                <th>費用</th>
                <th>新增</th>
                <th>刪除</th>
               
            </tr>
            
            <c:forEach var="user" items="${lists}">
                <tr>
                   <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.date}" /></td>
                    <td><c:out value="${user.buy}" /></td>
                    <td><c:out value="${user.cost}" /></td>
                    <td><a href="Cinsert?id=<c:out value='${user.id}' />"><img src="image/2pencil.png"></a></td>
                    <td><a href="Cdelete?id=<c:out value='${user.id}' />"><img src="image/delete.png"></a>                    	
                    </td>
                    
                </tr>
            </c:forEach>
        </table>
    </div>	
</fieldset>

</body>
</html>
</body>
</html>