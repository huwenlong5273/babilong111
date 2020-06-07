package com.user.controller;

import com.user.service.UserService;
import com.wn.com.ParmAndResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getVal")
    public ParmAndResult getVal(@RequestBody ParmAndResult parmAndResult){
        ParmAndResult val = userService.getVal(parmAndResult);
        return val;
    }
}
