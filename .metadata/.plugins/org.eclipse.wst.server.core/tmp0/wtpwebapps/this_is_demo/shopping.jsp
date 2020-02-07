<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<div align="center" class="table-users">
<div class="header">
<h1>歡迎光臨Gostgo無人生鮮商店</h1>
<div></div>
<h3>
<a href="AccountServlet"><c:out value="${user.name}"/></a>
<a href="ServiceServlet">聯繫客服</a>
<a href="LogoutServlet">登出</a>
</h3> 
</div>
<div class="container">
	<div class="row">
		<div class="col-xs-8">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">
						<div class="row">
							<div class="col-xs-6">
								<h5><span class="glyphicon glyphicon-shopping-cart"></span> 我的購物車 </h5>
							</div>
						</div>
					</div>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-xs-2"><img class="img-responsive" src="/.....path_name...../<c:out value='${item.imno}'/>" />
						</div>
						<div class="col-xs-4">
							<h4 class="product-name"><strong><c:out value="${item.name}"/></strong></h4>
						</div>
						<div class="col-xs-6">
							<div class="col-xs-6 text-right">
								<h6><strong><c:out value="${item.unitPrice}"/> 元 </strong></h6>
							</div>
							<div class="col-xs-2">
								<button type="button" class="btn btn-link btn-xs">
									<span class="glyphicon glyphicon-trash"> </span>
								</button>
							</div>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="text-center">
							<div class="col-xs-3">
								<button type="button" class="btn btn-default btn-sm btn-block">
									再刷一次
								</button>
							</div>
						</div>
					</div>
				</div>
				<div class="panel-footer">
					<div class="row text-center">
						<div class="col-xs-9">
							<h4 class="text-right">總價 <strong><c:out value="${item.totalPrice}"/></strong></h4>
						</div>
						<div class="col-xs-3">
							<button type="button" class="btn btn-success btn-block">
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