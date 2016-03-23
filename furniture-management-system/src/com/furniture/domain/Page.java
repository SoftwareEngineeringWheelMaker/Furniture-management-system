package com.furniture.domain;

import java.util.List;

public class Page {
	private List list;
	private int totalpage;//记录总页数
	
	private int totalrecord;
	private int pagesize=2;
	
	private int pagenum;//代表用户想看的页
	private int startindex;//代表用户想看的页从数据库哪个地方开始取
	
	private int startPage;//记住JSP页面显示的起始页码
	private int endPage;//记住jsp页面显示的结束页码
	
	private int pagecount;//页面数量
	
	/**
	 * 
	 * @param totalrecord 数量
	 * @param pagenum	代表用户想看的页
	 * @param pagecount 页面数量
	 * @param pagesize 每页显示多少数据
	 */
	public Page(int totalrecord,int pagenum,int pagecount)
	{
		this.totalrecord = totalrecord;
		if(this.totalrecord%this.pagesize==0)
		{
			this.totalpage = this.totalrecord/this.pagesize;
		}else{
			this.totalpage = this.totalrecord/this.pagesize+1;
		}
		
		this.pagenum = pagenum ;
		this.startindex = (this.pagenum-1)*this.pagesize;
		
		//根据用户想看的页pagenum,算出jsp的起始和结束页码
		if(this.totalpage <= pagecount){
			this.startPage=1;
			this.endPage=pagecount;
		}else{
			this.startPage=this.pagenum - 4;
			this.endPage=this.pagenum + 5;
			
			if (this.startPage < 1) {
				this.startPage=1;
				this.endPage=pagecount;
			}
			if(this.endPage > this.totalpage)
			{
				this.endPage=this.totalpage;
				this.startPage = this.totalpage-pagecount+1;
			}
		}
		
	}

	
	
	/**
	 * @return the startPage
	 */
	public int getStartPage() {
		return startPage;
	}



	/**
	 * @param startPage the startPage to set
	 */
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	

	/**
	 * @return the pagecount
	 */
	public int getPagecount() {
		return pagecount;
	}



	/**
	 * @param pagecount the pagecount to set
	 */
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}



	/**
	 * @return the endPage
	 */
	public int getEndPage() {
		return endPage;
	}



	/**
	 * @param endPage the endPage to set
	 */
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}



	/**
	 * @return the list
	 */
	public List getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List list) {
		this.list = list;
	}

	/**
	 * @return the totalpage
	 */
	public int getTotalpage() {
		return totalpage;
	}

	/**
	 * @param totalpage the totalpage to set
	 */
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	/**
	 * @return the totalrecord
	 */
	public int getTotalrecord() {
		return totalrecord;
	}

	/**
	 * @param totalrecord the totalrecord to set
	 */
	public void setTotalrecord(int totalrecord) {
		this.totalrecord = totalrecord;
	}

	/**
	 * @return the pagesize
	 */
	public int getPagesize() {
		return pagesize;
	}

	/**
	 * @param pagesize the pagesize to set
	 */
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	/**
	 * @return the pagenum
	 */
	public int getPagenum() {
		return pagenum;
	}

	/**
	 * @param pagenum the pagenum to set
	 */
	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	/**
	 * @return the startindex
	 */
	public int getStartindex() {
		return startindex;
	}

	/**
	 * @param startindex the startindex to set
	 */
	public void setStartindex(int startindex) {
		this.startindex = startindex;
	}
	
}
