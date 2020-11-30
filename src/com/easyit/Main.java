package com.easyit;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Calculater calculater=new Calculater();

        Border border= BorderFactory.createLineBorder(Color.blue.brighter(),1);

        JLabel jLabel= new JLabel();
        jLabel.setText("BMI Calculator");
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel.setForeground(Color.blue);
        jLabel.setVerticalAlignment(JLabel.TOP);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setBorder(border);

        JFrame jFrame= new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("Calculator");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jFrame.setResizable(false);
        jFrame.add(jLabel);
    }
}
