package com.company.t11_systeminputTest;

import java.io.IOException;

/**
 * Created by Mirim on 2015-09-01.
 */
public class SystemInputTest {
    public static void main(String[] args){
        int i =0;

        try {
            while((i = System.in.read())!=-1){
                System.out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
