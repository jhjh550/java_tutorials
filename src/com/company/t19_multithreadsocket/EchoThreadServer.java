package com.company.t19_multithreadsocket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 * Created by Mirim on 2015-09-10.
 */
public class EchoThreadServer {
    public static void main(String[] args){
        class EchoThread extends Thread{
            private Socket socket;
            public EchoThread(Socket socket){
                this.socket = socket;
            }

            public void run(){
                InetAddress address = socket.getInetAddress();
                System.out.println(address.getHostAddress()+" 부터 접속했습니다.");
                try {
                    OutputStream out = socket.getOutputStream();
                    InputStream in = socket.getInputStream();

                    BufferedReader br =
                            new BufferedReader(new InputStreamReader(in));
                    PrintWriter pw =
                            new PrintWriter(new OutputStreamWriter(out));

                    String line;
                    while((line = br.readLine())!= null){

                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }

        try{
            ServerSocket server = new ServerSocket(10001);
            System.out.println("접속대기....");

            while (true){
                Socket socket = server.accept();
                EchoThread th = new EchoThread(socket);
                th.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
