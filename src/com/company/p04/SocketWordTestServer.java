package com.company.p04;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-22.
 */
public class SocketWordTestServer {
    public static void main(String[] args) {
        try {
            System.out.println("접속대기...");
            ServerSocket server = new ServerSocket(10000);

            Socket socket = server.accept();


            InetAddress address = socket.getInetAddress();
            System.out.println(address.getHostAddress() + " 로부터 접속했습니다.");

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();


            BufferedReader br =
                    new BufferedReader(new InputStreamReader(in));
            final PrintWriter pw =
                    new PrintWriter(new OutputStreamWriter(out));

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        pw.println("hello");
                        pw.flush();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();


            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("client : " + line);
            }

            pw.close();
            br.close();
            socket.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
