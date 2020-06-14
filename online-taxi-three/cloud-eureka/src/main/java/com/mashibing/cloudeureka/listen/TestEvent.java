package com.mashibing.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

@Component
public class TestEvent {


    public void listen(EurekaInstanceCanceledEvent event){
        // 发邮件 短信
        System.out.println("下线:"+event.getServerId());
    }


}
