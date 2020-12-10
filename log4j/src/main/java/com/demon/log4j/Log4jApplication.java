package com.demon.log4j;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.demon.log4j.mapper")
@SpringBootApplication
public class Log4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(Log4jApplication.class, args);
    }

}
