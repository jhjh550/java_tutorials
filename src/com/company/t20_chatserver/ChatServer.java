package com.company.t20_chatserver;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-10.
 */
public class ChatServer {
    public static void main(String[] args){
        try {
            System.out.println("���� ���...");
            ServerSocket server = new ServerSocket(10000);

            while(true){
                Socket socket = server.accept();
                ChatThread th = new ChatThread(socket);
                th.start();
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
