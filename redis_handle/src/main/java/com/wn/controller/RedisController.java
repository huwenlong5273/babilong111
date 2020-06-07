package com.wn.controller;

import com.wn.com.ParmAndResult;
import com.wn.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("getVal")
    public ParmAndResult getVal(@RequestBody ParmAndResult parmAndResult){

        ParmAndResult val = redisService.getVal(parmAndResult);

        return val;
    }
}
