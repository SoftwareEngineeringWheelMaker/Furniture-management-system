package com.furniture.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.furniture.domain.Consumer;
import com.furniture.exception.ConsumerDaoException;
import com.furniture.utils.JdbcUtils;

public class ConsumerDaoImpl {
	public List<Consumer> getAllConsumer(){
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "select * from consumer";
			List<Consumer> consumers = runner.query(sql, new BeanListHandler<>(Consumer.class));
			return consumers;
		} catch (Exception e) {
			throw new ConsumerDaoException(e);
		}
	}
	public void AddConsumer(Consumer consumer){
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "insert into consumer(cname,cpassword,ctel,cmoney,ostatus) values(?,?,?,?,?)";
			Object[] params = new Object[]{consumer.getCname(),consumer.getCpassword(),consumer.getCtel(),consumer.getCmoney(),consumer.getOstatus()};
			runner.update(sql, params);
		} catch (Exception e) {
			throw new ConsumerDaoException(e);
		}
	}
	
	public void DeleteConsumer(Consumer consumer){
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "delete from consumer where cid=?";
			runner.update(sql, consumer.getCid());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void UpdateConsumer(Consumer consumer){
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "update consumer set cname=?,cpassword=?,ctel=?,cmoney=?,ostatus=? where cid=?";
			Object[] params = new Object[]{consumer.getCname(),consumer.getCpassword(),consumer.getCtel(),consumer.getCmoney(),consumer.getOstatus(),consumer.getCid()};
			runner.update(sql, params);
		} catch (Exception e) {
			throw new ConsumerDaoException(e);
		}
	}
	
}
