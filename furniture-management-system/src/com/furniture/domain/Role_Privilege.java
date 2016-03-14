package com.furniture.domain;

public class Role_Privilege {
	private int role_id;
	private int privilege_id;
	public Role_Privilege() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role_Privilege(int role_id, int privilege_id) {
		super();
		this.role_id = role_id;
		this.privilege_id = privilege_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getPrivilege_id() {
		return privilege_id;
	}
	public void setPrivilege_id(int privilege_id) {
		this.privilege_id = privilege_id;
	}
	
}
