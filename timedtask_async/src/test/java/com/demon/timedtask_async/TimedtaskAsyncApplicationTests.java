package com.demon.timedtask_async;

import com.demon.timedtask_async.orderjob.AsyncTask;
import com.demon.timedtask_async.orderjob.AsyncTask_Callback;
import com.demon.timedtask_async.orderjob.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Future;

@SpringBootTest
class TimedtaskAsyncApplicationTests {

    @Autowired
    private Task task;
    @Autowired
    private AsyncTask asyncTask;
    @Autowired
    private AsyncTask_Callback asyncTask_callback;
    /**
     * 同步调用
     * @throws InterruptedException
     */
    @Test
    void contextLoads() throws InterruptedException {
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
    }
    @Test
    void asyncTask() throws InterruptedException {
        asyncTask.doTaskOne();
        asyncTask.doTaskTwo();
        asyncTask.doTaskThree();
    }
    @Test
    void asyncTaskCallback() throws InterruptedException {

        long start = System.currentTimeMillis();
        Future<String> task1 = asyncTask_callback.doTaskOne();
        Future<String> task2 =asyncTask_callback.doTaskTwo();
        Future<String> task3 =asyncTask_callback.doTaskThree();
        while(true){
            if(task1.isDone() && task2.isDone() && task3.isDone()){
                //三个任务调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end-start)+"毫秒");
    }


}
