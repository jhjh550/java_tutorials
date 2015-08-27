package com.company.t05_sychronized;



public class Main {
    //calc value : 14649
    public static void main(String[] args) {

        Calculate calc = new Calculate();

        MyThread t1 = new MyThread(calc);
        MyThread t2 = new MyThread(calc);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("calc value : "+calc.getAmount());


    }
}
