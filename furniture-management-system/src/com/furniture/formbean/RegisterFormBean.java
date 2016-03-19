package com.furniture.formbean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

public class RegisterFormBean {
	private String cname;
	private String cpassword;
	private String cpassword2;
	private String ctel;
	private double cmoney;
	
	private Map<String,String> errors = new HashMap<String,String>();

	/**
	 * 
	 * 	private String cname;  用户名不能为空，并且要3-8的字符
		private String cpassword;  密码不能为空，并且要求3-8的字符
		private String cpassword2; 2次密码要一致
		private String ctel;	       可以为空，但是要合法邮箱
		private double cmoney;  可以为空，不为空时要是一个合法日期
	 * @return
	 */
	public boolean validate(){
		
		boolean isOk = true ;
		
		if(this.cname == null || this.cname.trim().equals("") ){
			isOk = false ;
			errors.put("cname", "用户名不能为空.");
		}else{
			if(!this.cname.matches("([a-zA-Z])([A-Za-z0-9]{2,7})")){
				isOk = false ;
				errors.put("cname", "用户名必须以字母开头的3-8位的有效字段。");
			}
		}
		
		if(this.cpassword == null || this.cpassword.trim().equals("") ){
			isOk = false ;
			errors.put("cpassword", "密码不能为空。");
		}else{
			if (!this.cpassword.matches("\\w{3,8}")) {
				isOk = false ;
				errors.put("cpassword", "密码必须为3-8位有效字段。");
			}
		}
		
		if(this.cpassword2!=null){
			if(!cpassword2.equals(cpassword)){
				isOk = false ;
				errors.put("cpassword2", "2次密码不一致。");
			}
		}
		
		if (this.ctel ==null  || this.ctel.trim().equals("") ) {
				isOk = false ;
				errors.put("ctel", "不能为空");
		}
		
		
		return isOk;
	}

	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * @return the cpassword
	 */
	public String getCpassword() {
		return cpassword;
	}

	/**
	 * @param cpassword the cpassword to set
	 */
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	/**
	 * @return the cpassword2
	 */
	public String getCpassword2() {
		return cpassword2;
	}

	/**
	 * @param cpassword2 the cpassword2 to set
	 */
	public void setCpassword2(String cpassword2) {
		this.cpassword2 = cpassword2;
	}

	/**
	 * @return the ctel
	 */
	public String getCtel() {
		return ctel;
	}

	/**
	 * @param ctel the ctel to set
	 */
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}

	/**
	 * @return the cmoney
	 */
	public double getCmoney() {
		return cmoney;
	}

	/**
	 * @param cmoney the cmoney to set
	 */
	public void setCmoney(double cmoney) {
		this.cmoney = cmoney;
	}

	/**
	 * @return the errors
	 */
	public Map<String, String> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	
	
}
