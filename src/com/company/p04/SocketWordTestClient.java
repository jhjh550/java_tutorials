package com.company.p04;

import java.io.*;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-22.
 */
public class SocketWordTestClient {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("127.0.0.1", 10000);
            BufferedReader keyboard =
                    new BufferedReader(new InputStreamReader(System.in));

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            PrintWriter pw
                    = new PrintWriter(new OutputStreamWriter(out));
            final BufferedReader br
                    = new BufferedReader(new InputStreamReader(in));
            String line = null;

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String echo = null;
                        try {
                            echo = br.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("server : " + echo);
                    }
                }
            }).start();


            while((line = keyboard.readLine()) != null){
                pw.println(line);
                pw.flush();


            }
            pw.close();
            br.close();
            socket.close();




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
