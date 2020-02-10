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
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>結帳</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href="css/cover.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</head>

<body class="text-center">

    <div class="cover-container d-flex h-100 p-3 mx-auto flex-column">

        <header class="masthead mb-auto">
            <div class="inner">
                <!-- <h3 class="masthead-brand">Gostgo</h3> -->
                  <a class="nav-link" href="#"><c:out value="${user.username}"/></a>
                    <a class="nav-link active" href="#">結帳</a>
                    <a class="nav-link" href="#">聯繫客服</a>
                    <a class="nav-link" href="#">登出</a>
                </nav>
            </div>
            <br>
            <div class="container">
                <br>
                <div class="py-0 text-light">
                    <img class="d-block mx-auto mb-4" src="images/logo.png" alt="" width="387" height="141">
                </div>
                <div class="col-md-12 order-md-1 ">

                    <h4 class="mb-3 text-light">結帳方式</h4>

                    <div class="d-block my-3 ">
                        <div class="custom-control custom-radio ">
                            <input id="credit " name="paymentMethod " type="radio " class="custom-control-input " checked required>
                            <label class="custom-control-label " for="credit ">信用卡</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input id="debit " name="paymentMethod " type="radio " class="custom-control-input " required>
                            <label class="custom-control-label " for="debit ">簽帳卡</label>
                        </div>
                    </div>
                    <div class="row ">
                        <div class="col-md-12 mb-3 text-light">
                            <label for="cc-name "><c:out value="${user.username}"/></label>
                            <input type="text " class="form-control " id="cc-name " placeholder="須與簽名欄一致" required>
                            <!-- <small class="text-light">須與簽名欄一致</small> -->
                            <div class="invalid-feedback ">
                                此欄位為必填
                            </div>
                        </div>

                        <div class="col-md-12 mb-3 text-light">
                            <label for="cc-number ">信用卡卡號</label>
                            <input type="text " class="form-control " id="cc-number " placeholder="oooo-xxxx-oooo-xxxx" required>
                            <!-- <small class="text-light">oooo-xxxx-oooo-xxxx</small> -->
                            <div class="invalid-feedback ">
                                此欄位為必填
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 mb-3 text-light">
                            <label for="cc-expiration ">到期年月</label>
                            <input type="text " class="form-control " id="cc-expiration " placeholder="MM/YY" required>
                            <!-- <small class="text-light">MM/YY</small> -->
                            <div class="invalid-feedback ">
                                此欄位為必填
                            </div>
                        </div>
                        <div class="col-md-6 mb-0 text-light">
                            <label for="cc-cvv ">安全碼</label>
                            <input type="text " class="form-control " id="cc-cvv " placeholder="請見簽名欄末端" required>
                            <!-- <small class="text-light">請見簽名欄末端</small> -->
                            <div class="invalid-feedback ">
                                此欄位為必填
                            </div>
                            <br>
                        </div>
                    </div>
                    <hr class="mb-0">
                    <button class="btn btn-primary btn-lg btn-block " type="submit ">確認</button>
                    <hr class="mb-2">
                    <button class="btn btn-info btn-lg btn-block " type="submit ">取消</button>
                </div>

            </div>
    </div>
</body>

</html>