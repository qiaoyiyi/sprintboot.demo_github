package com.it.qk.service;

import com.it.qk.pojo.UserMongo;

import java.util.List;

public interface UserMongoService {

    UserMongo saveUser(UserMongo userMongo);

    List<UserMongo> getUserByUsername(String username);

}
