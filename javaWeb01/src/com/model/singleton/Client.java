package com.model.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author kelvin
 * @date 2020/3/6 - 12:00
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        int countDownNum = 10;

        CountDownLatch countDownLatch = new CountDownLatch(countDownNum);

        for (int i = 0; i < countDownNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
//                        Object instance = Demo4.getInstance();
                        Object instance = Demo3.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("time:"+(end-start));
    }
}
