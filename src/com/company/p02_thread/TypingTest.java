package com.company.p02_thread;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-15.
 * 1. 일정시간마다
 2. String 배열에 저장된
 3. 임의의 단어를 출력

 4. 해당하는 단어를 타이핑 하면
 5. 리스트에서 사라지게 하기
 */
public class TypingTest {

    public static void main(String[] args){
        //String[] data = {"If", "two", "instances" ,"of", "Random"};// are created with the same seed, and the same sequence of method calls is made for each, they will generate and return identical sequences of numbers. In order to guarantee this property, particular algorithms are specified for the class Random. Java implementations must use all the algorithms shown here for the class Random, for the sake of absolute portability of Java code. However, subclasses of class Random are permitted to use other algorithms, so long as they adhere to the general contracts for all the methods}
        //Random random = new Random();
//        Thread th = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while(true) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    int index = random.nextInt(data.length);
//                    String word = data[index];
//                    list.add(word);
//
//                    for (int i = 0; i < list.size(); i++) {
//                        System.out.print(list.get(i) + " ");
//                    }
//                    System.out.println("");
//                }
//            }
//        });


        ArrayList<String> list = new ArrayList<String>();
        WordThread th = new WordThread(list);
        th.start();

        while(true) {
            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();

            for(int i=0; i<list.size(); i++){
                if(input.equals(list.get(i))){
                    list.remove(i);
                    break;
                }
            }
        }

    }
}











/*
ArrayList<String> list = new ArrayList<String>();
        while(true){
            try {
                Thread.sleep(1000);
                String addData = data[random.nextInt(data.length)];

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
 */