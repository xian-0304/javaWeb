package com.lxq.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebServlet("/demo5")
public class ServletDemo_getpost implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        //根据不同的请求方式，处理不同的代码get、post

        HttpServletRequest request = (HttpServletRequest) servletRequest;

        //1.Request请求方式
        String method = request.getMethod();

        //2.判断并处理
        if ("GET".equals(method)){
            // get方式处理
            doGet();
        } else if ("POST".equals(method)) {
            // POST方式处理
            doPost();
        }

    }


    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
    private void doPost() {
    }

    private void doGet() {
    }

}
