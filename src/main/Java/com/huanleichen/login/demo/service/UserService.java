package com.huanleichen.login.demo.service;

import com.huanleichen.login.demo.entity.User;

public interface UserService {
    public User login(int userId, String userPassword);
}
