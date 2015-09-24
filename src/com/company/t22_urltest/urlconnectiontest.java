package com.company.t22_urltest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Mirim on 2015-09-24.
 */
public class urlconnectiontest {
    public static void main(String[] args){
        URL url = null;
        try {
            url = new URL("http://www.daum.net");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("c://temp//daumquery.html");
            URLConnection urlConn = url.openConnection();
            String contentType = urlConn.getContentType();
            System.out.println(contentType);

            InputStream in = urlConn.getInputStream();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}











