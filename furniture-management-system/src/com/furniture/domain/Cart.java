package com.furniture.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {

	private Map<Integer, CartItem> map = new LinkedHashMap<>();
	private double price;
	
	public void add(Furniture furniture){
		
		CartItem item = map.get(furniture.getFid());
		
		if(item != null){
			item.setQuantity(item.getQuantity()+1);
			System.out.println(item.getFurniture().getFid());
		}else{
			CartItem cartItem = new CartItem();
			cartItem.setFurniture(furniture);
			cartItem.setQuantity(1);
			map.put(furniture.getFid(), cartItem);
		}
		
	}
	

	
	/**
	 * @return the map
	 */
	public Map<Integer, CartItem> getMap() {
		return map;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap(Map<Integer, CartItem> map) {
		this.map = map;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		double totalprice = 0 ;
		for(Map.Entry<Integer,CartItem> me:map.entrySet()){
			CartItem item = me.getValue();
			totalprice = totalprice + item.getPrice();
		}
		return totalprice;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
