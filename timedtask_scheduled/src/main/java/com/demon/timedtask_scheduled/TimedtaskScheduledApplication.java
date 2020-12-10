package com.demon.timedtask_scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TimedtaskScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimedtaskScheduledApplication.class, args);
    }

}
