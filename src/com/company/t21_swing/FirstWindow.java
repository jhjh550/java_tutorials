package com.company.t21_swing;

import javax.swing.*;

/**
 * Created by Mirim on 2015-09-15.
 */
public class FirstWindow extends JFrame{
    public FirstWindow(String title){
        setSize(300,200);
        setTitle(title);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        FirstWindow fw = new FirstWindow("First Window");

//        JFrame fw = new JFrame();
//        fw.setTitle("FirstWindow");
//        fw.setSize(300,200);
//        fw.setVisible(true);
    }
}
