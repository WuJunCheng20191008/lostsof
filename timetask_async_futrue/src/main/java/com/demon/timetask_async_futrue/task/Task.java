package com.demon.timetask_async_futrue.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

@Slf4j
@Component
public class Task {

    public static Random random = new Random();
    @Async("taskExecutor")
    public Future<String> run() throws InterruptedException {
        long sleep = random.nextInt(10000);
        log.info("开始任务，需要耗时：" + sleep + "毫秒");
        Thread.sleep(sleep);
        log.info("任务完成");
        return new AsyncResult<>("test");
    }
}
