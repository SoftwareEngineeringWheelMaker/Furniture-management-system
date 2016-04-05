package com.furniture.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.dao.impl.ConsumerDaoImpl;
import com.furniture.domain.Consumer;

public class DeleteConServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("delete");
		Consumer con = new Consumer();
		ConsumerDaoImpl conDaoImpl = new ConsumerDaoImpl();
		con.setCid(Integer.parseInt(req.getParameter("id")));
		conDaoImpl.DeleteConsumer(con);
		req.getRequestDispatcher("/success.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	

}
