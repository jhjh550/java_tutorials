package com.company.p05_crawler;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Mirim on 2015-09-24.
 */
public class crawlerTest {
    public void crawl(String address){
        URL url = null;

        try {
            url = new URL(address);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }

        try {
            InputStream in = url.openStream();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(in));
            String line = null;
            while((line = br.readLine()) != null){
                //System.out.println(line);
                int startIndex = 0;
                int endIndex = 0;
                while (startIndex >= 0){
                    startIndex = line.indexOf("http", startIndex);
                    endIndex = line.indexOf("\"", startIndex);

                    if(startIndex> 0 && endIndex>0) {
                        String result = line.substring(startIndex, endIndex);
                        System.out.println(result);
                        crawl(result);
                    }else{
                        startIndex = endIndex = 0;
                        break;
                    }
                    startIndex = endIndex;
                }
            }
            System.out.println("http read end");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        crawlerTest t = new crawlerTest();
        t.crawl("http://www.google.com");
    }
}