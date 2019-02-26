package cn.com.springcloudtest.cloud.commons.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUser implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户类型:超级管理员
	 * **/
	public static final int USER_TYPE_ADMINISTRATOR = 1;
	/**
	 * 用户类型:普通用户
	 * **/
	public static final int USER_TYPE_GENERAL_USER = 0;

	/**
	 * 用户状态:有效
	 * **/
	public static final int USER_STATUS_ENABLE = 0;
	/**
	 * 用户状态:无效
	 * **/
	public static final int USER_STATUS_DISABLE = 1;
	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 名称
	 */
	private String userName;
	/**
	 * 用户头像
	 */
	private String userPhoto;

	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 邮箱地址
	 */
	private String email;
	
	/**
     * 密码 (数据库字段名:password)
     */
    private String password;

	/**
	 * 状态 0:有效 1:无效
	 */
	private Integer status;

	/**
	 * 用户类型 0:普通用户 1:超级管理员
	 * **/
	private Integer userType;

	/**
	 * @param id 主键
	 * @param userName 名称
	 * @param userPhoto 用户头像
	 * @param mobile 手机号
	 * @param email 邮箱地址
	 * @param password 密码
	 * @param status 状态 0:有效 1:无效
	 * @param userType 用户类型 0:普通用户 1:超级管理员
	 * **/
	public SecurityUser(Long id, String userName, String userPhoto,
			String mobile, String email, String password, Integer status,
			Integer userType) {
		this.id = id;
		this.userName = userName;
		this.userPhoto = userPhoto;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.status = status;
		this.userType = userType;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return null;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		return this.status == USER_STATUS_ENABLE;
	}
	/**
	 * 主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 名称
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 名称
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 用户头像
	 */
	public String getUserPhoto() {
		return userPhoto;
	}
	/**
	 * 用户头像
	 */
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	/**
	 * 手机号
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 邮箱地址
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 邮箱地址
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
     * 密码 (数据库字段名:password)
     */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
     * 密码 (数据库字段名:password)
     */
	public String getPassword() {
		return password;
	}
	/**
	 * 状态 0:有效 1:无效
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 状态 0:有效 1:无效
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 用户类型 0:普通用户 1:超级管理员
	 * **/
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	/**
	 * 用户类型 0:普通用户 1:超级管理员
	 * **/
	public Integer getUserType() {
		return userType;
	}

}
