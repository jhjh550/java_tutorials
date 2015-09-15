package com.company.t20_chatserver;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * Created by Mirim on 2015-09-10.
 */
public class ChatServer {
    public static void main(String[] args){
        try {
            System.out.println("접속 대기...");
            ServerSocket server = new ServerSocket(10000);

            HashMap hm = new HashMap();
            while(true){
                Socket socket = server.accept();
                ChatThread th = new ChatThread(socket, hm);
                th.start();
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
