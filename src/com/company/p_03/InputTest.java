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
        try {
            fr = new FileReader("C:\\Temp\\aaa.txt");
            char[] buffer = new char[512];
            int readcount = 0;
            while((readcount = fr.read(buffer)) != -1 ){
                System.out.println(buffer);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
