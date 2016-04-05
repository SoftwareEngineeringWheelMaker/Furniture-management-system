<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="com.furniture.domain.Consumer"
    import="com.furnityre.dao.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
</head>
<body>
	<table>
		<tr>
			<td>用户ID</td>
			<td>用户名</td>
			<td>电话</td>
			<td>金额</td>
			<td>操作</td>
		</tr>
		<%request.setCharacterEncoding("utf-8");
		try{
			List<Consumer> conList=(List<Consumer>)(request.getAttribute("conList"));
			if(conList!=null){
				for(int i = 0; i<conList.size();i++){
					Consumer con = conList.get(i);%>
					<tr>
					<td><%=con.getCid() %></td>
					<td><%=con.getCname() %></td>
					<td><%=con.getCtel() %></td>
					<td><%=con.getCmoney() %></td>
					<td><a href="DeleteConServlet?id=<%=con.getCid() %>">删除</a></td>
					</tr>
				<%}
			}
		}catch(Exception e){
			e.printStackTrace();
		}%>
	</table>
</body>
</html>