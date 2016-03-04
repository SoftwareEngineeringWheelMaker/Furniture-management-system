package com.furniture.domain;
/**
 * 
 * Placard.java<code>{Placard}</code>{公告类}
 * 
 * @author Raindrops
 * @version 2016.03.04
 *
 */
public class Placard {
	private int ID;
	private String title;//标题
	private String content;//内容
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	
}
