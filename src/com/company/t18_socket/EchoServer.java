package com.company.t18_socket;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-08.
 */
public class EchoServer {
    public static void main(String[] args){
        try {
            System.out.println("���Ӵ��...");
            ServerSocket server = new ServerSocket(10000);

            Socket socket = server.accept();
            InetAddress address = socket.getInetAddress();
            System.out.println(address.getHostAddress()+" �κ��� �����߽��ϴ�.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
