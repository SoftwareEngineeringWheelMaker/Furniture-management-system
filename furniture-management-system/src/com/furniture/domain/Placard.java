package com.furniture.domain;

public class Placard {
	/**
	 * pid:公告编号
	 * title:公告标题
	 * content:公告内容
	 */
	private int pid;
	private String title;
	private String content;
	public Placard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placard(int pid, String title, String content) {
		super();
		this.pid = pid;
		this.title = title;
		this.content = content;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
