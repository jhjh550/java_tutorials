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

            boolean b   = dis.readBoolean();
            byte b2     = dis.readByte();
            int i       = dis.readInt();
            double d    = dis.readDouble();
            String s    = dis.readUTF();

            System.out.println("boolean : "+b);
            System.out.println("byte: " + b2);
            System.out.println("int : "+i);
            System.out.println("double : "+d);
            System.out.println("string : "+s);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
