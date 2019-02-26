package cn.com.springcloudtest.cloud.commons.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * 当前环境的ApplicationContext工具类
 * @author qxs
 * @date 2017-06-12
 * **/
public final class ApplicationContextUtil {
	
	/**
	 * 获取ApplicationContext
	 * 
	 * @return ApplicationContext
	 * **/
	public static ApplicationContext getApplicationContext(){
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		return RequestContextUtils.findWebApplicationContext(request);
	}
}
