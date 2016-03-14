package com.furniture.domain;

public class Consumer {
	/**
	 * cid:用户编号
	 * cname:用户名
	 * cpassword:用户密码
	 * ctel:用户电话
	 * cmoney:金额
	 */
	private int cid;
	private String cname;
	private String cpassword;
	private String ctel;
	private double cmoney;
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumer(int cid, String cname, String cpassword, String ctel, double cmoney) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpassword = cpassword;
		this.ctel = ctel;
		this.cmoney = cmoney;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getCtel() {
		return ctel;
	}
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	public double getCmoney() {
		return cmoney;
	}
	public void setCmoney(double cmoney) {
		this.cmoney = cmoney;
	}
	
}
