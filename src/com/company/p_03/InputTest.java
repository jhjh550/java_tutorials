package com.company.p_03;

import java.io.*;

/**
 * Created by Mirim on 2015-09-17.
 */
public class InputTest {
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileWriter fw = null;
        FileReader fr = null;

        String line = null;
        try {
            fw = new FileWriter("C:\\Temp\\aaa.txt");
            line = br.readLine();
            System.out.println(line);
            fw.write(line);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
