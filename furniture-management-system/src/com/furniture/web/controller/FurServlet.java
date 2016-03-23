package com.furniture.web.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

import com.furniture.dao.impl.FurnitureDaoImpl;
import com.furniture.domain.Furniture;

public class FurServlet extends HttpServlet {
	
	private List<Furniture> furList;
	
	public FurServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		req.setCharacterEncoding("utf-8");
		String action = req.getParameter("action");
		String id = req.getParameter("id");
		
		switch (action) {
		
		case "add":
			System.out.println("SUCCESS!");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			Date date = new Date();
			String newFilename = new String();
			System.out.println(req.getParameter("fpic"));
			if(req.getParameter("fpic").equals(""))
				newFilename="empty";
			else if(!req.getParameter("fpic").substring(req.getParameter("fpic").length()-2, req.getParameter("fpic").length()).equals("jpg")){
				req.getRequestDispatcher("error.jsp").forward(req, resp);
				return;
			}
			else
				newFilename = sdf1.format(date)+".jpg";
			System.out.println(newFilename);
			
			Furniture fur = new Furniture();
			fur.setFname(req.getParameter("fname"));
			fur.setFsummary(req.getParameter("fsummary"));
			fur.setFnum(Integer.parseInt(req.getParameter("fnum")));
			fur.setFprice(Double.parseDouble(req.getParameter("fprice")));
			fur.setFpic(newFilename);
			FurnitureDaoImpl furDaoImpl1 = new FurnitureDaoImpl();
			furDaoImpl1.AddFurniture(fur);
			
			//上传文件
			if(!newFilename.equals("empty")){
				String realpath = getServletContext().getRealPath("/image");
				System.out.println("realpath->"+realpath);
				File file = new File(req.getParameter("fpic"));
				if(file!=null){
					File saveDir = new File(realpath);
					if(!saveDir.exists())
						saveDir.mkdirs();
					File saveFile = new File(saveDir,newFilename);
					try{
						FileUtils.copyFile(file, saveFile);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			
			break;
			
		case "manage":
			FurnitureDaoImpl furDaoImpl2 = new FurnitureDaoImpl();
			if(furList!=null)
				furList.clear();
			furList = furDaoImpl2.getAllFur();
			System.out.println(furList.size());
			if(furList.size()!=0){
				req.setAttribute("furList", furList);
				req.getRequestDispatcher("/furniture/furmanage.jsp").forward(req, resp);
			}
			break;
			
		case "select":
			FurnitureDaoImpl furDaoImpl3 = new FurnitureDaoImpl();
			System.out.println("select");
			if(furList!=null)
				furList.clear();
			furList = furDaoImpl3.getDetail(req.getParameter("id"));
			if(furList.size()!=0){
				req.setAttribute("furList", furList);
				req.getRequestDispatcher("/furniture/update.jsp").forward(req, resp);
			}
			else
				req.getRequestDispatcher("error.jsp").forward(req, resp);
			break;
		
		case "update":
			Furniture fur2 = new Furniture();
			FurnitureDaoImpl furDaoImpl4 = new FurnitureDaoImpl();
			fur2.setFid(Integer.parseInt(req.getParameter("fid")));
			fur2.setFname(req.getParameter("fname"));
			fur2.setFsummary(req.getParameter("fsummary"));
			fur2.setFnum(Integer.parseInt(req.getParameter("fnum")));
			fur2.setFprice(Double.parseDouble(req.getParameter("fprice")));
			fur2.setFpic(req.getParameter("fpic"));
			furDaoImpl4.UpdateFurniture(fur2);
			break;
			
		case "delete":
			System.out.println("delete");
			Furniture fur3 = new Furniture();
			FurnitureDaoImpl furDaoImpl5 = new FurnitureDaoImpl();
			fur3.setFid(Integer.parseInt(req.getParameter("id")));
			furDaoImpl5.DeleteFurniture(fur3);
			break;
			
		case "detail":
			FurnitureDaoImpl furDaoImpl6 = new FurnitureDaoImpl();
			furList.clear();
			furList = furDaoImpl6.getDetail(id);
			if(furList.size()!=0){
				req.setAttribute("furList",furList);
				req.getRequestDispatcher("/furniture/detail.jsp").forward(req, resp);
				return;
			}
			else{
				System.out.println("error");
				req.getRequestDispatcher("error.jsp").forward(req,resp);
				return;
			}
		

		default:
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
