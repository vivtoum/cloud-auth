package cn.com.springcloudtest.cloud.uaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.springcloudtest.cloud.commons.entity.SecurityUser;
import cn.com.springcloudtest.cloud.commons.util.SessionUtil;

/***
 * 首页控制器
 * **/
@Controller
public class IndexController {
	
	@RequestMapping({"/","/index"})
	public String index(Model model){
		SecurityUser user = SessionUtil.getSecurityUser();
		model.addAttribute("user", user);
		
		return "index";
	}
	
	@RequestMapping("/user/index")
	public String userIndex(Model model){
		SecurityUser user = SessionUtil.getSecurityUser();
		model.addAttribute("user", user);
		
		return "userIndex";
	}
}
