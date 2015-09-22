package com.company.p04;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Mirim on 2015-09-15.
 */
public class SocketWordThread extends Thread {
    String[] data = {"If", "two", "instances" ,"of", "Random"};// are created with the same seed, and the same sequence of method calls is made for each, they will generate and return identical sequences of numbers. In order to guarantee this property, particular algorithms are specified for the class Random. Java implementations must use all the algorithms shown here for the class Random, for the sake of absolute portability of Java code. However, subclasses of class Random are permitted to use other algorithms, so long as they adhere to the general contracts for all the methods}
    Random random = new Random();
    ArrayList<String> list;

    public SocketWordThread(ArrayList<String> list){
        this.list = list;
    }

    public void run(){
        while(true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int index = random.nextInt(data.length);
            String word = data[index];
            list.add(word);

            for (int i = 0; i < list.size(); i++) {
                pw.print(list.get(i) + " ");
            }
            pw.println("");
        }
    }
}







