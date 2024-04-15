package com.it.qk.service;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qiaokai 1941312688@qq.com
 * @version 1.0
 * @ClassName UserMongoDao
 * @description
 * @date 2024/4/14 22:37:52
 */
@Service
public class UserMongoServer {

    @Resource
    private MongoTemplate mongoTemplate;


}
