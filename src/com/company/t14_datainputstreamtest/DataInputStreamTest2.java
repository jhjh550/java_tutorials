package com.company.t14_datainputstreamtest;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Created by Mirim on 2015-09-03.
 */
public class DataInputStreamTest2 {
    public static void main(String[] args){
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream("C:\\Temp\\myTest.bin");
            dis = new DataInputStream(fis);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
