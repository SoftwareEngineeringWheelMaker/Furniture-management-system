package com.furniture.domain;
/**
 * 
 * Order_detail.java<code>{Order_detail}</code>{订单详情类}
 * 
 * @author Raindrops
 * @version 2016.03.04
 *
 */
public class Order_detail {
	private int ID;
	private int orderID;
	private int goodsID;
	private int price;
	private int number;
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
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
	 * @return the goodsID
	 */
	public int getGoodsID() {
		return goodsID;
	}
	/**
	 * @param goodsID the goodsID to set
	 */
	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
