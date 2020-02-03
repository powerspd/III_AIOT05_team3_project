<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome,${param.name}<br>

<hr>
value is ${sessionScope.user}    

<hr>
hello,${cookie.name.value}
</body>
</html>