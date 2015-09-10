package com.company.p01;

import java.net.ServerSocket;

/**
 * Created by Mirim on 2015-09-10.
 */
public class NewQuizServer {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
