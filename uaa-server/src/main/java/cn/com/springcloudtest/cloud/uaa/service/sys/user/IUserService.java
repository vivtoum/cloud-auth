package cn.com.springcloudtest.cloud.uaa.service.sys.user;

import org.springframework.security.core.userdetails.UserDetailsService;

import cn.com.springcloudtest.cloud.commons.service.IBaseService;
import cn.com.springcloudtest.cloud.uaa.entity.sys.user.User;

/**
 * UserService
 * 
 * @author qxs
 * @date 2016-03-23 16:52:52
 * @version 1.0
 */
public interface IUserService extends IBaseService<User>,UserDetailsService{
	
}
