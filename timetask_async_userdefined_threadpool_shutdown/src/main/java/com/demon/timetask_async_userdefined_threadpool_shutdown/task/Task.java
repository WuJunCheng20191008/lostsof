package com.demon.timetask_async_userdefined_threadpool_shutdown.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Task {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Async("taskExecutor")
    public void doTaskOne(){
        log.info("开始做任务一");
        long start = System.currentTimeMillis();
        log.info(stringRedisTemplate.randomKey());
        long end = System.currentTimeMillis();
        log.info("任务一完成时间："+(end-start)+"毫秒");
    }
    @Async("taskExecutor")
    public void doTaskTwo(){
        log.info("开始做任务二");
        long start = System.currentTimeMillis();
        log.info(stringRedisTemplate.randomKey());
        long end = System.currentTimeMillis();
        log.info("任务二完成时间："+(end-start)+"毫秒");
    }
    @Async("taskExecutor")
    public void doTaskThree(){
        log.info("开始做任务三");
        long start = System.currentTimeMillis();
        log.info(stringRedisTemplate.randomKey());
        long end = System.currentTimeMillis();
        log.info("任务三完成时间："+(end-start)+"毫秒");
    }
}
