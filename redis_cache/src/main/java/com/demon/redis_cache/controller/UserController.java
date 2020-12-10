package com.demon.redis_cache.controller;

import com.demon.redis_cache.entity.User;
import com.demon.redis_cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private CacheManager cacheManager;
    @GetMapping("getUserById/{id}")
    public User getUserById(@PathVariable Integer id){
        User user = userService.getUserById(id);
        return user;
    }
    @PostMapping("updateUser")
    public void uypdateUser(@RequestBody User user){
         userService.updateUser(user);
    }
}
