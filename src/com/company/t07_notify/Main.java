package com.company.t07_notify;

public class Main {

    public static void main(String[] args) {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);

        System.out.println("thread state="+thread.getState());
        thread.start();
        System.out.println(
                "thread state(after start)=" + thread.getState());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
                "thread state(0.1sec)="+thread.getState());

        synchronized (monitor){
            monitor.notify();
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "thread state(after join)=" + thread.getState());
    }
}











