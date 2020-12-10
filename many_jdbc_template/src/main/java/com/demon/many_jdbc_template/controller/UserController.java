package com.demon.many_jdbc_template.controller;

import com.demon.many_jdbc_template.service.UserService;
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

    @PostMapping("/insertToTest1")
    public String insertToTest1(@RequestParam String name,@RequestParam Integer age){
        userService.insertToTest1(name,age);
        return "ok test1";
    }
    @PostMapping("/insertToTest2")
    public String insertToTest2(@RequestParam String name,@RequestParam Integer age){
        userService.insertToTest2(name,age);
        return "ok test2";
    }
}
