package com.furniture.dao.impl;

import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.furniture.domain.Operator;
import com.furniture.exception.OperatorDaoException;
import com.furniture.utils.JdbcUtils;

public class OperatorDaoImpl {
	public void AddOperator(Operator operator) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "insert into operator(oname,opassword) values(?,?)";
			Object[] params = new Object[] {operator.getOname(),operator.getOpassword()};
			runner.update(sql, params);
		} catch (Exception e) {
			throw new OperatorDaoException(e);
		}
	}

	public void DeleteOperator(Operator operator) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "delete from operator where oid=?";
			runner.update(sql,operator.getOid());
		} catch (Exception e) {
			throw new OperatorDaoException(e);
		}
	}

	public void UpdateOperator(Operator operator) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "update operator set oname=?,opassword=? where oid=?";
			Object[] params = new Object[] {operator.getOname(),operator.getOpassword(),operator.getOid()};
			runner.update(sql, params);
		} catch (Exception e) {
			throw new OperatorDaoException(e);
		}
	}

	public List<Operator> getOperator(Operator operator) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "select * from operator where oid=?";
			List<Operator> operator1 = runner.query(sql, new BeanListHandler<>(Operator.class),operator.getOid());
			return operator1;
		} catch (Exception e) {
			throw new OperatorDaoException(e);
		}
	}
}
