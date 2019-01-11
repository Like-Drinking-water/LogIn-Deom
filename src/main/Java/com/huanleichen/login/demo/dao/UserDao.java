package com.huanleichen.login.demo.dao;

import com.huanleichen.login.demo.entity.User;

public interface UserDao {

    public User login(int userId, String userPassword);
}
