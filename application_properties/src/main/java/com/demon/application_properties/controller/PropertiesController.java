package com.demon.application_properties.controller;

import com.demon.application_properties.config.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PropertiesController {
    @Autowired
    private PersonProperties personProperties;
    @GetMapping("/demo")
    public String demo(){
        System.out.println(personProperties);
        return "demo";
    }
}
