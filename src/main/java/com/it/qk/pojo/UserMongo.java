package com.it.qk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author qiaokai 1941312688@qq.com
 * @version 1.0
 * @ClassName User
 * @description
 * @date 2024/4/15 20:55:20
 */
@Document(collection = "users")
@Data
public class UserMongo {
    @Id
    private String id;

    private UserPojo user;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthDay;
}
