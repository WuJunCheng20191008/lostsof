package com.demon.timedtask_async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class TimedtaskAsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimedtaskAsyncApplication.class, args);
    }

}
