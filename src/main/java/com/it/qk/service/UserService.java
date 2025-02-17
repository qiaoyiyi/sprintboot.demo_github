package com.it.qk.service;

import com.it.qk.pojo.UserPojo;

import java.util.List;

public interface UserService {

    UserPojo queryUserByKeyId(String id);

    List<UserPojo> queryAllUsers();

    int insertUser(UserPojo user);

    int updateUser(UserPojo user);

}
