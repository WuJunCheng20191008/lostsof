package com.demon.global_exception.controller;

import com.demon.global_exception.config.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/jsonHello")
    public String jsonHello() throws MyException{
        throw new MyException("myExceptioin异常");
    }
}
