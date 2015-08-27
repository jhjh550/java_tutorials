package com.company.T04_daemon;

public class Main {

    public static void main(String[] args) {
	    class DeamonThread extends Thread{
            public void run(){
                try {
                    sleep(Long.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        DeamonThread t = new DeamonThread();
        t.setDaemon(true);
        t.start();
    }
}
