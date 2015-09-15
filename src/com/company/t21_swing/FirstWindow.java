package com.company.t21_swing;

import javax.swing.*;
import java.awt.*;

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

    public void changeColor(){
        Container pane = getContentPane();
        pane.setBackground(Color.YELLOW);
    }

    public static void main(String[] args){
        FirstWindow fw = new FirstWindow("First Window");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fw.changeColor();

//        JFrame fw = new JFrame();
//        fw.setTitle("FirstWindow");
//        fw.setSize(300,200);
//        fw.setVisible(true);
    }
}
