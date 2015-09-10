package com.company.t20_chatserver;

import java.net.ServerSocket;

/**
 * Created by Mirim on 2015-09-10.
 */
public class ChatServer {
    public static void main(String[] args){
        try {
            System.out.println("접속 대기...");
            ServerSocket server = new ServerSocket(10000);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
