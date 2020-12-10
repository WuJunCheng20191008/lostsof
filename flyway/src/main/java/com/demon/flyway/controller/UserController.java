package com.demon.flyway.controller;

import com.demon.flyway.entity.User;
import com.demon.flyway.service.UserService;
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
    public Integer getUserById(@PathVariable Integer id){
        Integer count = userService.getUserById(id);
        return count;
    }
}
