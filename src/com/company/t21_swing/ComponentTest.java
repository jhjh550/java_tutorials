package com.company.t21_swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mirim on 2015-09-17.
 */
public class ComponentTest extends JFrame{
    public ComponentTest(String title) {
        setSize(300, 200);
        setTitle(title);
//        JLabel label = new JLabel("레이블 글자");
//        label.setForeground(Color.RED);
//        label.setHorizontalAlignment(SwingConstants.CENTER);
//        add(label);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.YELLOW);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,2));
        p.add(p1);
        p.add(p2);

        add(p);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        ComponentTest test = new ComponentTest("Component Test");
    }
}



