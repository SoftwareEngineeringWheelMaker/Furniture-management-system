package com.furniture.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.furniture.domain.Cart;
import com.furniture.exception.CartNotFoundException;
import com.furniture.service.impl.BussinessServiceImpl;



public class ClearCartServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException {
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		
		BussinessServiceImpl bussinessService = new BussinessServiceImpl();
		try {
			bussinessService.clearCart(cart);
			req.getRequestDispatcher("/WEB-INF/page/listcart.jsp").forward(req, resp);
		} catch (CartNotFoundException e) {
			req.setAttribute("message", "购物车为空。");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
