package com.xielang.prometheusgrafana;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//定时执行的任务，用于给服务器压力，便于看到granfana的效果
@Component
public class cronTask {
    //每隔5秒执行一次
     @Scheduled(fixedRate = 500)
    public void task() {
        System.out.println("task");
    }
}
