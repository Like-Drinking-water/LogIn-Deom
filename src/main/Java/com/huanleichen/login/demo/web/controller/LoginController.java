package com.huanleichen.login.demo.web.controller;

import com.huanleichen.login.demo.service.UserService;
import com.huanleichen.login.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service = new UserServiceImpl();

        int userId = Integer.valueOf(req.getParameter("userId"));
        String userPassword = req.getParameter("userPassword");

        System.out.println(userId);
        System.out.println(userPassword);


        //登录成功
        if (service.login(userId, userPassword) != null) {
            resp.sendRedirect("success.jsp");
        }
        //登录失败
        else {
            resp.sendRedirect("fail.jsp");
        }
    }
}
