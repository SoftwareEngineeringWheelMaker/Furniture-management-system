package com.furniture.domain;

public class Furniture {
	/**
	 * fid:家具编号
	 * fname:家具名称
	 * fsummary:概要
	 * fnum:数量
	 * fprice:单价
	 * fpic:图片
	 */
	private int fid;
	private String fname;
	private String fsummary;
	private int fnum;
	private double fprice;
	private String fpic;
	public Furniture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Furniture(int fid, String fname, String fsummary, int fnum, double fprice, String fpic) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fsummary = fsummary;
		this.fnum = fnum;
		this.fprice = fprice;
		this.fpic = fpic;
	}
	public Furniture( String fname, String fsummary, int fnum, double fprice, String fpic) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fsummary = fsummary;
		this.fnum = fnum;
		this.fprice = fprice;
		this.fpic = fpic;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFsummary() {
		return fsummary;
	}
	public void setFsummary(String fsummary) {
		this.fsummary = fsummary;
	}
	public int getFnum() {
		return fnum;
	}
	public void setFnum(int fnum) {
		this.fnum = fnum;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	public String getFpic() {
		return fpic;
	}
	public void setFpic(String fpic) {
		this.fpic = fpic;
	}
	
}
