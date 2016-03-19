package com.furniture.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.domain.Consumer;
import com.furniture.service.impl.BussinessServiceImpl;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String cname = req.getParameter("cname");
		String cpassword = req.getParameter("cpassword");
		
		BussinessServiceImpl service = new BussinessServiceImpl();
		Consumer consumer = service.login(cname, cpassword);
		
		if (consumer == null) {
			req.setAttribute("message", "对不起，用户名或密码有误。");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
			return ;
		}
		else{
			req.getSession().setAttribute("consumer", consumer);
			req.setAttribute("message", "恭喜:"+consumer.getCname()+"，登录成功。本页面将在5秒后跳转到主页<meta http-equiv='refresh' content='5;url="+getServletContext().getContextPath()+"/index.jsp'/>，如果没有跳转请点击<a href='"+getServletContext().getContextPath()+"/index.jsp'>这里</a>");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
			return ;
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
