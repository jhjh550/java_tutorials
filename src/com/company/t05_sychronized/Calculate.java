package com.company.t05_sychronized;

import java.util.Objects;

/**
 * Created by Mirim on 2015-08-25.
 */
public class Calculate {
    private int amount;
    public Calculate(){
        amount = 0;
    }

    private Object lock = new Object();
    //public synchronized void plus(int value){
    public void plus(int value){
        synchronized (lock) {
            amount += value;
        }
    }
    public void minus(int value){
        amount -= value;
    }
    public int getAmount(){
        return amount;
    }

}
