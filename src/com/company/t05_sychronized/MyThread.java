package com.company.t05_sychronized;

/**
 * Created by Mirim on 2015-08-25.
 */
public class MyThread extends Thread {
    private Calculate calc;

    public MyThread(Calculate calc){
        this.calc = calc;
    }

    public void run(){
        for(int i=0; i<10000; i++){
            calc.plus(1);
        }
    }



}
