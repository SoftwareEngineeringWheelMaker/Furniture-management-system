<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1 align="center">XX后台管理系统</h1>
	<br><br><br><br><br>
	<div style="float:left;margin:0 150px 0 100px;" width="30%" height="100%">
	<a href="${pageContext.request.contextPath }/servlet/AddCustomerUIServlet" target="body">添加客户</a>
	</div>
	<iframe src="${pageContext.request.contextPath }/servlet/BodyUIServlet" width="60%" scrolling="auto" height="450px" name="body"></iframe>
</body>
</html>