package com.demon.redis.controller;

import com.demon.redis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate<String, User> redisTemplate;
    @PostMapping("demo")
    public void demo(){
        stringRedisTemplate.opsForValue().set("aaa","111");
    }
    @PostMapping("insertUser")
    public void insertUser(){
        User user = new User();
        user.setUsername("demon");
        user.setAge(20);
        redisTemplate.opsForValue().set(user.getUsername(),user);
    }
}
