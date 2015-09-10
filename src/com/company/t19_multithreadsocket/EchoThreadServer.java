package com.company.t19_multithreadsocket;

import java.net.ServerSocket;
import java.net.Socket;

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
