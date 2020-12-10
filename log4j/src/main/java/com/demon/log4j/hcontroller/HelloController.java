package com.demon.log4j.hcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("hello")
    public void hello(){

        logger.info("hello");
    }
    @GetMapping("error")
    public void error(){
        logger.debug("debug =====================");
        logger.info("info =====================");
        logger.error("error =====================");
    }
}
