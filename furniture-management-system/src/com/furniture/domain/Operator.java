package com.furniture.domain;

public class Operator {
	/**
	 * oid:操作员编号
	 * oname:用户名
	 * opassword:密码
	 */
	private int oid;
	private String oname;
	private String opassword;
	public Operator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operator(int oid, String oname, String opassword) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.opassword = opassword;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getOpassword() {
		return opassword;
	}
	public void setOpassword(String opassword) {
		this.opassword = opassword;
	}
	
}
