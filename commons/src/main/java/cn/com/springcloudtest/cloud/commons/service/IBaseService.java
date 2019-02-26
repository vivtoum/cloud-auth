package cn.com.springcloudtest.cloud.commons.service;

import java.util.List;

import org.hibernate.criterion.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import cn.com.springcloudtest.cloud.commons.entity.BaseEntity;


/**
 * 基类,用来做缓存
 * @author qxs
 * @date 2016-3-14
 * @version 1.0
 * **/
public interface IBaseService<T extends BaseEntity> {
	/***
	* 插入
	*
	* @param t 实体
	* @return T 添加完之后的实体
	* @throws RuntimeException 
	**/
	public T insert(T t);
	/***
	* 批量插入
	*
	* @param list 实体列表
	* @return void
	* @throws RuntimeException 
	**/
	public void batchInsert(List<T> list);
	/***
	* 更新
	*
	* @param t 要更新的实体
	* @return T 更新完之后的实体
	* @throws RuntimeException 
	**/
	public T update(T t);
	/***
	* 批量更新
	*
	* @param list 实体列表
	* @return void
	* @throws RuntimeException 
	**/
	public void batchUpdate(List<T> list);
	/***
	* 根据id删除
	*
	* @param id 主键
	* @return int 是否删除成功   1:成功  0:不成功
	**/
	public int deleteById(long id);
	/***
	* 根据对象删除
	*
	* @param id 主键
	* @return int 是否删除成功   1:成功  0:不成功
	**/
	public int delete(T t);
	
	/***
	* 根据id获取对象
	*
	* @param id 主键
	* @return T 对象
	**/
	public T findById(long id);
	
	/***
	* 根据对象查询
	*
	* @param t 过滤条件实体
	* @return T 
	**/
	public T find(T t);
	/***
	* 根据对象查询对象列表
	*
	* @param t 过滤条件实体
	* @param orders 排序字段信息
	* @return List<T>
	**/
	public List<T> findList(T t,Order... orders);
	/***
	* 根据对象查询对象列表
	*
	* @param t 过滤条件实体
	* @param orders 排序字段信息
	* @return List<T>
	**/
	public List<T> findList(T t,List<Order> orders);
	/***
	* 根据对象查询对象列表( findList(T t,Order... order)方法中的orders最终会转换成sort )
	*
	* @param t 过滤条件实体
	* @param sort 排序字段信息
	* @return List<T>
	**/
	public List<T> findList(T t,Sort sort);
	/***
	* 根据对象查询对象列表(带分页)
	*
	* @param t 过滤条件实体
	* @param pageable 分页信息
	* @param orders 排序字段信息
	* @return List<T>
	**/
	public List<T> findList(T t,Pageable pageable,Order... orders);
	/***
	* 根据对象查询对象列表(带分页)
	*
	* @param t 过滤条件实体
	* @param pageable 分页信息
	* @param orders 排序字段信息
	* @return List<T>
	**/
	public List<T> findList(T t,Pageable pageable,List<Order> orders);
	/***
	* 根据对象查询对象列表(带分页)( findList(T t,Pageable pageable,Order... order)方法中的orders最终会转换成sort )
	*
	* @param t 过滤条件实体
	* @param pageable 分页信息
	* @param sort 排序字段信息
	* @return List<T>
	**/
	public List<T> findList(T t,Pageable pageable,Sort sort);
	/***
	* 根据对象查询对象列表(带分页)
	*
	* @param t 过滤条件实体
	* @param @param pageable 分页信息
	* @param orders 排序字段信息
	* 
	* @return Page<T>
	**/
	public Page<T> findPageList(T t,Pageable pageable,Order... orders);
	/***
	* 根据对象查询对象列表(带分页)
	*
	* @param t 过滤条件实体
	* @param @param pageable 分页信息
	* @param orders 排序字段信息
	* 
	* @return Page<T>
	**/
	public Page<T> findPageList(T t,Pageable pageable,List<Order> orders);
	/***
	* 根据对象查询对象列表(带分页)
	*
	* @param t 过滤条件实体
	* @param @param pageable 分页信息
	* @param sort 排序字段信息
	* 
	* @return Page<T>
	**/
	public Page<T> findPageList(T t,Pageable pageable,Sort sort);
	
	/***
	* 查询总数
	*
	* @param t 过滤条件实体
	* @return long 
	**/
	public long findCount(T t);
}

