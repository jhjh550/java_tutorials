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
        //<div id=gbar><nobr><b class=gb1>검색</b> <a class=gb1 href="http://www.google.co.kr/imghp?hl=ko&tab=wi">이미지</a>

        try {
            InputStream in = url.openStream();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(in));
            String line = null;
            while((line = br.readLine()) != null){
                //System.out.println(line);
                int startIndex = line.indexOf("href");
                int endIndex = line.indexOf(">", startIndex);

                String result = line.substring(startIndex, endIndex);
                System.out.println(result);



            }
            System.out.println("http read end");



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//String res = line.substring(startIndex, endIndex);
//System.out.println(res);
//                System.out.println("start:"+startIndex+" end:"+endIndex);
//                if(startIndex>0)
//                    System.out.println(line.substring(startIndex));