<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <!--响应移动端-->
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <title>家具后台管理系统</title>
</head>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/admin.css" rel="stylesheet">
<body>
    <!-- 页头 -->
    <div class="header">
        <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <!-- 标题 -->
                <a class="navbar-brand" href="admin.html">家具管理系统</a>
            </div>
            <div class="collapse navbar-collapse" id="set">
                <ul class="nav navbar-nav">
                    <!-- 导航链接 -->

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <!-- 设置登录等信息 -->
                        <!-- 导航链接 -->
                        <li class="active"><a class="disabled">欢迎你：RAINDROPS</a> </li>
                        <li><a href="" >退出登录</a></li>
                </ul>
            </div>
        </nav>
    </div>
    <!-- 主体 -->
    <div class="container">
        <!--左侧目录-->
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
            <div class="row">
                <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                    <div class="list-group">
                        <a href="" class="list-group-item active">系统信息</a>
                        <a href="" class="list-group-item">商品管理</a>
                        <a href="" class="list-group-item">商品管理</a>
                        <a href="" class="list-group-item">商品管理</a>
                        <a href="" class="list-group-item">商品管理</a>
                        <a href="" class="list-group-item">商品管理</a>
                        <a href="" class="list-group-item">商品管理</a>
                    </div>
                </div>
                <!-- 右侧主体内容 -->
                <div class="col-xs-12 col-sm-10 col-md-10 col-lg-10">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <!-- 16:9 aspect ratio -->
                            <div class="embed-responsive embed-responsive-16by9">
                                <iframe class="embed-responsive-item" src=" ${pageContext.request.contextPath }/servlet/BodyUIServlet" name="body"></iframe>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>