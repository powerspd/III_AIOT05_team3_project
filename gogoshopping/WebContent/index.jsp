<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>首頁</title>
	<link rel="icon" href="logo/logo.ico">
	<link rel="stylesheet" type="text/css" href="css/cover.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="javascript/toast.js"></script>
</head>

<body class="text-center">


    <div class="container col-lg-12 col-md-12 col-sm-12">  
        <header class="masthead my-5">
            <div class="inner">
                <nav class="nav nav-masthead justify-content-center">
                    <a class="nav-link active" href="index.jsp">首頁</a>
                    <a class="nav-link" href="aboutus.jsp">關於我們</a>
                    <a class="nav-link" href="cservice.jsp">智慧客服</a>
                </nav>
            </div>
        </header>
        <main role="main" class="cover">
        	<c:if test="${sessionScope.islogin == 'incorrect'}" >
		    	<div class="toast mr-auto" role="alert" data-autohide="false">
	  				<div class="toast-header">
	    				<strong class="mr-auto">提示</strong>
	    				<button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
	      					<span aria-hidden="true">&times;</span>
	    				</button>
	  				</div>
	  				<div class="toast-body">
	    				電郵或密碼輸入錯誤！
	  				</div>
				</div>
   			</c:if>
        	<c:if test="${sessionScope.islogin == 'noQR'}" >
		    	<div class="toast mr-auto" role="alert" data-autohide="false">
	  				<div class="toast-header">
	    				<strong class="mr-auto">提示</strong>
	    				<button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
	      					<span aria-hidden="true">&times;</span>
	    				</button>
	  				</div>
	  				<div class="toast-body">
	    				沒偵測到二維碼，請重試！
	  				</div>
				</div>
   			</c:if>
        	<c:if test="${sessionScope.islogin == 'timeout'}" >
		    	<div class="toast mr-auto" role="alert" data-autohide="false">
	  				<div class="toast-header">
	    				<strong class="mr-auto">提示</strong>
	    				<button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
	      					<span aria-hidden="true">&times;</span>
	    				</button>
	  				</div>
	  				<div class="toast-body">
	    				連線失敗！請洽客服人員！
	  				</div>
				</div>
   			</c:if>		
        	<c:if test="${sessionScope.islogin == 'logout'}" >
		    	<div class="toast mr-auto" role="alert" data-autohide="false">
	  				<div class="toast-header">
	    				<strong class="mr-auto">提示</strong>
	    				<button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
	      					<span aria-hidden="true">&times;</span>
	    				</button>
	  				</div>
	  				<div class="toast-body">
	    				登出成功！
	  				</div>
				</div>
   			</c:if>		
        	<c:if test="${sessionScope.islogin == 'scanning'}" >
		    	<div class="toast mr-auto" role="alert" data-autohide="false">
	  				<div class="toast-header">
	    				<strong class="mr-auto">提示</strong>
	    				<button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
	      					<span aria-hidden="true">&times;</span>
	    				</button>
	  				</div>
	  				<div class="toast-body">
	    				請掃描二維碼！
	  				</div>
				</div>
   			</c:if>	   			
        	<br><br><br><br><br><br><br>
            <img class="logo" src="logo/logo.png">
            <br><br><br>
            <h1>歡迎使用智慧購物車</h1>
            <br><br>
            <div align="center">
            	<a href="login.jsp" class="btn btn-lg btn-primary btn-success btn-left">一般登入</a>
            	<a href="QRLoginServlet" class="btn btn-lg btn-primary btn-success btn-right">QR code 登入</a>
            </div>
        </main>
    </div>
</body>
</html>