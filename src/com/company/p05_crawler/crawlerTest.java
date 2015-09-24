package com.company.p05_crawler;

import java.io.*;
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


        try {
            InputStream in = url.openStream();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(in));
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("http read end");



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
