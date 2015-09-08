package com.company.t18_socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-08.
 */
public class EchoClient {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("127.0.0.1", 10000);
            BufferedReader keyboard =
                    new BufferedReader(new InputStreamReader(System.in));

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            PrintWriter pw
                    = new PrintWriter(new OutputStreamWriter(out));
            BufferedReader br
                    = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while((line = keyboard.readLine()) != null){
                pw.println(line);
                pw.flush();

                String echo = br.readLine();
                System.out.println("server : "+echo );
            }
            pw.close();
            br.close();
            socket.close();




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



