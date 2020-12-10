package com.demon.log4j.controller;

import com.demon.log4j.entity.User;
import com.demon.log4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("getUserById/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
