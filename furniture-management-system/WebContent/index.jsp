<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!--响应移动端-->
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <title>欢迎杉世笆家具主页</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/admin.css" rel="stylesheet">
<body class="index-background">
    <!--头部-->
    <div class="container  index-container index-header">
        <div class="header">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <!-- 标题 -->
                    <a class="navbar-brand " href="${pageContext.request.contextPath}/index.jsp"><span class="logo">杉世笆</span></a>
                </div>
                <div class="collapse navbar-collapse" id="set">
                    <ul class="nav navbar-nav">
                        <!-- 导航链接 -->

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <!-- 设置登录等信息 -->
                        <!-- 导航链接 -->
						<c:if test="${consumer==null}">
							<li><a href="${pageContext.request.contextPath}/servlet/RegisterUIServlet">注册</a></li>
							<li><a href="${pageContext.request.contextPath}/servlet/LoginUIServlet">登录</a></li>
						</c:if>
						<c:if test="${consumer!=null}">
							<li><a class="disable" >欢迎您:${consumer.cname}</a></li>
							<li><a href="${pageContext.request.contextPath }/servlet/LogoutServlet">注销</a></li>
						</c:if>
                        <li><a href="${pageContext.request.contextPath }/servlet/AdminUIServlet" >进入后台</a></li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
    <!-- 主体 -->
    <div class="container index-container">
        <div class=" content col-sm-12">
            <img src="${pageContext.request.contextPath}/images/aaa.jpg" class="details-img img-responsive">
            <div class="details-bg">
                <div class="details">
                    <h1>欢迎来到<span>杉世笆</span>家具</h1>
                    <h2 class="text-center">公告：</h2>
                    <p class="text-left">我是公告我是公告我是公告我是公告我是公告我是公告我是公告我是公告我是公告我是公告我是公告
                        我是公告我是公告我是公告我是公告我是公告
                        我是公告我是公告我是公告我是公告我是公告我是公告我是公告我是公告我是公告我是公告我是公告</p>
                </div>
            </div>
        </div>
        <div class="items col-sm-12" >
            <div class="container">
                <div class="row index-row">
                	<c:forEach var="c" items="${page.list}">
	                    <div class="col-sm-6 col-md-4">
	                        <div class="thumbnail">
	                            <img src="${pageContext.request.contextPath}/images/content.jpg" class=" img-responsive" alt="...">
	                            <div class="caption">
	                                <h3>${c.fname }</h3>
	                                <p class="money">${c.fprice } ￥</p>
	                                <p><a href="${pageContext.request.contextPath}/servlet/BuyServlet?id=${c.fid}" class="btn btn-default" role="button">加入购物车</a></p>
	                            </div>
	                        </div>
	                    </div>
                    </c:forEach>
                </div>
            </div>
            <nav class="page">
                <ul class="pagination">
                    <!-- <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li> -->
                    <c:forEach var="pagenum" begin="${page.startPage }" end="${page.endPage }">
                    <li><a href="${pageContext.request.contextPath}/servlet/ListFurnitureServlet?pagenum=${pagenum}">  ${pagenum} </a></li>
                    </c:forEach>
                    <!-- <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li> -->
                </ul>
            </nav>
        </div>

    </div>
    <div class="foot container">
        <div class=" ">
            <h1>D1-348</h1>
            <h3>联系人：黄泽凯（62379）</h3>
        </div>
    </div>
</body>
</html>