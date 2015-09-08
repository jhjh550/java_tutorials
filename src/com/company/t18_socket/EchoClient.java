package com.company.t18_socket;

import java.net.Socket;

/**
 * Created by Mirim on 2015-09-08.
 */
public class EchoClient {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("127.0.0.1", 10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
