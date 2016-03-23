package com.furniture.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.domain.Cart;
import com.furniture.service.impl.BussinessServiceImpl;



public class BuyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String furnitureid = req.getParameter("id");
		
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		
		if (cart == null) {
			cart = new Cart();
			req.getSession().setAttribute("cart", cart);
		}
		
		BussinessServiceImpl service = new BussinessServiceImpl();
		service.buyFurniture(furnitureid, cart);
		
		req.getRequestDispatcher("/WEB-INF/page/listcart.jsp").forward(req, resp);	
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
