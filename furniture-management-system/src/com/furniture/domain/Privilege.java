package com.furniture.domain;

public class Privilege {
	private int prid;
	private String name;
	private String description;
	public Privilege() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Privilege(int prid, String name, String description) {
		super();
		this.prid = prid;
		this.name = name;
		this.description = description;
	}
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
