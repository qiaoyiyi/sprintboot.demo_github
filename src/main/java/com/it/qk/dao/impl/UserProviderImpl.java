package com.it.qk.dao.impl;

import com.it.qk.pojo.UserPojo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;

@Slf4j
public class UserProviderImpl {

    public String getUpdateUserSql(@Param("user")UserPojo user){

        String sql="update user set ";
        boolean flag = false;
        if (!StringUtils.isEmpty(user.getName())){
            sql+=" name=#{user.name},";
            flag=true;
        }
        if (!StringUtils.isEmpty(user.getPasswd())){
            sql+=" passwd=#{user.passwd},";
            flag=true;
        }
        if (!StringUtils.isEmpty(user.getPhone())){
            sql+=" phone=#{user.phone},";
            flag=true;
        }
        if (!StringUtils.isEmpty(user.getRemark())){
            sql+=" remark=#{user.remark},";
            flag=true;
        }
        if (flag){
            if (sql.endsWith(",")){
                sql=sql.substring(0,sql.length()-1);
            }
        }
        sql +=" where id=#{user.id}";
        log.info("更新用户的脚本语句|{}",sql);
        return sql;
    }
}
