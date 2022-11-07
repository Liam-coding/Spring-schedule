package com.example.springschedule.controller;

import com.example.springschedule.schedule.ScheduleList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class HelloController {
    @Autowired
    ScheduleList scheduleList;

    @PostMapping("run_schedule")
    public void runSchedule() throws InterruptedException {
        scheduleList.print();
    }
}
