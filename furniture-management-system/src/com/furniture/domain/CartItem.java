package com.furniture.domain;

//CartItem 代表某本书和书的出现个数
public class CartItem {

	private Furniture furniture;
	private int quantity;
	private double price;
	
	
	
	

	/**
	 * @return the furniture
	 */
	public Furniture getFurniture() {
		return furniture;
	}
	/**
	 * @param furniture the furniture to set
	 */
	public void setFurniture(Furniture furniture) {
		this.furniture = furniture;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return (furniture.getFprice()*this.quantity) ;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
