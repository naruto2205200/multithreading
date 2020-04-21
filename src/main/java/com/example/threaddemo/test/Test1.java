package com.example.threaddemo.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangxiaofeng
 * @Describetion
 * @date 2020/4/2116:45
 */
@Slf4j
public class Test1 {
    public static void main(String[] args) {
        Thread t = new Thread("heihei"){
            @Override
            public void run(){
                log.debug("running");
            }
        };
        t.start();
        log.debug("runnint--------");
    }
}
