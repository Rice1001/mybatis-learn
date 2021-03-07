package com.fan.dao;

import com.fan.pojo.User;

import java.util.List;

/**
 * @author rice
 * @version 1.0
 * @date 2021/3/7 9:17
 */
public interface UserMapper {
    List<User> selectUser();
    User getById(int id);
    void delete(int id);
    void add(User user);
    void update(User user);
}
