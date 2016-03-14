package com.furniture.dao.impl;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.furniture.domain.Oorder;
import com.furniture.exception.OorderDaoException;
import com.furniture.utils.JdbcUtils;

public class OorderDaoImpl {
	public void AddOorder(Oorder order) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "insert into oorder(cid,fid,truename,address,orderdate,enforce,remark) values(?,?,?,?,?,?,?)";
			Object[] params = new Object[] {order.getCid(),order.getFid(),order.getTruename(),order.getAddress(),order.getOrderdate(),order.getEnforce(),order.getRemark()};
			runner.update(sql, params);
		} catch (Exception e) {
			throw new OorderDaoException(e);
		}
	}

	public void DeleteOorder(Oorder order) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "delete from oorder where oorderid=?";
			runner.update(sql,order.getOorderid() );
		} catch (Exception e) {
			throw new OorderDaoException(e);
		}
	}

	public void UpdateOorder(Oorder order) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "update oorder set cid=?,fid=?,truename=?,address=?,orderdate=?,enforce=?,remark=? where oorderid=?";
			Object[] params = new Object[] {order.getCid(),order.getFid(),order.getTruename(),order.getAddress(),order.getOrderdate(),order.getEnforce(),order.getRemark(),order.getOorderid()};
			runner.update(sql, params);
		} catch (Exception e) {
			throw new OorderDaoException(e);
		}
	}

	public List<Oorder> getOorder(Oorder order) {
		try {
			QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
			String sql = "select * from order where oorderid=?";
			List<Oorder> order1 = runner.query(sql, new BeanListHandler<>(Oorder.class),order.getOorderid());
			return order1;
		} catch (Exception e) {
			throw new OorderDaoException(e);
		}
	}
}
