package com.furniture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.furniture.domain.Placard;
import com.furniture.dao.impl.PlacardDaoImpl;
/**
 * Servlet implementation class PlacardServlet
 */
@WebServlet("/PlacardServlet")
public class PlacardServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlacardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		//发布公告
		if(action.equals("add")){
			Placard pla =new Placard();
			request.setCharacterEncoding("utf-8");
			pla.setTitle(request.getParameter("title"));
			pla.setContent(request.getParameter("content"));
			PlacardDaoImpl daoImpl=new PlacardDaoImpl();
			daoImpl.AddPlacard(pla);
			//PrintWriter out1=response.getWriter();
			//out1.println("<script language='javascript'>alert('发布成功'！);</script>");
			request.getRequestDispatcher("placard.jsp").forward(request,response);
		}
		//按title查找公告
		else if(action.equals("selectbytitle")){
			request.setCharacterEncoding("utf-8");
			PlacardDaoImpl daoImpl1=new PlacardDaoImpl();
			System.out.println(request.getParameter("title"));
			List<Placard> placard1 =daoImpl1.getPlacard(request.getParameter("title"));
			if(placard1.size()!=0){
				request.setAttribute("placard1", placard1);
				request.getRequestDispatcher("iterator.jsp").forward(request,response);
			}
			else{
				request.getRequestDispatcher("error.jsp").forward(request,response);
			}
		}
		//获得所有公告
		else if(action.equals("getall")){
			Placard pla2 =new Placard();
			request.setCharacterEncoding("utf-8");
			PlacardDaoImpl daoImpl2=new PlacardDaoImpl();
			List<Placard> placard1 =daoImpl2.getAllPlacard();
			if(placard1.size()!=0){
				request.setAttribute("placard1", placard1);
				request.getRequestDispatcher("iterator.jsp").forward(request,response);
			}
		}
		else if(action.equals("delete")){//删除公告
			PlacardDaoImpl daoImpl3=new PlacardDaoImpl();
			daoImpl3.DeletePlacard(Integer.parseInt(request.getParameter("pid3")));
			request.getRequestDispatcher("iterator.jsp").forward(request,response);
		}
		else if(action.equals("update")){//更新公告
			Placard pla3 =new Placard();
			request.setCharacterEncoding("utf-8");
			pla3.setTitle(request.getParameter("title1"));
			pla3.setContent(request.getParameter("content1"));
			pla3.setPid(Integer.parseInt(request.getParameter("id")));
			System.out.println(request.getParameter("content1"));
			PlacardDaoImpl daoImpl4=new PlacardDaoImpl();
			daoImpl4.UpdatePlacard(pla3);
		}
		else if(action.equals("selectbyid")){
			request.setCharacterEncoding("utf-8");
			PlacardDaoImpl daoImpl4=new PlacardDaoImpl();
			List<Placard> placard4 =daoImpl4.getPlacardById(Integer.parseInt(request.getParameter("pid2")));
			if(placard4.size()!=0){
				request.setAttribute("placard4", placard4);
				request.getRequestDispatcher("detail.jsp").forward(request,response);
			}
		}
	}		
}
