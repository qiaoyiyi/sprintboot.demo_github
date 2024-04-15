package com.it.qk.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author qiaokai 1941312688@qq.com
 * @version 1.0
 * @ClassName User
 * @description
 * @date 2024/4/15 20:55:20
 */
@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String username;

    private String password;

    private UserPojo user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserPojo getUser() {
        return user;
    }

    public void setUser(UserPojo user) {
        this.user = user;
    }
}
