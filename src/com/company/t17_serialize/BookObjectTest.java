package com.company.t17_serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by Mirim on 2015-09-08.
 */
public class BookObjectTest {
    public static void main(String[] args){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        Book b1 = new Book("a0001", "�ڹ�1", "ȫ�浿", 10000);
        Book b2 = new Book("a0002", "�ڹ�2", "������", 12000);
        Book b3 = new Book("a0003", "�ڹ�3", "abc", 13000);

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(b1);
        list.add(b2);
        list.add(b3);

        try {
            fos = new FileOutputStream("C:\\Temp\\booklist.dat");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(list);
            oos.reset();

            System.out.println("���� �Ϸ�");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                oos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}












