package com.furniture.domain;
/**
 * 
 * furniture.java<code>{furniture}</code>{家具类}
 * 
 * @author Raindrops
 * @version 2016.03.04
 *
 */
public class Furniture {
	private int fid;
	private String fname; //名称
	private String fsummary;//概要
	private int fnum;//数量
	private int fmoney;//单价
	private String fpic;//图片
	
	/**
	 * @return the fid
	 */
	public int getFid() {
		return fid;
	}
	/**
	 * @param fid the fid to set
	 */
	public void setFid(int fid) {
		this.fid = fid;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the fsummary
	 */
	public String getFsummary() {
		return fsummary;
	}
	/**
	 * @param fsummary the fsummary to set
	 */
	public void setFsummary(String fsummary) {
		this.fsummary = fsummary;
	}
	/**
	 * @return the fnum
	 */
	public int getFnum() {
		return fnum;
	}
	/**
	 * @param fnum the fnum to set
	 */
	public void setFnum(int fnum) {
		this.fnum = fnum;
	}
	/**
	 * @return the fmoney
	 */
	public int getFmoney() {
		return fmoney;
	}
	/**
	 * @param fmoney the fmoney to set
	 */
	public void setFmoney(int fmoney) {
		this.fmoney = fmoney;
	}
	/**
	 * @return the fpic
	 */
	public String getFpic() {
		return fpic;
	}
	/**
	 * @param fpic the fpic to set
	 */
	public void setFpic(String fpic) {
		this.fpic = fpic;
	}
	
	
}
