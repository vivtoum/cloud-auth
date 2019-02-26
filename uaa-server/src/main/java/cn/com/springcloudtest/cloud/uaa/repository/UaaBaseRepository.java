package cn.com.springcloudtest.cloud.uaa.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;

import cn.com.springcloudtest.cloud.commons.repository.BaseRepository;

/**
 * 基础Repository,里面包含一些公用的方法
 * @author qxs
 * @date 2017-06-12
 * **/
@NoRepositoryBean
public interface UaaBaseRepository<T, ID extends Serializable> extends BaseRepository<T, ID>{

}
