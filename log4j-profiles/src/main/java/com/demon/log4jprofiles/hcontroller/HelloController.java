package com.demon.log4jprofiles.hcontroller;

import com.demon.log4jprofiles.entity.ApplicationProperties;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ApplicationProperties applicationProperties;

    @GetMapping("hello")
    public void hello(){

        logger.info("hello");
    }
    @GetMapping("error")
    public void error(){
        logger.debug("debug =====================");
        logger.info("info =====================");
        logger.error("error =====================");
        logger.info(applicationProperties.toString());
    }
}
