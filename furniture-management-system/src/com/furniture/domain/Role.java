package com.furniture.domain;

public class Role {
	private int rid;
	private String name;
	private String description;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int rid, String name, String description) {
		super();
		this.rid = rid;
		this.name = name;
		this.description = description;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
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
