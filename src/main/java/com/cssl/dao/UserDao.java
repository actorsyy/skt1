package com.cssl.dao;

import com.cssl.entity.User;

import java.util.List;

/**
 * 用户表接口
 */
public interface UserDao {
    //增加用户
    public int addUser(User user);
    //删除用户
    public int delUser(int user_id);
    //修改用户
    public int updateUser(User user);
    //查询用户
    public List<User> findUsers(User user);
}
