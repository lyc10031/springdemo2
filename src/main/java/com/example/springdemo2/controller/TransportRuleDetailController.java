package com.example.springdemo2.controller;

import com.example.springdemo2.dao.pojo.TransportRuleDetail;
import com.example.springdemo2.dao.service.TransprotRuleDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: TransportRuleDetailController
 * @Author leiyongcheng
 * @Date: 2022年02月04日 4:17 下午
 * @Version 1.0
 */

@Slf4j
@RestController
@RequestMapping("/transportDetail")
public class TransportRuleDetailController {

    @Autowired
    private TransprotRuleDetailService transprotRuleDetailService;

    @GetMapping("/all")
    public List<TransportRuleDetail> findAll() {
        return transprotRuleDetailService.findAll();
    }

    @GetMapping("/cover")
    public void cover() {
        log.info("cover is running...");
        transprotRuleDetailService.cover();
    }
}
