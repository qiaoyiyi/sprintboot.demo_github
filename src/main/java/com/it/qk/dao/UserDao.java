package com.it.qk.dao;

import com.it.qk.dao.impl.UserProviderImpl;
import com.it.qk.pojo.UserPojo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from user order by id")
    List<UserPojo> findAllUser();

    @Select("select * from user where id =#{id}")
    UserPojo findUserById(@Param("id") String id);

    @Insert("insert into user (id,name,passwd,phone,remark) values (#{user.id},#{user.name},#{user.passwd},#{user.phone},#{user.remark})")
    int insertUser(@Param("user") UserPojo user);

    @UpdateProvider(type = UserProviderImpl.class,method = "getUpdateUserSql")
    int updateUser(@Param("user")UserPojo user);

}
