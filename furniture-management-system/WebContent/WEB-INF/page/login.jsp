<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <!--响应移动端-->
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <title>欢迎登陆</title>
</head>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/admin.css" rel="stylesheet">
<body class="login_background">
<div class="container">
    <form action="${pageContext.request.contextPath}/servlet/LoginServlet" method="post"  class="form-horizontal col-sm-offset-2">
        <h2 class="col-sm-offset-2" >欢迎登陆：</h2>
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">用户名：</label>
            <div class="col-sm-5">
                <input name="cname" type="text" class="form-control" id="username" placeholder="请输入账号">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">密码：</label>
            <div class="col-sm-5">
                <input type="password" name="cpassword" class=" form-control" id="inputPassword3" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2"></div>
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">登录</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>