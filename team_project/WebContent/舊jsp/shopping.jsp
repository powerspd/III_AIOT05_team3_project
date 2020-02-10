<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="userData.sys.userModel" %>
<%@ page import="userData.sys.userDAO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>使用者管理系統</title>
	<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="table-users">
<div class="header">
<div>
	<div style="width:1200px;height:100px;margin: 0px auto;position: relative;">
		<a href="###homepage###"><img src="images/Costgo.jpg" width=350px height=100px style="mix-blend-mode: multiply"></a>
		<div style="position: absolute; bottom: 3px; right: 10px;">
			<!-- use profileservlet(change name), adding 'change profile' and 'delete' bottoms--><!-- finish -->
			<a href="account"><c:out value="${user.username}"/></a>
			<!-- send user's e-mail address to servlet, then redirect to feedback page --><!-- in discuss -->
			<!--<a href="feedback.jsp">聯繫客服  </a>-->
			<!-- delete session and redirect to logout page -->
			<a href="index.jsp">登出</a>
		</div>
	</div> 
</div>
</div>
</div>
<div class="container">
	<div class="row">
		<div class="col-xl-10">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">
						<div class="row">
							<div align="center">
								<h4 ><span class="glyphicon glyphicon-shopping-cart"></span>我的購物車</h4>
							</div>
						</div>
					</div>
				</div>
			  <table border="1" cellpadding="5">
            <tr>
                <th>項目</th>
                <th></th>
                <th>個數</th>
                <th>價錢</th>
                <!--  <th>Delete</th> -->
                
            </tr>
            
            <c:forEach var="item" items="${item}">
                <tr>
                	<td><img class="img-responsive" src="C:\\Users\\User\\Desktop\\fake_data\\<c:out value="${user.username}"/>\\<c:out value='${item.fruits}'/>_000<c:out value="${item.number}"/>.png" width=150 hight=150 /></td>
                    <td><c:out value="${item.fruits}"/></td>
                    <td><c:out value="${item.number}"/></td>
                    <td><c:out value="${item.price}"/></td>
                    <!--  <td><a href="/delete"><img src="image/delete.png"></a></td>-->
                </tr>
            </c:forEach>
        </table>
							<div class="col-xs-2">
								<!-- using javascript is better? or using servlet to handle? -->
								<button type="button" class="btn btn-link btn-xs">
									<span class="glyphicon glyphicon-trash"> </span>
								</button>
							</div>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="text-center">
							<div class="col-xs-9">
							<!-- the same as above, thinking about how to deal with pricing and sum up? -->
							<h4 class="text-right"><c:out value=""/>總價 <strong></strong></h4>
						</div>
						</div>
					</div>
				</div>
				
				<div class="panel-footer">
					<div class="row">						
						<div class="col-md-2 col-md-offset-4">		
							<!-- this function wait until the detecting function finish -->
							<a href="refresh">刷新</a>
						</div>	
				<form action="checkOut">
						<div class="col-md-2">
							<!-- redirect to the checkout page, with several trading options -->
							<button type="sumbit" class="btn btn-success btn-block">
								確認結帳
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
      	  
</body>
</html>

