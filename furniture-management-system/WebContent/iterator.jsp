<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="gb2312" import="java.util.*" import="com.furniture.domain.Placard" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><a href="PlacardServlet?action=getall">�������</a></h2></br>
<h3><a href="placard.jsp">�����½�</a></h3>
<div>
<form name="show" action="PlacardServlet?action=selectbytitle" method="post">
<table align=center>
<tr>
<td>���棺<input type="text" name="title" size=40/>
</td>
<td><input type="submit" value="�ύ">
</td>
</tr>
</table>
</form>
</div>

<div>
<table align=center>
<tr>
<th>����</th>
<th>����</th>
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
<td><a href="PlacardServlet?action=selectbyid&&pid2=<%=pla.getPid()%>">�༭</a></td>
<td><a href ="PlacardServlet?action=delete&&pid3=<%=pla.getPid()%>">ɾ��</a></td></tr>
<%} %>
<%} %>
<%}catch(Exception e){
	e.printStackTrace();
} %>
</table>
</div>
</body>
</html>