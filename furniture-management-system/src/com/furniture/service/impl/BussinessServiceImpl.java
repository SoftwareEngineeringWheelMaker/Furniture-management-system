package com.furniture.service.impl;

import java.util.List;

import com.furniture.dao.impl.ConsumerDaoImpl;
import com.furniture.dao.impl.FurnitureDaoImpl;
import com.furniture.domain.Cart;
import com.furniture.domain.Consumer;
import com.furniture.domain.Furniture;
import com.furniture.domain.Page;
import com.furniture.exception.UserExistException;



public class BussinessServiceImpl {
	ConsumerDaoImpl cdao = new ConsumerDaoImpl();
	FurnitureDaoImpl fdao = new FurnitureDaoImpl();
	//注册用户
	public void register(Consumer consumer) throws UserExistException{
		if (cdao.getConsumerByCname(consumer.getCname())!=null) {
			throw new UserExistException("用户名已经存在了！");
		}
			cdao.AddConsumer(consumer);
	}
	
	//用户登录
	public Consumer login(String cname,String cpassword){
			return cdao.getOneConsumer(cname, cpassword);
	}
	
	//得到家具分页数据
	public Page getPageData(String pagenum,int pagenum1,int pagecount){
		
		int totalrecord = fdao.getTotalrecord();
		
		if (pagenum == null) {
			//代表用户想看那页的数据
			Page page =new Page(totalrecord, 1,pagecount); //算出总页数，以及用户想看的页从哪个地方开始
			List list = fdao.getPageData(page.getStartindex(), page.getPagesize());
			page.setList(list);
			return page;
		}else{
			//代表用户想看指定的页
			Page page = new Page(totalrecord, Integer.parseInt(pagenum),pagecount);
			List list = fdao.getPageData(page.getStartindex(), page.getPagesize());
			page.setList(list);
			return page;
		}

	}
	//买家具
	public void buyFurniture(String furnitureid,Cart cart){	
		List<Furniture> furnitures= fdao.getDetail(furnitureid);
		for (Furniture furniture2 : furnitures) {
			Furniture furniture = furniture2;
			System.out.println(furniture.getFid());
			cart.add(furniture);
		}
	}
}
