package com.example.threaddemo.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxiaofeng
 * @Describetion
 * @date 2020/4/2116:50
 */
@Slf4j
public class Test2 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                log.debug("r running---");
            }
        };
        // lambda简化
        Runnable r2 = () -> log.debug("r running---");

        Thread t = new Thread(r,"haha");
        t.start();
    }
}
