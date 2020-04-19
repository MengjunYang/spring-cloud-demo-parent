package com.yang.common.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author yangmengjun
 * @title: User
 * @description: 用户实体
 * @date 2020/4/19 22:01
 */
@ToString
@Data
public class User {
    private String name;
    private String password;
}
