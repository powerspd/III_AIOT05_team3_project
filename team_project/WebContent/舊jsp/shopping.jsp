<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="userData.sys.userModel" %>
<%@ page import="userData.sys.userDAO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <!-- <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors"> -->
    <!-- <meta name="generator" content="Jekyll v3.8.6"> -->
    <title>您的購物車</title>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js " integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n " crossorigin="anonymous "></script>
    <script>
        window.jQuery || document.write('<script src="/docs/4.4/assets/js/vendor/jquery.slim.min.js "><\/script>')
    </script>
    <script src="/docs/4.4/dist/js/bootstrap.bundle.min.js " integrity="sha384-6khuMg9gaYr5AxOqhkVIODVIvm9ynTT5J4V1cfthmT+emCG6yVmEZsRHdxlotUnm " crossorigin="anonymous "></script>
    <script src="form-validation.js "></script>

   <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/checkout/"> 

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


    <!-- Custom styles for this template -->
    <link href="css/cover.css" rel="stylesheet">
</head>

<body class="text-center">

    <div class="cover-container d-flex h-100 p-3 mx-auto flex-column">

        <header class="masthead mb-auto">
            <div class="inner">
                <!-- <h3 class="masthead-brand">Gostgo</h3> -->
                <nav class="nav nav-masthead justify-content-center">
                    <a class="nav-link active" href="#">購物車</a>
                    <a class="nav-link" href="#">聯繫客服</a>
                    <a class="nav-link" href="#">登出</a>
                </nav>
            </div>
            <br>
            <div class="container">
                <br>
                <div class="py-0 text-light">
                    <img class="d-block mx-auto mb-4" src="images/logo.png" alt="" width="387" height="141">
                    <!-- <h2></h2> -->
                    <!-- <p class="lead">Below is an example form built entirely with Bootstrap’s form controls. Each required form group has a validation state that can be triggered by attempting to submit the form without completing it.</p> -->
                </div>
<form action="refresh" method="post">
                <div class="row">
                    <div class="col-md-12 order-md-2 mb-4">
                        <h4 class="d-flex justify-content-between align-items-center mb-3">
                            <span class="text-light">您的購物車</span>
                            <!-- <span class="badge badge-secondary badge-pill">3</span> -->
                        </h4>
                        
                        <ul class="list-group mb-3">
                           <c:forEach var="item" items="${item}">
                            <li class="list-group-item d-flex justify-content-between lh-condensed">
                                <div class="text-secondary" class="text-secondary">
                                    <img class="img-responsive" src="C:\\Users\\User\\Desktop\\fake_data\\<c:out value="${user.username}"/>\\<c:out value='${item.fruits}'/>_000<c:out value="${item.number}"/>.png" width=150 hight=150 />
                   					<c:out value='${item.fruits}'/>
                                    <!-- <small class="text-muted">Brief description</small> -->
                                </div class="text-secondary">
                                <span class="text-muted"><c:out value='${item.price}'/></span>
                            </li>
                            </c:forEach>
                        </form>
                            <li class="list-group-item d-flex justify-content-between bg-light">
                                <div class="text-success">
                                    <h6 class="my-0">折價</h6>
                                    <!-- <small>EXAMPLECODE</small> -->
                                </div>
                                <span class="text-success">-$0</span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between text-secondary" ">
                        <span>總共</span>
                        <strong>$</strong>
                    </li>
                </ul>

                <!-- <form class="card p-2 ">
                    <div class="input-group text-secondary ">
                        <input type="text " class="form-control " placeholder="優惠代碼 ">
                                <div class="input-group-append ">
                                    <button type="submit " class="btn btn-secondary ">輸入</button>
                                </div>
                    </div>
                    </form> -->
                    <p>
                        <hr class="mb-5 ">
                        <button href="refresh" class="btn btn-info btn-lg my-2 " type="submit">刷新購物車</button>
                        <button href="# " class="btn btn-primary btn-lg my-2 " type="submit">進行結帳</button>
                    </p>
                    <!-- <p>
                        <hr class="mb-2 ">
                        <button href="# " class="btn btn-info btn-lg btn-block " type="submit ">繼續購買</button>
                        <hr class="mb-2 ">
                        <button href="# " class="btn btn-primary btn-lg btn-block " type="submit ">進行結帳</button>
                    </p> -->
                    
                </div>

                <footer class="my-5 pt-5 text-muted text-center text-small ">

                    <!-- <ul class="list-inline ">
                <li class="list-inline-item "><a href="# ">Privacy</a></li>
                <li class="list-inline-item "><a href="# ">Terms</a></li>
                <li class="list-inline-item "><a href="# ">Support</a></li>
                </ul> -->
                </footer>
            </div>
            
</body>

</html>