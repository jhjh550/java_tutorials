package com.company.t14_datainputstreamtest;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Created by Mirim on 2015-09-03.
 */
public class DataInputStreamTest {
    public static void main(String[] args){
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream("C:\\Temp\\myTest.bin");
            dos = new DataOutputStream();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
