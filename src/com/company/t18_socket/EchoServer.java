package com.company.t18_socket;

import java.io.*;
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

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            BufferedReader br =
                    new BufferedReader(new InputStreamReader(in));
            PrintWriter pw =
                    new PrintWriter(new OutputStreamWriter(out));

            String line = null;
            while((line = br.readLine()) != null){
                System.out.println("Ŭ���̾�Ʈ���� ���� ���� ���ڿ�"+line);
                pw.println(line);
                pw.flush();
            }
            pw.close();
            br.close();
            socket.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}







