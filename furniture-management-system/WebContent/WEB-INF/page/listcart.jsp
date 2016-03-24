<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
<body>
<c:if test="${!empty(cart.map)}">
	<table align="center" width="1200px">
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
</body>
</html>