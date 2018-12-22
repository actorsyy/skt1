package com.cssl.util;


import com.cssl.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class UserListener implements HttpSessionListener,ServletContextListener{
    private ServletContext application;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
            this.application = sce.getServletContext();
            this.application.setAttribute("ulist",new ArrayList<String>());
            System.out.println(application);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        session.setMaxInactiveInterval(120);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        User user = (User) session.getAttribute("user");
        if(null!=user){
            // 从application中获取list里面的对象判断
            List<String> list = (List<String>) application.getAttribute("ulist");
            if(list.contains(user.getUser_name())){
                list.remove(user.getUser_name());
            }

        }

    }
}
