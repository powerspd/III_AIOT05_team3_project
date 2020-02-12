<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>首頁</title>
	<link rel="icon" href="logo/logo.ico">
	<link href="css/cover.css" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>

<body class="text-center">
    <div class="cover-container h-100 p-3 col-4">
        <header class="masthead my-5">
            <div class="inner">
                <nav class="nav nav-masthead justify-content-center">
                    <a class="nav-link" href="index.jsp">首頁</a>
                    <a class="nav-link" href="aboutus.jsp">關於我們</a>
                    <a class="nav-link" href="cservice.jsp">智慧客服</a>
                </nav>
            </div>
        </header>
        <main role="main" class="cover">
        	<br><br><br><br><br><br><br>
            <img class="logo" src="logo/logo.png">
            <br><br><br>
            <h1>歡迎使用智慧購物車</h1>
            <br><br>
            <div align="center">
            	<a href="login.jsp" class="btn btn-lg btn-primary btn-success btn-left">一般登入</a>
            	<a href="qrlogin.jsp" class="btn btn-lg btn-primary btn-success btn-right">QR code 登入</a>
            </div>
        </main>
    </div>
</body>
</html>