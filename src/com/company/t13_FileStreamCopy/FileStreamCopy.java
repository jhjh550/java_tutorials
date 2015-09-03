package com.company.t13_FileStreamCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Mirim on 2015-09-03.
 */
public class FileStreamCopy {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("C:\\Temp\\PV3.txt");
            fos = new FileOutputStream("C:\\Temp\\PV3_copy.txt");
            byte[] buffer = new byte[512];
            int readcount=0;
            while((readcount = fis.read(buffer)) != -1){
                fos.write(buffer,0,readcount);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
