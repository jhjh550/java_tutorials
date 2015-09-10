package com.company.p01;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-10.
 */
public class NewQuizServer {
    public static void main(String[] args) {
        try {
            System.out.println("접속대기...");
            ServerSocket server = new ServerSocket(10000);
            Socket socket = server.accept();

            InetAddress address = socket.getInetAddress();
            System.out.println(address.getHostAddress()+" 로부터 접속했습니다.");

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            FileInputStream fis = null;
            InputStreamReader isr = null;

            fis = new FileInputStream("C:\\Temp\\quiz01.txt");
            isr = new InputStreamReader(fis);

            BufferedReader br = new BufferedReader(isr);
                    //new BufferedReader(new InputStreamReader(in));
            String line;
            while( (line = br.readLine()) != null ){

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
