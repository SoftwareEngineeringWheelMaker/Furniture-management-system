package com.furniture.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.furniture.domain.Placard;
import com.furniture.exception.PlacardDaoException;
import com.furniture.utils.JdbcUtils;

public class PlacardDaoImpl {
	public void AddPlacard(Placard placard) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "insert into placard(title,content) values(?,?)";
			Object[] params = new Object[] {placard.getTitle(),placard.getContent()};
			runner.update(sql, params);
		} catch (Exception e) {
			throw new PlacardDaoException(e);
		}
	}

	public void DeletePlacard(Placard placard) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "delete from placard where pid=?";
			runner.update(sql,placard.getPid());
		} catch (Exception e) {
			throw new PlacardDaoException(e);
		}
	}

	public void UpdatePlacard(Placard placard) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "update placard set title=?,content=? where pid=?";
			Object[] params = new Object[] {placard.getTitle(),placard.getContent(),placard.getPid()};
			runner.update(sql, params);
		} catch (Exception e) {
			throw new PlacardDaoException(e);
		}
	}

	public List<Placard> getPlacard(Placard placard) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "select * from placard where pid=?";
			List<Placard> placard1 = runner.query(sql, new BeanListHandler<>(Placard.class),placard.getPid());
			return placard1;
		} catch (Exception e) {
			throw new PlacardDaoException(e);
		}
	}
}
