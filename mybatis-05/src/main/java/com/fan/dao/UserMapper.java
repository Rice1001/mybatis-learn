package com.fan.dao;

import com.fan.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2021/3/7 9:17
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getAll();

}
