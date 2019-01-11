package com.huanleichen.login.demo.dao.impl;

import com.huanleichen.login.demo.dao.UserDao;
import com.huanleichen.login.demo.entity.User;

public class UserDaoImpl implements UserDao {

    public User login(int userId, String userPassword) {
        User user = null;

        if (userId == 123) {
            if (userPassword.equals("123")) {
                user = new User("name", userId, userPassword);
            }
        }

        return user;
    }
}
