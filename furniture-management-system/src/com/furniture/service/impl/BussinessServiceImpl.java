package com.furniture.service.impl;

import java.util.List;

import com.furniture.dao.impl.ConsumerDaoImpl;
import com.furniture.dao.impl.FurnitureDaoImpl;
import com.furniture.domain.Cart;
import com.furniture.domain.Consumer;
import com.furniture.domain.Furniture;
import com.furniture.domain.Page;
import com.furniture.exception.CartNotFoundException;
import com.furniture.exception.UserExistException;




public class BussinessServiceImpl {
	ConsumerDaoImpl cdao = new ConsumerDaoImpl();
	FurnitureDaoImpl fdao = new FurnitureDaoImpl();
	/**
	 * 注册用户
	 * @param consumer
	 * @throws UserExistException
	 */
	public void register(Consumer consumer) throws UserExistException{
		if (cdao.getConsumerByCname(consumer.getCname())!=null) {
			throw new UserExistException("用户名已经存在了！");
		}
			cdao.AddConsumer(consumer);
	}
	
	/**
	 * 用户登录
	 * @param cname
	 * @param cpassword
	 * @return
	 */
	public Consumer login(String cname,String cpassword){
			return cdao.getOneConsumer(cname, cpassword);
	}
	
	/**
	 * 得到家具分页数据
	 * @param pagenum
	 * @param pagenum1
	 * @param pagecount
	 * @return
	 */
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
	/**
	 * 买家具
	 * @param furnitureid
	 * @param cart
	 */
	public void buyFurniture(String furnitureid,Cart cart){	
		List<Furniture> furnitures= fdao.getDetail(furnitureid);
		for (Furniture furniture2 : furnitures) {
			Furniture furniture = furniture2;
			//System.out.println(furniture.getFid());
			cart.add(furniture);
		}
	}
	/**
	 * 清空购物车
	 * @param cart
	 * @throws CartNotFoundException
	 */
	public void clearCart(Cart cart) throws CartNotFoundException {
		if (cart==null) {
			throw new CartNotFoundException("购物车为空。");
		}
		cart.getMap().clear();
		cart.setPrice(0);
	}
	/**
	 * 修改购物车商品数量
	 * @param cart
	 * @param furnitureid
	 * @param quantity
	 * @throws CartNotFoundException
	 */
	public void updateCart(Cart cart, String furnitureid, int quantity) throws CartNotFoundException {
		if (cart == null ) {
			throw new CartNotFoundException("购物车为空.");
		}
		cart.getMap().get(Integer.parseInt(furnitureid)).setQuantity(quantity);
	}
	/**
	 * 删除购物车的商品
	 * @param furnitureid
	 * @param cart
	 * @throws CartNotFoundException
	 */
	public void delCartFurniture(String furnitureid,Cart cart) throws CartNotFoundException{
		
		if(cart == null){
			throw new CartNotFoundException("购物车为空。");
		}
		
		cart.getMap().remove(Integer.parseInt(furnitureid));
		
	}
}
