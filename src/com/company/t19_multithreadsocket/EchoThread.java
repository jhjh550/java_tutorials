package com.company.t19_multithreadsocket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-10.
 */
public class EchoThread extends Thread{
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
                System.out.println("from client : "+line);
                pw.println(line);
                pw.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
