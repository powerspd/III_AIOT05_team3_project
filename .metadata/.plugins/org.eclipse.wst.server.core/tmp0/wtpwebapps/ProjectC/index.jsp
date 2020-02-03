<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
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
<form action="Select" method="post">
    <fieldset>
        <h1 class="font">資料庫登入</h1><br>
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
        <a href="http://localhost:8080/ProjectC/register.jsp" >註冊 </a>&nbsp&nbsp&nbsp&nbsp
         <a href="http://localhost:8080/ProjectC/login.jsp" >使用者管理 </a>
</fieldset>
    </form>
</body>

</html>