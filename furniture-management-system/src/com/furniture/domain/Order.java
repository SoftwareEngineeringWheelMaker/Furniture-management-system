package com.furniture.domain;
/**
 * 
 * Order.java<code>{Order}</code>{订单类}
 * 
 * @author Raindrops
 * @version 2016.03.04
 *
 */
public class Order {
	private int orderID;
	private int bnumber;//品种数
	private String username;//用户名
	private String Truename;//真实姓名
	private String address;//联系地址
	private String OrderDate;//订单日期
	private int enforce;//是否实行
	private String bz;//备注
	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}
	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	/**
	 * @return the bnumber
	 */
	public int getBnumber() {
		return bnumber;
	}
	/**
	 * @param bnumber the bnumber to set
	 */
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the truename
	 */
	public String getTruename() {
		return Truename;
	}
	/**
	 * @param truename the truename to set
	 */
	public void setTruename(String truename) {
		Truename = truename;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return OrderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	/**
	 * @return the enforce
	 */
	public int getEnforce() {
		return enforce;
	}
	/**
	 * @param enforce the enforce to set
	 */
	public void setEnforce(int enforce) {
		this.enforce = enforce;
	}
	/**
	 * @return the bz
	 */
	public String getBz() {
		return bz;
	}
	/**
	 * @param bz the bz to set
	 */
	public void setBz(String bz) {
		this.bz = bz;
	}
	
	
}
