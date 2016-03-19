package com.furniture.service.impl;

import com.furniture.dao.impl.ConsumerDaoImpl;
import com.furniture.domain.Consumer;
import com.furniture.exception.ConsumerDaoException;
import com.furniture.exception.UserExistException;

public class BussinessServiceImpl {
	ConsumerDaoImpl cdao = new ConsumerDaoImpl();
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
}
