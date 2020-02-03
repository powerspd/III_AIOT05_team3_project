<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<form action="Select" method="post">
    <fieldset>
        <h1 class="font">資料庫登入</h1>
    <div >
        <label class="font">account:</label>
        <input type="text" name="name"><br>
        <label class="font">password:</label>
        <input type="password" name="password"><br>
    </div>
    <hr>
    <div>
       	<a href="register.jsp" >register</a>&nbsp
        <input type="submit" value= "go" >
        <input type="reset"  value= "reset" >
    </div>
    </form>
</body>
</html>