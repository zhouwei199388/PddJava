package com.zw.controller;

import com.zw.http.model.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zw on 2019/3/23.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/test",method = RequestMethod.GET)
public class TestController {
    @RequestMapping("/getUser")
    public User getUser(){
         User user = new User();
         user.setName("test");
         return user;
    }
}
