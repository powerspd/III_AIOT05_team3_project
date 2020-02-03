<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String sex = request.getParameter("sex");
if(sex.equals("1")){
	response.sendRedirect("https://www.pchome.com.tw");
	}
	else if( sex.equals("2")){
		response.sendRedirect("https://tw.yahoo.com/");
	}
	else{
		out.println("other!");
	}


%>>
</body>
</html>