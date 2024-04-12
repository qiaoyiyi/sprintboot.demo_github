package com.it.qk.dao;

import com.it.qk.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user limit 200 ")
    List<UserPojo> findAllUser();

    @Select("select * from user where id =#{id}")
    UserPojo findUserById(@Param("id") String id);

}
