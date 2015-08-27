package com.company.t06_interrupt;

/**
 * Created by Mirim on 2015-08-27.
 */
public class SleepThread extends Thread {
    long sleepTime;

    public SleepThread(long sleepTime){
        this.sleepTime = sleepTime;
    }

    public void run(){
        System.out.println("Sleeping "+getName());
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stopping " + getName());
    }
}









