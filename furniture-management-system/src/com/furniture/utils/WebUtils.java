package com.furniture.utils;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import com.furniture.exception.WebUtilsException;

public class WebUtils {
	public static <T>T request2bean(HttpServletRequest request,Class<T> clazz){
		try {	
			T bean = clazz.newInstance();
			Enumeration e = request.getParameterNames();
			while(e.hasMoreElements())
			{
				String name = (String) e.nextElement();
				String value = request.getParameter(name);
				BeanUtils.setProperty(bean, name, value);	
			}
			return bean;
		} catch (Exception e) {
			throw new WebUtilsException(e);
		}
	}
}
