package com.demon.jdbc_template.controller;

import com.demon.jdbc_template.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public String insert(
            @RequestParam(name = "name",required = true)String name,
            @RequestParam(name="age",required = true)Integer age){
        userService.create(name,age);
        return "ok";
    }
}
