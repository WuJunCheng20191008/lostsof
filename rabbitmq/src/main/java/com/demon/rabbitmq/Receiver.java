package com.demon.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者Receiver
 * 通过@RabbitListener注解定义该类对hello队列的监听
 * 用@RabbitHandler注解来指定对消息的处理方法
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver:"+hello);
    }
}
