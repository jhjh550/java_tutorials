package com.company.t17_serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;


/**
 * Created by Mirim on 2015-09-08.
 */
public class BookObjectInputTest {
    public static void main(String[] args){
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("C:\\Temp\\booklist.dat");
            ois = new ObjectInputStream(fis);
            ArrayList<Book> list = (ArrayList<Book>) ois.readObject();
            Book b1 = list.get(0);
            Book b2 = list.get(1);
            Book b3 = list.get(2);

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}

