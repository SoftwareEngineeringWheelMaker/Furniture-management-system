package com.furniture.domain;

import java.sql.Date;

public class Oorder {
	/**
	 * oorderid:订单编号
	 * cid:用户编号
	 * fid:家具编号
	 * truename:真实姓名
	 * address:地址
	 * orderdate:下单时间
	 * enforce:是否执行
	 * remark:备注
	 */
	private int oorderid;
	private int cid;
	private int fid;
	private String truename;
	private String address;
	private Date orderdate;
	private int enforce;
	private String remark;
	public Oorder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Oorder(int oorderid, int cid, int fid, String truename, String address, Date orderdate, int enforce,
			String remark) {
		super();
		this.oorderid = oorderid;
		this.cid = cid;
		this.fid = fid;
		this.truename = truename;
		this.address = address;
		this.orderdate = orderdate;
		this.enforce = enforce;
		this.remark = remark;
	}
	public int getOorderid() {
		return oorderid;
	}
	public void setOorderid(int oorderid) {
		this.oorderid = oorderid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public int getEnforce() {
		return enforce;
	}
	public void setEnforce(int enforce) {
		this.enforce = enforce;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
