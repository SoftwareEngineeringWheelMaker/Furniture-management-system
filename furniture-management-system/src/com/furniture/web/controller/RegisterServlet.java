package com.furniture.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.furniture.domain.Consumer;
import com.furniture.exception.UserExistException;
import com.furniture.formbean.RegisterFormBean;
import com.furniture.service.impl.BussinessServiceImpl;
import com.furniture.utils.WebUtils;

public class RegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		RegisterFormBean formBean = WebUtils.request2bean(req, RegisterFormBean.class);
		if(formBean.validate()==false){
			req.setAttribute("formBean",formBean );
			req.getRequestDispatcher("/WEB-INF/page/register.jsp").forward(req, resp);	
			return ;
		}
		//把表单填充到bean中
		Consumer consumer = new Consumer();
		try {
			BeanUtils.copyProperties(consumer, formBean);
			BussinessServiceImpl service = new BussinessServiceImpl();
			service.register(consumer);
			
			req.setAttribute("message", "注册成功!");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
			
		} catch (UserExistException e) {
			req.setAttribute("message", "用户已经存在。");
			req.setAttribute("formBean", formBean);
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
		}catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("message", "系统繁忙。");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
