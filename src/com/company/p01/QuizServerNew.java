package com.company.p01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-10.
 */
public class QuizServerNew {
    public static void main(String[] args){
        try {
            System.out.println("접속대기...");
            ServerSocket server = new ServerSocket(10000);

            Socket socket = server.accept();
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            FileInputStream fis = null;
            InputStreamReader isr = null;

            fis = new FileInputStream("C:\\Temp\\quiz01.txt");
            isr = new InputStreamReader(fis);

            BufferedReader br = new BufferedReader(isr);

            PrintWriter pw =
                    new PrintWriter(new OutputStreamWriter(out));


            String line;
            while((line = br.readLine())!=null){
                pw.println(line);
                pw.flush();
            }

            //Thread.sleep(100000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
