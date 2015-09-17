package com.company.t21_swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mirim on 2015-09-17.
 */
public class ComponentTest2 extends JFrame {
    public ComponentTest2(String title){
        setTitle(title);
        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JCheckBox ch1 = new JCheckBox("abc");
        JCheckBox ch2 = new JCheckBox("qwer");
        JCheckBox ch3 = new JCheckBox("asdf");

        JRadioButton r1 = new JRadioButton("r1");
        JRadioButton r2 = new JRadioButton("r2");
        JRadioButton r3 = new JRadioButton("r3");

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);


        setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(ch1);
        add(ch2);
        add(ch3);

        setVisible(true);
    }

    public static void main(String[] args){
        ComponentTest2 test2 = new ComponentTest2("test2");
    }
}












