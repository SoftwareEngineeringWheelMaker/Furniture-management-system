<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="gb2312" import="java.util.*"%>
    <!--  <%String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>������</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
<form name="add" action="PlacardServlet?action=add" method="post">
<table align=center>
<tr>
<td>���⣺<input type="text" name="title" size=40/>
</td>
</tr>
<td>���ݣ�<textarea rows="4" cols="40" name="content"></textarea>>
</tr>
<tr>
<td><input type="submit" value="�ύ">
<input type="button" value="����" onclick="JScript:history.back(-1)"></td>
</tr>
</table>

</body>
</html>