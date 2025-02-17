package com.it.qk.service.impl;

import com.it.qk.dao.UserDao;
import com.it.qk.pojo.UserPojo;
import com.it.qk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserPojo queryUserByKeyId(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<UserPojo> queryAllUsers() {
        return userDao.findAllUser();
    }

    @Override
    public int insertUser(UserPojo user) {
        return userDao.insertUser(user);
    }

    @Override
    public int updateUser(UserPojo user) {
        return userDao.updateUser(user);
    }
}
