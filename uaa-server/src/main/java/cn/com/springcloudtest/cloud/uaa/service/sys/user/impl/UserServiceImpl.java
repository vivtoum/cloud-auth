package cn.com.springcloudtest.cloud.uaa.service.sys.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cn.com.springcloudtest.cloud.commons.entity.SecurityUser;
import cn.com.springcloudtest.cloud.commons.service.impl.BaseServiceImpl;
import cn.com.springcloudtest.cloud.uaa.entity.sys.user.User;
import cn.com.springcloudtest.cloud.uaa.repository.sys.user.UserRepository;
import cn.com.springcloudtest.cloud.uaa.service.sys.user.IUserService;

/**
 * UserService实现
 * 
 * @author qxs
 * @date 2016-03-23 16:52:52
 * @version 1.0
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService,UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		User user = userRepository.findByMobileOrEmail(userName, userName);
		if (user == null) {
			throw new UsernameNotFoundException("UserName " + userName
					+ " not found");
		}
		return new SecurityUser(user.getId(), user.getUserName(),
				user.getUserPhoto(), user.getMobile(), user.getEmail(),
				user.getPassword(), user.getStatus(), user.getUserType());
	}
}
