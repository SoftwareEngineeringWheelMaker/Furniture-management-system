<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="gb2312" import="java.util.*"%>
    <!--  <%String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告栏</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
<form name="add" action="PlacardServlet?action=add" method="post">
<table align=center>
<tr>
<td>标题：<input type="text" name="title" size=40/>
</td>
</tr>
<td>内容：<textarea rows="4" cols="40" name="content"></textarea>>
</tr>
<tr>
<td><input type="submit" value="提交">
<input type="button" value="返回" onclick="JScript:history.back(-1)"></td>
</tr>
</table>

</body>
</html>