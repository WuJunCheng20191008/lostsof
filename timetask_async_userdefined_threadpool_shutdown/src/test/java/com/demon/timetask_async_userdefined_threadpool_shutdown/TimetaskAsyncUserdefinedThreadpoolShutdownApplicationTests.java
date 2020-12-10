package com.demon.timetask_async_userdefined_threadpool_shutdown;

import com.demon.timetask_async_userdefined_threadpool_shutdown.task.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TimetaskAsyncUserdefinedThreadpoolShutdownApplicationTests {

    @Autowired
    private Task task;
    @Test
    void contextLoads() {
        for (int i=0;i<10000;i++){
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();
            if(i==9999){
                System.out.println("程序退出");
                System.exit(0);
            }
        }
    }

}
