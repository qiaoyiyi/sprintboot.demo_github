package com.it.qk.service;

import com.it.qk.pojo.User;

import java.util.List;

public interface UserMongoService {

    User saveUser(User user);

    List<User> getUserByUsername(String username);

}
