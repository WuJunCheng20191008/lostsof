package com.demon.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息生产者Sender
 * 通过注入AmqpTemplate接口的实例来实现消息的发送
 * 产生一个字符串，并发送到名为hello的队列中
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(){
        String context = "hello" + new Date();
        System.out.println("Sender:" + context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }
}
