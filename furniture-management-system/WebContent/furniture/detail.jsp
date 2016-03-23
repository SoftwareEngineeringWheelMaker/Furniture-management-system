<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="java.util.*"
	import="com.furniture.domain.Furniture"
	import="com.furniture.dao.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%try{
		List<Furniture> furList=(List<Furniture>)(request.getAttribute("furList"));
		Furniture fur = furList.get(0);
		if(fur!=null){
	%>
	<table>
		<tr>
			<td><%=fur.getFid() %></td>
			<td><%=fur.getFname() %></td>
			<td><%=fur.getFnum() %></td>
			<td><%=fur.getFsummary() %></td>
			<td><%=fur.getFprice() %></td>
			<td><img src="../image/<%=fur.getFpic() %>" height="100" width="100"/></td>
		</tr>
	</table>
	<%} %>
	<%}catch(Exception e){
	e.printStackTrace();
	} %>
</body>
</html>