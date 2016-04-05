<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <!--响应移动端-->
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <title>欢迎注册</title>
</head>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/admin.css" rel="stylesheet">
<body class="register">
<div class="container ">
    <h2 class="col-sm-offset-2" >欢迎注册：</h2>
    <form action="${pageContext.request.contextPath}/servlet/RegisterServlet" method="post" class="form-horizontal col-sm-offset-3">
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">用户名：</label>
            <div class="col-sm-5">
                <input type="text" class="form-control" id="username" value="${formBean.cname }" name="cname" placeholder="请输入账号">${formBean.errors.cname }
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label" >密码：</label>
            <div class="col-sm-5">
                <input type="password" class=" form-control" id="inputPassword3"  value="${formBean.cpassword }" name="cpassword" placeholder="请输入密码">${formBean.errors.cpassword }
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword2"  class="col-sm-2 control-label">确认密码：</label>
            <div class="col-sm-5">
                <input type="password" value="${formBean.cpassword2 }" class=" form-control" id="inputPassword2" name="cpassword2" placeholder="确认密码">${formBean.errors.cpassword2 }
            </div>
        </div>
        <div class="form-group">
            <label for="inputphone3" class="col-sm-2 control-label">请输入电话号码：</label>
            <div class="col-sm-5">
                <input type="text" class=" form-control" id="inputphone3" value="${formBean.ctel }"  name="ctel" placeholder="请输入电话号码">${formBean.errors.ctel }
            </div>
        </div>
        <div class="form-group">
            <label for="inputmoney" class="col-sm-2 control-label">请输入金额：</label>
            <div class="col-sm-5">
                <input type="password" class=" form-control" value="${formBean.cmoney }" id="inputmoney" name="cmoney" placeholder="请输入金额">${formBean.errors.cmoney }
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-2"></div>
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">注册</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>