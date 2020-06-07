package com.user.service.impl;

import com.user.feign.RedisFeign;
import com.user.service.UserService;
import com.wn.com.ParmAndResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RedisFeign redisFeign;
    @Override
    public ParmAndResult getVal(ParmAndResult parmAndResult) {

        ParmAndResult val = redisFeign.getVal(parmAndResult);
        return val;
    }
}
