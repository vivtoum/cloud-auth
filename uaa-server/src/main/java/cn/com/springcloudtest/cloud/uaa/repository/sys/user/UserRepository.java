package cn.com.springcloudtest.cloud.uaa.repository.sys.user;

import org.springframework.stereotype.Repository;

import cn.com.springcloudtest.cloud.uaa.entity.sys.user.User;
import cn.com.springcloudtest.cloud.uaa.repository.UaaBaseRepository;

@Repository
public interface UserRepository extends UaaBaseRepository<User, Long> {
//    @Query("select t from User t where t.name =?1 and t.email =?2")
//    User findByNameAndEmail(String name, String email);
//
//    @Query("select t from User t where t.name like :name")
//    Page<User> findByName(@Param("name") String name, Pageable pageRequest);

    User findByMobileOrEmail(String mobile,String email);
}
