package com.company.t20_chatserver;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Mirim on 2015-09-10.
 */
public class ChatThread extends Thread {
    private Socket socket;
    private HashMap hm;
    public ChatThread(Socket socket, HashMap hm){
        this.socket = socket;
        this.hm = hm;

        try {
            OutputStreamWriter osw
                    = new OutputStreamWriter(socket.getOutputStream());
            PrintWriter pw = new PrintWriter(osw);

            Collection collection = hm.values();
            Iterator iter = collection.iterator();
            while(iter.hasNext()){

            }
            pw.println("xxx¥‘¿Ã ¡¢º”«œºÃΩ¿¥œ¥Ÿ.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
