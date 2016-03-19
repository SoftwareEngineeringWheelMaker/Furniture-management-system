<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="gb2312" import="java.util.*" import="com.furniture.domain.Placard" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><a href="PlacardServlet?action=getall">公告管理</a></h2></br>
<h3><a href="placard.jsp">公告新建</a></h3>
<div>
<form name="show" action="PlacardServlet?action=selectbytitle" method="post">
<table align=center>
<tr>
<td>公告：<input type="text" name="title" size=40/>
</td>
<td><input type="submit" value="提交">
</td>
</tr>
</table>
</form>
</div>

<div>
<table align=center>
<tr>
<th>公告</th>
<th>操作</th>
<tr>
<%request.setCharacterEncoding("utf-8");
try{
List<Placard> list=(List<Placard>)(request.getAttribute("placard1"));

if(list.size()!=0&&list!=null){
for(int i=0;i<list.size();i++){
Placard pla=list.get(i);

%>
<tr><td><%=pla.getTitle() %>
</td>
<td><a href="PlacardServlet?action=selectbyid&&pid2=<%=pla.getPid()%>">编辑</a></td>
<td><a href ="PlacardServlet?action=delete&&pid3=<%=pla.getPid()%>">删除</a></td></tr>
<%} %>
<%} %>
<%}catch(Exception e){
	e.printStackTrace();
} %>
</table>
</div>
</body>
</html>