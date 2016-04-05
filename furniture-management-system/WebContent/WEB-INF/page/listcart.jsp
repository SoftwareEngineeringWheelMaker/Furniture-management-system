<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/html">
<head lang="en">
    <meta charset="UTF-8">
    <!--响应移动端-->
    <meta name="viewport" content="width=device-width,initial-scale=1.0"/>
    <title>购物车</title>
</head>
<script type="text/javascript">
	function ClearCart(){
		var a = window.confirm("确定清空？");
		if(a){
			window.location.href="${pageContext.request.contextPath }/servlet/ClearCartServlet";		
		}
	}
	
	function update(furnitureid,oldquantity){
		
		var value = document.getElementById("quantity").value;
		if(window.confirm("确定更改数量为"+value+"？")){
		window.location.href="${pageContext.request.contextPath }/servlet/UpdateCartServlet?furnitureid="+furnitureid+"&quantity="+value;	
		}else{
			document.getElementById("quantity").value=oldquantity;
		}
	}
</script>
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
                        <li><a href="" >进入后台</a></li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
    <!-- 主体 -->
<div class="container cart">
    <div class="col-xs-8 col-xs-offset-2" >
         <c:if test="${!empty(cart.map)}">
			<table class="table col-xs-8" >
				<tr>
					<th widht="10%">家具</th>
					<th width="20%">简介</th>
					<th width="15%">价格</th>
					<th width="15%">数量</th>
					<th width="20%">总价格</th>
					<th>操作</th>
				</tr>
				
				<c:forEach var="me" items="${cart.map}">
				<tr align="center">
					<td>${me.value.furniture.fname}</td>
					<td>${me.value.furniture.fsummary}</td>
					<td>${me.value.furniture.fprice}</td>
					<td><input type="text" id="quantity" style="width: 30px;" onchange="update(${me.value.furniture.fid},${me.value.quantity})" value="${me.value.quantity}"/></td>
					<td>${me.value.price}</td>
					<td><a href="${pageContext.request.contextPath }/servlet/DeleteCartServlet?furnitureid=${me.value.furniture.fid}">删除</a></td>
				</tr>
				</c:forEach>
				<tr align="center">
					<td colspan="2"><a href="javascript:ClearCart()" >清空购物车</a></td>
					<td colspan="2">合计：${cart.price}</td>
					<td colspan="2"><a href="">确认购买</a></td>
				</tr>
			</table>
		</c:if>
	<c:if test="${empty(cart.map)}">
	对不起，购物车为空。
	</c:if>
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