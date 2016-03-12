package com.furniture.domain;
/**
 * 
 * Consumer.java<code>{Consumer}</code>{用户表}
 * 
 * @author Raindrops
 * @version 2016.03.04
 *
 */
public class Consumer {
	private int cid; //主键
	private String cname; //用户名
	private String cpassword;//密码
	private String ctel;//手机号
	private int cmoney;//金额
	private int ostatus;//角色
	
	
	
	
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Consumer(String cname, String cpassword, String ctel, int cmoney, int ostatus) {
		super();

		this.cname = cname;
		this.cpassword = cpassword;
		this.ctel = ctel;
		this.cmoney = cmoney;
		this.ostatus = ostatus;
	}


	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the cpassword
	 */
	public String getCpassword() {
		return cpassword;
	}
	/**
	 * @param cpassword the cpassword to set
	 */
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	/**
	 * @return the ctel
	 */
	public String getCtel() {
		return ctel;
	}
	/**
	 * @param ctel the ctel to set
	 */
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	/**
	 * @return the cmoney
	 */
	public int getCmoney() {
		return cmoney;
	}
	/**
	 * @param cmoney the cmoney to set
	 */
	public void setCmoney(int cmoney) {
		this.cmoney = cmoney;
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
