package com.furniture.domain;
/**
 * 
 * Operator.java<code>{Operator}</code>{操作员类}
 * 
 * @author Raindrops
 * @version 2016.03.04
 *
 */
public class Operator {
	private int oid;
	private String opassword; //密码
	private String oname;//姓名
	private int ostatus;//角色
	/**
	 * @return the oid
	 */
	public int getOid() {
		return oid;
	}
	/**
	 * @param oid the oid to set
	 */
	public void setOid(int oid) {
		this.oid = oid;
	}
	/**
	 * @return the opassword
	 */
	public String getOpassword() {
		return opassword;
	}
	/**
	 * @param opassword the opassword to set
	 */
	public void setOpassword(String opassword) {
		this.opassword = opassword;
	}
	/**
	 * @return the oname
	 */
	public String getOname() {
		return oname;
	}
	/**
	 * @param oname the oname to set
	 */
	public void setOname(String oname) {
		this.oname = oname;
	}
	/**
	 * @return the ostatus
	 */
	public int getOstatus() {
		return ostatus;
	}
	/**
	 * @param ostatus the ostatus to set
	 */
	public void setOstatus(int ostatus) {
		this.ostatus = ostatus;
	}
	
	
}
