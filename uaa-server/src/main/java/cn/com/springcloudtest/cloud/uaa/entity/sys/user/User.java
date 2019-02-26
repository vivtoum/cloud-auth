package cn.com.springcloudtest.cloud.uaa.entity.sys.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import cn.com.springcloudtest.cloud.uaa.entity.UaaBaseEntity;

/**
 * sys_user实体类
 * 
 * @author <a href="mailto:dell-minle@boco.com.cn">dell-minle</a>
 * @date 2016-03-23 16:52:52
 * @version 1.0
 */
@Entity
@Table(name = "sys_user")
public class User extends UaaBaseEntity{
	
	private static final long serialVersionUID = 2528590000080113724L;
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
     * 主键 (数据库字段名:id)
     */
	@Id
    private Long id;

    /**
     * 名称 (数据库字段名:userName)
     */
    private String userName;
    /**
     * 用户头像 (数据库字段名:userPhoto)
     */
    private String userPhoto;

    /**
     * 手机号 (数据库字段名:mobile)
     */
    private String mobile;
    /**
     * 邮箱地址 (数据库字段名:email)
     */
    private String email;

    /**
     * 密码 (数据库字段名:password)
     */
    private String password;

    /**
     * 状态 0:有效 1:无效 (数据库字段名:status)
     */
    private Integer status;

    /**
     * 修改时间 (数据库字段名:createTime)
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
     * 创建人 (数据库字段名:createUserId)
     */
    private Long createUserId;
    /**
     * 修改时间 (数据库字段名:modifyTime)
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;
    /**
     * 修改人 (数据库字段名:modifyUserId)
     */
    private Long modifyUserId;
    /**
	 * 用户类型  0:普通用户  1:超级管理员
	 * **/
	private Integer userType;
	/**
     * 停用时间 (数据库字段名:disableTime)
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date disableTime;
    /**
     * 主键 (数据库字段名:id)
     */
	public Long getId() {
		return id;
	}
	/**
     * 主键 (数据库字段名:id)
     */
	public void setId(Long id) {
		this.id = id;
	}
	/**
     * 名称 (数据库字段名:userName)
     */
	public String getUserName() {
		return userName;
	}
	/**
     * 名称 (数据库字段名:userName)
     */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
     * 用户头像 (数据库字段名:userPhoto)
     */
	public String getUserPhoto() {
		return userPhoto;
	}
	/**
     * 用户头像 (数据库字段名:userPhoto)
     */
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	/**
     * 手机号 (数据库字段名:mobile)
     */
	public String getMobile() {
		return mobile;
	}
	/**
     * 手机号 (数据库字段名:mobile)
     */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
     * 邮箱地址 (数据库字段名:email)
     */
	public String getEmail() {
		return email;
	}
	/**
     * 邮箱地址 (数据库字段名:email)
     */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
     * 密码 (数据库字段名:password)
     */
	public String getPassword() {
		return password;
	}
	/**
     * 密码 (数据库字段名:password)
     */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
     * 状态 0:有效 1:无效 (数据库字段名:status)
     */
	public Integer getStatus() {
		return status;
	}
	/**
     * 状态 0:有效 1:无效 (数据库字段名:status)
     */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
     * 修改时间 (数据库字段名:createTime)
     */
	public Date getCreateTime() {
		return createTime;
	}
	/**
     * 修改时间 (数据库字段名:createTime)
     */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
     * 创建人 (数据库字段名:createUserId)
     */
	public Long getCreateUserId() {
		return createUserId;
	}
	/**
     * 创建人 (数据库字段名:createUserId)
     */
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	/**
     * 修改时间 (数据库字段名:modifyTime)
     */
	public Date getModifyTime() {
		return modifyTime;
	}
	/**
     * 修改时间 (数据库字段名:modifyTime)
     */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
     * 修改人 (数据库字段名:modifyUserId)
     */
	public Long getModifyUserId() {
		return modifyUserId;
	}
	/**
     * 修改人 (数据库字段名:modifyUserId)
     */
	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}
	/**
     * 用户类型  0:普通用户  1:超级管理员
     */
	public Integer getUserType() {
		return userType;
	}
	/**
     * 用户类型  0:普通用户  1:超级管理员
     */
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	/**
     * 停用时间 (数据库字段名:disableTime)
     */
	public Date getDisableTime() {
		return disableTime;
	}
	/**
     * 停用时间 (数据库字段名:disableTime)
     */
	public void setDisableTime(Date disableTime) {
		this.disableTime = disableTime;
	}
	
}