<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${consumer==null}">
	<a href="${pageContext.request.contextPath}/servlet/RegisterUIServlet">注册</a><br>
	<a href="${pageContext.request.contextPath}/servlet/LoginUIServlet">登录</a><br>
</c:if>
<c:if test="${consumer!=null}">
	欢迎您:${consumer.cname} || <a href="${pageContext.request.contextPath }/servlet/LogoutServlet">注销</a>
</c:if>
<a href="${pageContext.request.contextPath }/servlet/AdminUIServlet">后台管理系统</a>
</body>
</html>