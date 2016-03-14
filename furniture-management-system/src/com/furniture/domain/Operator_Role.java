package com.furniture.domain;

public class Operator_Role {
	private int operator_id;
	private int role_id;
	public Operator_Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operator_Role(int operator_id, int role_id) {
		super();
		this.operator_id = operator_id;
		this.role_id = role_id;
	}
	public int getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
}
