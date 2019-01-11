package com.huanleichen.login.demo.service.impl;

import com.huanleichen.login.demo.dao.UserDao;
import com.huanleichen.login.demo.dao.impl.UserDaoImpl;
import com.huanleichen.login.demo.entity.User;
import com.huanleichen.login.demo.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao dao = new UserDaoImpl();

    public User login(int userId, String userPassword) {
        return dao.login(userId, userPassword);
    }
}
