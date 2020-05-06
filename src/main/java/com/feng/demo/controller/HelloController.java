package com.feng.demo.controller;

import com.feng.demo.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("hello", "filter");
//        return map;
        return "{\"hello\":\"filter\"}";

        /*User user = new User("tom", 18);
        return user;*/
    }

    @RequestMapping("/user")
    public User sayUser(){
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("hello", "filter");
//        return map;

        User user = new User("tom", 18);
        return user;
    }
}
