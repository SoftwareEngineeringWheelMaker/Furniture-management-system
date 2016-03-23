<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增家具</title>
</head>
<body>
	<form name="addfur" method="post" action="../servlet/FurServlet" >
	<input type="hidden" id="action" name="action" value="add"/>
	<table>
		<tr>
			<td align="right">家具名称：</td>
			<td><input type="text" name="fname" size="12" /></td>
		</tr>
		<tr>
			<td align="right">简介：</td>
			<td><input type="text" name="fsummary" size="12" /></td>
		</tr>
		<tr>
			<td align="right">家具数量：</td>
			<td><input type="text" name="fnum" size="12" /></td>
		</tr>
		<tr>
			<td align="right">家具价格：</td>
			<td><input type="text" name="fprice" size="12" /></td>
		</tr>
		<tr>
			<!-- 上传组件，待修改 -->
			<td align="right">家具图片：</td>
			<td><input type="file" name="fpic" size="12" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="添加" value="添加"/>
				<input type="reset" name="重置"/>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>