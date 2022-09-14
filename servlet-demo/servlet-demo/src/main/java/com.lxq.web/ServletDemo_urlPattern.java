package com.lxq.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * urlPattern: 一个Servlet可以配置多个访问路径
 *
 * * 精确匹配  "/user/select"
 * * 目录匹配: /user/*
 * * 扩展名匹配: *.do (在*.do的前面不能加`/`)
 *  * 任意匹配： /
 *  * 任意匹配： /*
 *
 *
 */
@WebServlet(urlPatterns = {"/demo6","/demo7"})
public class ServletDemo_urlPattern extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post...");
    }
}
