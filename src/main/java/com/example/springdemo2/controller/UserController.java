package com.example.springdemo2.controller;

import com.example.springdemo2.dao.pojo.User;
import com.example.springdemo2.dao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: UserController
 * @Author leiyongcheng
 * @Date: 2022年02月04日 3:26 下午
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findGt")
    public List<User> findGt() {
        return userService.findGt();
    }
    @GetMapping("/findPage")
    public List<User> findPage(@RequestParam("page" )Integer current,
                               @RequestParam("pageSize") Integer size) {
        return userService.findPage(current,size);
    }


}
