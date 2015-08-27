package com.company.t02_sleep;

/**
 * Created by Mirim on 2015-08-25.
 */
public class MySleep {
    public static void main(String[] args) {
        class MyThread extends Thread{
            public void run(){
                while(true) {
                    try {
                        System.out.println("Before sleep");
                        sleep(1000);
                        System.out.println("After sleep");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        new MyThread().start();
    }
}
