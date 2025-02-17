package com.it.qk.pojo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author qiaokai 1941312688@qq.com
 * @version 1.0
 * @ClassName UserPojo
 * @description
 * @date 2024/4/12 21:54:09
 */
@Data
public class UserPojo {
    /**
     * 用户id
     */
    private String id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String passwd;
    /**
     * 电话
     */
    private String phone;
    /**
     * 备注
     */
    private String remark;
}
