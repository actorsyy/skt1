package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.cssl.dao.*")
@SpringBootApplication
public class KwxMain {
    public static void main(String[] args) {
        SpringApplication.run(KwxMain.class,args);
    }
}
