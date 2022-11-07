package com.example.springschedule.schedule;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableScheduling
@EnableAsync
public class ScheduleList {
//    @Scheduled(fixedDelay = 5000)
//    public static void print() {
//        System.out.println("this is running");
//    }

    @Scheduled(fixedRate = 4000)
    @Async
    public void print() throws InterruptedException {
        long start = System.currentTimeMillis();
        Date startData = new Date(System.currentTimeMillis());
        System.out.println("this is running:"+startData+",thread:"+Thread.currentThread().getName());
        Thread.sleep(10000);
        long end = System.currentTimeMillis();
        Date endData = new Date();
        System.out.println("already finished:"+endData+",thread:"+Thread.currentThread().getName());
        System.out.println("it took:"+(end-start)/1000+"s");
    }

}
