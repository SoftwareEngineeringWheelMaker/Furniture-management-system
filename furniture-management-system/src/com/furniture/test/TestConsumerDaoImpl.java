package com.furniture.test;

import java.util.List;

import org.junit.Test;

import com.furniture.dao.impl.ConsumerDaoImpl;
import com.furniture.domain.Consumer;

public class TestConsumerDaoImpl {
	@Test
	public void TestGetAllConsumer(){
		ConsumerDaoImpl daoImpl = new ConsumerDaoImpl();
		List<Consumer> consumers = daoImpl.getAllConsumer();
		System.out.println(consumers.size());
	}
	@Test
	public void TestAddConsumer(){
		Consumer consumer = new Consumer(123123, "asdf", "sadffasd", "12344", 555);
		ConsumerDaoImpl daoImpl = new ConsumerDaoImpl();
		daoImpl.AddConsumer(consumer);
	}
	@Test
	public void TestDeleteConsumer(){
		Consumer consumer = new Consumer();
		consumer.setCid(11);
		ConsumerDaoImpl daoImpl = new ConsumerDaoImpl();
		daoImpl.DeleteConsumer(consumer);
	}
	@Test
	public void TestUpdateConsumer(){
		Consumer consumer = new Consumer(123123, "asdf", "sadffasd", "12344", 555);
		consumer.setCid(9);
		ConsumerDaoImpl daoImpl = new ConsumerDaoImpl();
		daoImpl.UpdateConsumer(consumer);
	}
}
