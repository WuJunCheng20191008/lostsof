package com.demon.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("demo")
    public String demo(ModelMap modelMap){
        modelMap.addAttribute("host","www.baidu.com");
        return "index";
    }

}
