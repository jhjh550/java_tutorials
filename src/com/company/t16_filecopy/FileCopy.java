package com.company.t16_filecopy;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Mirim on 2015-09-03.
 */
public class FileCopy {
    public static void main(String[] args){

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("C:\\Temp\\pg1661.txt");
            fw = new FileWriter("C:\\Temp\\pg1661_copy.txt");
            char[] buffer = new char[512];
            int readcount= 0;
            while((readcount = fr.read(buffer)) != -1){
                fw.write(buffer,0,readcount);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
