package com.company.t15_StreamReaderTest;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by Mirim on 2015-09-03.
 */
public class StreamReaderTest {
    public static void main(String[] args){

        FileInputStream fis = null;
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;

        try {
            fis = new FileInputStream("C:\\Temp\\pg1661.txt");
            isr = new InputStreamReader(fis);
            osw = new OutputStreamWriter(System.out);



        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
