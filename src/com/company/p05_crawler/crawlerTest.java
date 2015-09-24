package com.company.p05_crawler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Mirim on 2015-09-24.
 */
public class crawlerTest {
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

            byte[] buffer = new byte[512];
            int readCount = 0;
            while((readCount = in.read(buffer)) != -1){


            }
            System.out.println("file saved");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
