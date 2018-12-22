package com.cssl.util;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MyMvcConfiger implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有请求 除了static资源
        registry.addInterceptor(new MyIntercepor()).addPathPatterns("/**").excludePathPatterns("/static/**");
    }
}
