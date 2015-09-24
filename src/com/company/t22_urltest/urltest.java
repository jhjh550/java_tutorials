package com.company.t22_urltest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Mirim on 2015-09-24.
 */
public class urltest {
    public static void main(String[] args){
        URL url = null;

        try {
            url = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        FileOutputStream fos = null;
        try {
            InputStream in = url.openStream();
            fos = new FileOutputStream("c://temp//url.html");

            byte[] buffer = new byte[512];
            int readCount = 0;
            while((readCount = in.read(buffer)) != -1){
                fos.write(buffer);
            }
            System.out.println("file saved");


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}




