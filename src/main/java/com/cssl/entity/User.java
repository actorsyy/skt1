package com.cssl.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer user_id;
    private String user_name; //真实姓名
    private String user_sex;
    private Date user_birthday;
    private String user_phone;
    private String user_logname; //登录名
    private String user_pwd;
    private String user_type; //权限（0超管1普通用户2商品管理员3用户管理员4vip）
    private String user_status; //状态（0禁用1启用）
    private String user_email;
    private String user_img; //头像
    private String user_qq;
    private String user_zipcode; // 邮政编码
}
