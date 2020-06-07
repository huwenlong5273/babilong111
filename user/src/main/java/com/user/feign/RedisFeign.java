package com.user.feign;

import com.wn.com.ParmAndResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("redis")
public interface RedisFeign {

    @RequestMapping("getVal")
    public ParmAndResult getVal(ParmAndResult parmAndResult);
}
