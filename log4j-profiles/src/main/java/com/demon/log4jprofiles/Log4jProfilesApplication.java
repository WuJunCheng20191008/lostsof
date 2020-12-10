package com.demon.log4jprofiles;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.demon.log4jprofiles.mapper")
@SpringBootApplication
public class Log4jProfilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Log4jProfilesApplication.class, args);
    }

}
