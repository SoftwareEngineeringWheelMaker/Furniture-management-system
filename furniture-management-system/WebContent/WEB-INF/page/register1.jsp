<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 	private String cname;
	private String cpassword;
	private String ctel;
	private double cmoney; -->
	<form action="${pageContext.request.contextPath}/servlet/RegisterServlet" method="post">
		用户名：<input type="text" name="cname" value="${formBean.cname }">${formBean.errors.cname }<br>
		密码：<input type="password" name="cpassword" value="${formBean.cpassword }">${formBean.errors.cpassword }<br>
		请确认密码：<input type="password" name="cpassword2"value="${formBean.cpassword2 }">${formBean.errors.cpassword2 }<br>
		请输入电话号码：<input type="text" name="ctel"value="${formBean.ctel }">${formBean.errors.ctel }<br>
		请输入金额：<input type="text" name="cmoney"value="${formBean.cmoney }">${formBean.errors.cmoney }<br>
		<input type="submit" value="注 册">
	</form>
</body>
</html>