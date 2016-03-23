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
<c:choose>
<c:when test="${!empty(page.list)}">
<table>
	<tr>
		<td>家具名</td>
		<td>简介</td>
		<td>数量</td>
		<td>价格</td>
		<td>图片</td>
		<td>操作</td>
	</tr>
	<c:forEach var="c" items="${page.list}">
	<tr>
		<td><c:out value="${c.fname }" escapeXml="true" /></td>
		<td><c:out value="${c.fsummary }" escapeXml="true" /></td>
		<td><c:out value="${c.fnum }" escapeXml="true" /></td>
		<td><c:out value="${c.fprice }" escapeXml="true" /></td>
		<td><c:out value="${c.fpic }" escapeXml="true" /></td>
		<td>
			<a href="${pageContext.request.contextPath}/servlet/BuyServlet?id=${c.fid}">购买</a>
		</td>
	</tr>
	</c:forEach>
</table>
<c:forEach var="pagenum" begin="${page.startPage }" end="${page.endPage }"><a href="${pageContext.request.contextPath}/servlet/ListFurnitureServlet?pagenum=${pagenum}">  ${pagenum}  </a></c:forEach>
</c:when>
<c:otherwise>
	对不起，系统还没有任何客户信息。
</c:otherwise>
</c:choose>
<a href="${pageContext.request.contextPath}/index.jsp">主页</a>
</body>
</html>