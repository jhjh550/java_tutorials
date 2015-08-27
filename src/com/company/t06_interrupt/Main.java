package com.company.t06_interrupt;

public class Main {

    public static void main(String[] args) {
	    SleepThread thread = new SleepThread(2000);

        System.out.println("Thread state = "+thread.getState());
        thread.start();
        System.out.println(
                "Thread state(after start) = " + thread.getState());

        try {
            Thread.sleep(1000);
            System.out.println(
                    "Thread state(after 1sec) = " + thread.getState());

            thread.join(500);
            thread.interrupt();
            System.out.println(
                    "Thread sate(after join)="+thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
