package com.it.qk.service.impl;

import com.it.qk.pojo.UserMongo;
import com.it.qk.service.UserMongoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qiaokai 1941312688@qq.com
 * @version 1.0
 * @ClassName UserMongoServiceImpl
 * @description
 * @date 2024/4/14 22:37:52
 */
@Service
@Slf4j
public class UserMongoServiceImpl implements UserMongoService {

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public UserMongo saveUser(UserMongo userMongo) {
        log.info("开始保存用户信息对象到mongodb中");
        UserMongo save = mongoTemplate.save(userMongo);
        log.info("用户信息保存完毕!!!");
        return save;
    }

    @Override
    public List<UserMongo> getUserByUsername(String username) {
        log.info("开始按照用户名称{}查询",username);
        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(username));
        List<UserMongo> userMongoList = mongoTemplate.find(query, UserMongo.class);
        log.info("根据用户名称查询出的用户信息集合大小为|{}", userMongoList.size());
        return userMongoList;
    }
}
