package com.wn.service.impl;

import com.wn.com.ParmAndResult;
import com.wn.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public ParmAndResult getVal(ParmAndResult parmAndResult) {
        ValueOperations<String, String> val = stringRedisTemplate.opsForValue();
        String s = val.get(parmAndResult.getT());
        //判断redis获取的是否为空值
        if (s != null){
            return ParmAndResult.succeed().setT(s);
        }
        return parmAndResult.err();
    }
}
