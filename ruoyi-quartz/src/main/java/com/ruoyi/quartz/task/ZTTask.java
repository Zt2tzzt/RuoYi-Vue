package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

@Component
public class ZTTask {
    public void showTime() {
        System.out.println("ZTTask.showTime 执行，当前时间：" + System.currentTimeMillis());
    }
}
