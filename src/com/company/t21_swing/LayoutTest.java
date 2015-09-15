package com.company.t21_swing;

import javax.swing.*;

/**
 * Created by Mirim on 2015-09-15.
 */
public class LayoutTest extends JFrame {
    public LayoutTest(String title){
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        LayoutTest layout = new LayoutTest("First Layout");
    }
}
