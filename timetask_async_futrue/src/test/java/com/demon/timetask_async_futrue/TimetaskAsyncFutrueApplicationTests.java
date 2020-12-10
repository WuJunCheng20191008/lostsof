package com.demon.timetask_async_futrue;

import com.demon.timetask_async_futrue.task.Task;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Slf4j
@SpringBootTest
class TimetaskAsyncFutrueApplicationTests {
    @Autowired
    private Task task;
    @Test
    void contextLoads() throws InterruptedException, TimeoutException, ExecutionException {
        Future<String> future = task.run();
//        get(long timeout, TimeUnit unit)用来获取执行结果，如果在指定时间内，还没获取到结果，就直接返回null,并且抛出异常
        String result = future.get(5, TimeUnit.SECONDS);
        log.info(result);
    }

}
