package com.example.springdemo2.dao.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springdemo2.dao.mapper.UserMapper;
import com.example.springdemo2.dao.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: UserService
 * @Author leiyongcheng
 * @Date: 2022年02月04日 3:20 下午
 * @Version 1.0
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.selectList(new LambdaQueryWrapper<>());
    }

    public List<User> findPage(int current,int pageSize) {
        Page<User> userPage = new Page<>(current,pageSize);
        userMapper.selectPage(userPage,new LambdaQueryWrapper<>());
        log.info("total:{}",userPage.getTotal());
        log.info("page:{}",userPage.getPages());
        return userPage.getRecords();
    }

    public List<User> findGt() {
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.gt(User::getAge,20);
        return  userMapper.selectList(userLambdaQueryWrapper);
    }

}
