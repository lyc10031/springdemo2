package com.example.springdemo2.dao.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.springdemo2.dao.mapper.TransportRuleDetailMapper;
import com.example.springdemo2.dao.pojo.TransportRuleDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TransprotRuleDetailService
 * @Author leiyongcheng
 * @Date: 2022年02月04日 4:15 下午
 * @Version 1.0
 */
@Service
@Slf4j
public class TransprotRuleDetailService {

    @Autowired
    private TransportRuleDetailMapper transportRuleDetailMapper;

    public List<TransportRuleDetail> findAll() {
        return transportRuleDetailMapper.selectList(new LambdaQueryWrapper<>());
    }

    public void cover() {
        JSONArray array = new JSONArray();
        List<TransportRuleDetail> all = this.findAll();
        for(TransportRuleDetail t:all) {
            JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(t));
            array.add(jsonObject);
        }
        sendMsg(array);
//        return array;
    }

    private void sendMsg(JSONArray arr) {
        log.info("star send >>>");
        for (int i = 0; i < arr.size(); i++) {
            log.info("sending\n\t{}",arr.getJSONObject(i));
        }
        log.info("<<< send complete");
    }
}
