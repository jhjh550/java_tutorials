package com.company.p01;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-10.
 */
public class QuizServer {
    public static void main(String[] args){
        try{
            System.out.println("접속대기...");
            ServerSocket server = new ServerSocket(10000);
            Socket socket = server.accept();

            InetAddress address = socket.getInetAddress();
            System.out.println(address.getHostAddress()+" 로부터 접속했습니다.");

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

//            BufferedReader br =
//                    new BufferedReader(new InputStreamReader(in));
            PrintWriter pw =
                    new PrintWriter(new OutputStreamWriter(out));


            FileInputStream fis = null;
            fis = new FileInputStream("C:\\Temp\\quiz01.txt");

            BufferedReader br =
                    new BufferedReader(new InputStreamReader(fis));
            //int i = 0;
            //byte[] buffer = new byte[512];
            //while((i = fis.read(buffer))!=-1){
            String line;
            while((line=br.readLine())!=null){



                //System.out.write(i);
                //System.out.write(buffer, 0, i);
                pw.println(line);
                pw.flush();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
