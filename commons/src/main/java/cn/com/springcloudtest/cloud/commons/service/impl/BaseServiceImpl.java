package cn.com.springcloudtest.cloud.commons.service.impl;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.criterion.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import cn.com.springcloudtest.cloud.commons.entity.BaseEntity;
import cn.com.springcloudtest.cloud.commons.service.IBaseService;
import cn.com.springcloudtest.cloud.commons.util.Reflect;


/**
 * 基类,用来做缓存
 * 
 * @author qxs
 * @date 2016-3-14
 * @version 1.0
 * **/
public abstract class BaseServiceImpl<T extends BaseEntity> implements IBaseService<T> {
	protected transient Log log = LogFactory.getLog(getClass());
	
	protected static final Order[] EMPTY_ORDER_ARRAY = new Order[0];
	protected static final List<Order> EMPTY_ORDER_LIST = new ArrayList<Order>(0);
	
	@Override
	public T insert(T t) {
		throw new UnsupportedOperationException(this.getClass()+".insert(T t)");
	}

	@Override
	public void batchInsert(List<T> list) {
		throw new UnsupportedOperationException(this.getClass()+".batchInsert(List<T> list)");
	}

	@Override
	public T update(T t) {
		throw new UnsupportedOperationException(this.getClass()+".update(T t)");
	}

	@Override
	public void batchUpdate(List<T> list) {
		throw new UnsupportedOperationException(this.getClass()+".batchUpdate(List<T> list)");
	}

	@Override
	public int deleteById(long id) {
		throw new UnsupportedOperationException(this.getClass()+".deleteById(long id)");
	}

	@Override
	public int delete(T t) {
		throw new UnsupportedOperationException(this.getClass()+".delete(T t)");
	}

	@Override
	public T findById(long id) {
		throw new UnsupportedOperationException(this.getClass()+".findById(long id)");
	}

	@Override
	public T find(T t) {
		throw new UnsupportedOperationException(this.getClass()+".find(T t)");
	}

	@Override
	public List<T> findList(T t, Order... orders) {
		try{
			return findList(t, orders == null ? EMPTY_ORDER_ARRAY : orders );
		}catch(UnsupportedOperationException e){
			throw new UnsupportedOperationException(this.getClass()+".findList(T t, Order... orders)");
		}
	}

	@Override
	public List<T> findList(T t, List<Order> orders) {
		try{
			return findList(t, orders == null ? EMPTY_ORDER_LIST : orders );
		}catch(UnsupportedOperationException e){
			throw new UnsupportedOperationException(this.getClass()+".findList(T t, List<Order> orders)");
		}
	}

	@Override
	public List<T> findList(T t, Sort sort) {
		throw new UnsupportedOperationException(this.getClass()+".findList(T t, Sort sort)");
	}

	@Override
	public List<T> findList(T t, Pageable pageable, Order... orders) {
		try{
			return findList(t, pageable, orders == null ? EMPTY_ORDER_ARRAY : orders );
		}catch(UnsupportedOperationException e){
			throw new UnsupportedOperationException(this.getClass()+".findList(T t, Pageable pageable, Order... orders)");
		}
	}

	@Override
	public List<T> findList(T t, Pageable pageable, List<Order> orders) {
		try{
			return findList(t, pageable, orders == null ? EMPTY_ORDER_LIST : orders );
		}catch(UnsupportedOperationException e){
			throw new UnsupportedOperationException(this.getClass()+".findList(T t, Pageable pageable, List<Order> orders)");
		}
	}

	@Override
	public List<T> findList(T t, Pageable pageable, Sort sort) {
		throw new UnsupportedOperationException(this.getClass()+".findList(T t, Pageable pageable, Sort sort)");
	}

	@Override
	public Page<T> findPageList(T t, Pageable pageable, Order... orders) {
		try{
			return findPageList(t, pageable, orders == null ? EMPTY_ORDER_ARRAY : orders );
		}catch(UnsupportedOperationException e){
			throw new UnsupportedOperationException(this.getClass()+".findPageList(T t, Pageable pageable, Order... orders)");
		}
	}

	@Override
	public Page<T> findPageList(T t, Pageable pageable, List<Order> orders) {
		try{
			return findPageList(t, pageable, orders == null ? EMPTY_ORDER_LIST : orders );
		}catch(UnsupportedOperationException e){
			throw new UnsupportedOperationException(this.getClass()+".findPageList(T t, Pageable pageable, List<Order> orders)");
		}
	}

	@Override
	public Page<T> findPageList(T t, Pageable pageable, Sort sort) {
		throw new UnsupportedOperationException(this.getClass()+".findPageList(T t, Pageable pageable, Sort sort)");
	}

	@Override
	public long findCount(T t) {
		throw new UnsupportedOperationException(this.getClass()+".findCount(T t)");
	}

	/***
	 * 把对象转换为map
	 * 
	 * @param obj
	 *            对象
	 * @return map 转换之后的map
	 * */
	protected static Map<String,Object> convertToMap(Object obj){
		Map<String,Object> params = new HashMap<String, Object>();
		if(null == obj){
			return params;
		}
		Field[] fields = Reflect.getAllFields(obj);
		for (Field filed : fields) {
			Object value = Reflect.getFieldValue(obj, filed.getName());
			if (value == null || (value instanceof String && value.toString().trim().length() == 0)) {
				continue;
			}
			params.put(filed.getName(), value);
		}

		return params;
	}

	/**
	* 获取排序参数
	* @param orders 排序参数
	* @return String 排序参数
	**/
	protected static String getOrder(Object obj,Order... orders){
//		if(orders == null || orders.length == 0){
//			return null;
//		}
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < orders.length; i++) {
//			Order order = orders[i];
//			if(StringUtils.isEmpty(order.getSortName())){
//				continue;
//			}
//			// 如果指定了class
//			Class<?> clazz = order.getClazz() != null ? order.getClazz() : obj != null ? obj.getClass() : null;
//			if (clazz != null) {
//				String sort = order.getSortName();
//				// 如果前台传过来的排序字段名带.则认为是数据库表名加字段名,不做处理
//				if (sort.indexOf(".") < 0) {
//					Field field = Reflect.getAccessibleField(clazz, sort);
//					if (field != null) {
//						OrderField orderField = field.getAnnotation(OrderField.class);
//						if (orderField != null) {
//							String orderFieldName = orderField.value();
//							if (StringUtils.isNotEmpty(orderFieldName)) {
//								order.setSortName(orderFieldName);
//							}
//						}
//					}
//				}
//			}
//			if (i > 0) {
//				sb.append(",");
//			}
//			sb.append(order.toString());
//		}
//		return sb.toString();
		return null;
	}

//	/**
//	* 获取排序参数
//	* @param orders 排序参数
//	* @return String 排序参数
//	**/
//	public static Map<String,Object> getParams(Object obj,Page page,Order... order){
//		Map<String,Object> params = convertToMap(obj);
//		
////		params.put("order",getOrder(obj,order));
////		if(page != null){
////			params.put("pagePageSize",page.getPageSize());
////			params.put("pageStartRow",page.getStartRow());
////		}
//		return params;
//	}

//	protected PageList<T> pageList(T t, List<T> list, Page page) {
//		long rowCount = this.findCount(t);
//		page.setRowCount(rowCount);
//
//		PageList<T> pageList = new PageList<T>();
//		pageList.setRows(list);
//		pageList.setPage(page);
//
//		return pageList;
//	}
}
