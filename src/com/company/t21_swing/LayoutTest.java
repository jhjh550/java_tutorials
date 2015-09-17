package com.company.t21_swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mirim on 2015-09-15.
 */
public class LayoutTest extends JFrame {
    public LayoutTest(String title){
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn1, btn2, btn3, btn4, btn5;
        btn1 = new JButton("North");
        btn2 = new JButton("West");
        btn3 = new JButton("South");
        btn4 = new JButton("East");
        btn5 = new JButton("Center");

//        setLayout(new BorderLayout(50,20));
//        add(btn1, "North");
//        add(btn2, "West");
//        add(btn3, "South");
//        add(btn4, "East");
//        add(btn5, "Center");

//        setLayout(new FlowLayout(FlowLayout.LEFT));
//        add(btn1);
//        add(btn2);
//        add(btn3);
//        add(btn4);
//        add(btn5);

        //setLayout(new GridLayout(2,2, 50,20));
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);

        setSize(300, 200);

        setVisible(true);

    }

    public static void main(String[] args){
        LayoutTest layout = new LayoutTest("First Layout");
    }
}
