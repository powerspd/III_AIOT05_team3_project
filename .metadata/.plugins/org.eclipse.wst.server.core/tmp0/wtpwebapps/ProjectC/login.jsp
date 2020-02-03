
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
   <style>
        fieldset{  	  width:500px;
                        margin:0px auto;
                        border:3px solid turquoise;
                        border-radius: 20px;
                        text-align: center;  }
        
        .font{        	font-size: 20px;
            			color:black;
            			font-family:'Courier New', Courier, monospace;
            			padding:5px
            			}
    </style>
</head>
<body>
<form action="sSelect" method="post">
    <fieldset>
        <h1 class="font"><image src="image/40.png">管理員登入</h1><br>
    <div >
        <label class="font">帳號:</label>
        <input type="text" name="name"><br><br>
        <label class="font">密碼:</label>
        <input type="password" name="password"><br><br>
    </div>
   
    <div>
      
        <input type="submit" value= "登入" >
        <input type="reset"  value= "清除" >
        </div>
        <hr>
         	<a href="http://localhost:8080/ProjectC/register.jsp" >註冊 </a>&nbsp&nbsp&nbsp
        <a href="http://localhost:8080/ProjectC/index.jsp" >一般使用者 </a>
    
    
</fieldset>
    </form>
</body>
</html>