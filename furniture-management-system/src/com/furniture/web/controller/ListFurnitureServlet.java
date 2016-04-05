package com.furniture.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.domain.Page;
import com.furniture.service.impl.BussinessServiceImpl;



public class ListFurnitureServlet extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		try {
			String pagenum = req.getParameter("pagenum");
			BussinessServiceImpl service = new BussinessServiceImpl();
			Page page = service.getPageData(pagenum,2,10);
			req.setAttribute("page", page);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		} catch (Exception e) {
			req.setAttribute("message", "查询失败");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
		}
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
