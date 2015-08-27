package com.company.t01_thread;

/**
 * Created by Mirim on 2015-08-25.
 */
public class MyThread {
    public static void main(String[] args){
        class SampleThread extends Thread{
            public void run(){
                System.out.println("SampleThread");
            }
        }

        class SampleRunnable implements Runnable{

            @Override
            public void run() {
                System.out.println("SampleRunnable");
            }
        }



        for(int i=0; i<100; i++){
            new SampleThread().start();
            new Thread(new SampleRunnable()).start();
        }

        System.out.println("Program end");
    }
}
