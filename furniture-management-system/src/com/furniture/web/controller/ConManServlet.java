package com.furniture.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.dao.impl.ConsumerDaoImpl;
import com.furniture.domain.Consumer;

public class ConManServlet extends HttpServlet {

	private List<Consumer> conList;
	
	public ConManServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		req.setCharacterEncoding("utf-8");
		
		ConsumerDaoImpl conDaoImpl = new ConsumerDaoImpl();
		if(conList!=null)
			conList.clear();
		conList = conDaoImpl.getAllConsumer();
		System.out.println(conList.size());
		if(conList.size()!=0){
			req.setAttribute("conList", conList);
			req.getRequestDispatcher("/WEB-INF/page/conman.jsp").forward(req, resp);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

}
