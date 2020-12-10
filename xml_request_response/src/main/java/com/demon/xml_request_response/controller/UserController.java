package com.demon.xml_request_response.controller;

import com.demon.xml_request_response.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    https://blog.csdn.net/shinebar/article/details/54408020
//    consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
//    produces:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
    @PostMapping(value = "/user",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public User create(@RequestBody User user) {
        user.setName("demon:" + user.getName());
        user.setAge(user.getAge() + 200);
        return user;
    }
}
