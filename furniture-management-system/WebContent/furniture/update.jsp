<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="java.util.*"
	import="com.furniture.domain.Furniture"
	import="com.furniture.dao.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改家具信息</title>
</head>
<body>
	<%try{
		List<Furniture> furList=(List<Furniture>)(request.getAttribute("furList"));
		Furniture fur = furList.get(0);
		if(fur!=null){
	%>
	<form name="update" method="post" action="../servlet/FurServlet">
	<input type="hidden" id="action" name="action" value="update"/>
	<table>
		<tr>
			<td align="right">家具编号：</td>
			<td><input type="text" name="fid" size="12" value="<%=fur.getFid() %>" disabled/></td>
		</tr>
		<tr>
			<td align="right">家具名称：</td>
			<td><input type="text" name="fname" size="12" value="<%=fur.getFname() %>" /></td>
		</tr>
		<tr>
			<td align="right">简介：</td>
			<td><input type="text" name="fsummary" size="12" value="<%=fur.getFsummary()%>"/></td>
		</tr>
		<tr>
			<td align="right">家具数量：</td>
			<td><input type="text" name="fnum" size="12" value="<%=fur.getFnum() %>" /></td>
		</tr>
		<tr>
			<td align="right">家具价格：</td>
			<td><input type="text" name="fprice" size="12" value="<%=fur.getFprice() %>"/></td>
		</tr>
		<tr>
			<td align="right">家具图片：</td>
			<td><input type="text" name="fpic" size="12" value="<%=fur.getFpic() %>" disabled/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><img src="../image/<%=fur.getFpic() %>" height="100" width="100"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="修改" value="修改"/>
				<input type="reset" name="重置"/>
			</td>
		</tr>
	</table>
	</form>
	<%} %>
	<%}catch(Exception e){
	e.printStackTrace();
	} %>
</body>
</html>