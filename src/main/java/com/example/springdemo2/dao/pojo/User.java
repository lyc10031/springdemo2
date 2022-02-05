package com.example.springdemo2.dao.pojo;

import lombok.Data;

/**
 * @Description: User
 * @Author leiyongcheng
 * @Date: 2022年02月04日 3:17 下午
 * @Version 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private Integer age;
}
