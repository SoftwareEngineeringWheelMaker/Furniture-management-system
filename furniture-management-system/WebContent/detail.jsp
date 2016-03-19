<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="gb2312" import="java.util.*" import="com.furniture.domain.Placard" import="com.furniture.dao.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> title </title>
</head>
<body>
<%try{
	List<Placard> item=(List<Placard>)(request.getAttribute("placard4"));
 for(int i=0;i<item.size();i++){
 Placard pla=item.get(i);
 if(item!=null){
%>
<form action="PlacardServlet?action=update" method="post"">
<table>
<tr>
<td>
<input type="hidden" name="id" value="<%=pla.getPid()%>"/>
</td>
</tr>
<tr>
<td>公告：<input type="text" name="title1" value="<%=pla.getTitle()%>" size=40/></td>
</tr>
<tr>
<td>内容:<textarea rows="4" cols="40" name="content1"><%=pla.getContent() %></textarea></td>
</tr>
<tr>
<td><input type="submit" value="更新">
<input type="button" value="返回" onclick="JScript:history.back(-1)"></td>
</tr>
</table>
<% }%>
<%} %>
<%}catch(Exception e){
	e.printStackTrace();
} %>
</form>
</body>
</html>