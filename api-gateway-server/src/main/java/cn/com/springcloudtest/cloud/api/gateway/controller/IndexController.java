package cn.com.springcloudtest.cloud.api.gateway.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页Controller
 * **/
@Controller
public class IndexController {
	
	@Value("${uaa.server.index-path}")
	private String uaaServerIndexPath = "/uaa/index";
	
	/**
	 * 如果请求首页则直接跳转到认证服务器首页
	 * **/
	@RequestMapping({"/","/index"})
	public String index(HttpServletRequest request,HttpServletResponse response){
		
		return "redirect:" + uaaServerIndexPath;
	}
}
