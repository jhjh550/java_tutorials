package com.company.t07_notify;

/**
 * Created by Mirim on 2015-08-27.
 */
public class StateThread extends Thread {
    private Object monitor;

    public StateThread(Object monitor){
        this.monitor = monitor;
    }

    public void run(){
        for(int i=0; i<10000; i++) {
            String a = "a";
        }
        synchronized (monitor){
            try {
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+"is notified");

        }
    }


}




