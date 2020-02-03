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
<form action="Insert" method="post">
    <fieldset>
        <h1 >註冊</h1>
    <div >
    	<input type="hidden" name="id" value="<c:out value="${user.id}"/>">
        <label class=font>帳號:</label>
        
        <input type="text" name="name" value="<c:out value="${user.name}"/>"/>     <br>
        <label class=font>密碼:</label>
        <input type="password" name="password"value="<c:out value="${user.password}"/>"/>     <br>
        <label class=font>密碼驗證:</label>
        <input type="password" name="password2"value="<c:out value="${user.password2}"/>"/>     <br>
        <label class=font>email:</label>
        <input type="text" name="email"value="<c:out value="${user.email}"/>"/>    <br>
        <label class=font>國家:</label>
        <input type="text" name="country"value="<c:out value="${user.country}"/>"/>    <br>
    </div>
    <hr>
    <div>
        <input type="submit" value= "確認" >
        <input type="reset"  value= "清除" >
    </div>
    
    
</fieldset>
</form>
</body>
</html>