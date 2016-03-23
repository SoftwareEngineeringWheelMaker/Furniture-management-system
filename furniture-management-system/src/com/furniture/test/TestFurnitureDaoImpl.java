package com.furniture.test;

import java.util.List;

import org.junit.Test;

import com.furniture.dao.impl.FurnitureDaoImpl;
import com.furniture.domain.Furniture;

public class TestFurnitureDaoImpl {
	FurnitureDaoImpl daoImpl = new FurnitureDaoImpl();
	@Test
	public void testAddFurniture(){
		Furniture furniture = new Furniture("哦asasd哦", "a asd", 12, 33, "asdf");
		daoImpl.AddFurniture(furniture);
	}
	@Test
	public void testGetPageData(){
		List<Furniture> furnitures = daoImpl.getPageData(2, 3);
		for (Furniture furniture : furnitures) {
			System.out.println(furniture.getFname());
		}
	}
	@Test
	public void testGetTotalrecord(){
		System.out.println(daoImpl.getTotalrecord());
	}
}
