package com.company.t21_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mirim on 2015-09-15.
 */
public class FirstWindow extends JFrame{
    public FirstWindow(String title){
        setSize(300,200);
        setTitle(title);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = getContentPane();
        pane.setBackground(Color.YELLOW);
    }

    public void addMyButton(){
        JButton btn = new JButton("First Button");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Button clicked");
            }
        });


        add(btn);
        setVisible(true);
    }

    public static void main(String[] args){
        FirstWindow fw = new FirstWindow("First Window");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            fw.addMyButton();
        }
//        JButton btn = new JButton("First Button");
//        fw.add(btn);
//        fw.setVisible(true);
        fw.addMyButton();


    //    fw.changeColor();

//        JFrame fw = new JFrame();
//        fw.setTitle("FirstWindow");
//        fw.setSize(300,200);
//        fw.setVisible(true);
    }
}
