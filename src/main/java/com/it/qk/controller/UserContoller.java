package com.it.qk.controller;


import com.it.qk.dao.UserDao;
import com.it.qk.pojo.UserPojo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
@Slf4j
public class UserContoller {

    @Resource
    private UserDao userDao;

    @RequestMapping("getUser")
    public List<UserPojo> getUsers() {
        log.info("开始查询用户数据");
        return userDao.findAllUser();
    }

    @RequestMapping("getUserById")
    public UserPojo getUser(@RequestParam(value = "user_id",required = true) String id) {
        log.info("用户ID为{}",id);
        UserPojo userPojo = userDao.findUserById(id);
        log.info("查询结果为{}",userPojo.toString());
        return userPojo;
    }

}
