<%@page import="com.furniture.domain.Furniture"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="com.furnityre.dao.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>家具编号</td>
			<td>家具名称</td>
			<td>家具简介</td>
			<td>家具数量</td>
			<td>家具价格</td>
			<td>家具图片</td>
			<td></td>
			<td></td>
		</tr>
		<%request.setCharacterEncoding("utf-8");
		try{
			List<Furniture> furList=(List<Furniture>)(request.getAttribute("furList"));
			if(furList!=null){
				for(int i = 0; i<furList.size();i++){
					Furniture fur = furList.get(i);%>
					<tr>
					<td><%=fur.getFid() %></td>
					<td><%=fur.getFname() %></td>
					<td><%=fur.getFsummary() %></td>
					<td><%=fur.getFnum() %></td>
					<td><%=fur.getFprice() %></td>
					<td><img src="../image/<%=fur.getFpic() %>" height="100" width="100"/></td>
					<td><a href="FurServlet?action=select&id=<%=fur.getFid() %>">编辑</a></td>
					<td><a href="FurServlet?action=delete&id=<%=fur.getFid() %>">删除</a></td>
					</tr>
				<%}
			}
		}catch(Exception e){
			e.printStackTrace();
		}%>
	</table>
</body>
</html>