package com.company.t03_thread_method;

/**
 * Created by Mirim on 2015-08-25.
 */
public class MyThread {
    public static void main(String[] args) {
        class SampleThread extends Thread{
            public void run(){
                System.out.println("SampleThread");
            }
        }

        SampleThread t1 = new SampleThread();
        t1.setName("t1name");
        SampleThread t2 = new SampleThread();
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("t1 id:"+t1.getId());
        System.out.println("t2 id:"+t2.getId());

        System.out.println("t1 name:"+t1.getName());
        System.out.println("t2 name:"+t2.getName());

        System.out.println("t1 priority:"+t1.getPriority());
        System.out.println("t2 priority:"+t2.getPriority());




    }
}
