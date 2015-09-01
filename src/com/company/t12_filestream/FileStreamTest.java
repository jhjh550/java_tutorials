package com.company.t12_filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Mirim on 2015-09-01.
 */
public class FileStreamTest {
    public static void main(String[] args){

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Temp\\Slog.log");
            int i = 0;
            while((i = fis.read())!=-1){
                System.out.write(i);
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            fis.close();
        }
    }
}










