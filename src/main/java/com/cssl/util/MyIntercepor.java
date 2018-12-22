package com.cssl.util;

import com.cssl.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyIntercepor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截请求------------------------------");
        String uri = request.getRequestURI();
        if("/vote/list".endsWith(uri)||"/vote/newToupiao".endsWith(uri)||"/vote/exit".endsWith(uri)||"/vote/addTitle".endsWith(uri)||"/vote/toupiao".endsWith(uri)) {
            System.out.println("拦截到请求"+uri);
            HttpSession session = request.getSession();
            User user = (User)session.getAttribute("user");
            if(null==user) {
                System.out.println("未登录");
                response.sendRedirect("/vote/login.html");
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
