package cn.com.springcloudtest.cloud.commons.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 基础Repository,里面包含一些公用的方法
 * @author qxs
 * @date 2017-06-12
 * **/
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID>{

}
