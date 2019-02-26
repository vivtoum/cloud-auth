package cn.com.springcloudtest.cloud.commons.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.com.springcloudtest.cloud.commons.CommonConstants;
import cn.com.springcloudtest.cloud.commons.entity.SecurityUser;

/**
 * session工具类
 * **/
public class SessionUtil {
	
	/**
	 * 设置SecurityUser
	 * 
	 * **/
	public static void setSecurityUser(SecurityUser securityUser){
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		
		request.getSession().setAttribute(CommonConstants.LOGIN_USER,securityUser);
	}
	
	/**
	 * 从session中获取user
	 * 
	 * @return SecurityUser
	 * **/
	public static SecurityUser getSecurityUser(){
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		return (SecurityUser) request.getSession().getAttribute(CommonConstants.LOGIN_USER);
	}
}
