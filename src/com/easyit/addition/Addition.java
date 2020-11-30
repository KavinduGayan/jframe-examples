package com.easyit.addition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition extends JFrame implements ActionListener {
    JTextField t1;
    JTextField t2;
    JButton b;
    JButton sub;
    JLabel totalL;
    public Addition() throws HeadlessException {
        t1= new JTextField(5);

        t2= new JTextField(5);

        JLabel label = new JLabel("=");

        totalL = new JLabel();
        totalL.setVisible(false);

        b=new JButton("+");
        b.setSize(100,100);
        b.addActionListener(this);

        sub=new JButton("-");
        sub.setSize(100,100);
        sub.addActionListener(sub -> {
            int num1= Integer.parseInt(t1.getText());
            int num2= Integer.parseInt(t2.getText());
            int subTotal = num1-num2;
            totalL.setText(String.valueOf(subTotal));
            totalL.setVisible(true);
        });

        this.add(t1);
        this.add(t2);
        this.add(b);
        this.add(sub);
        this.add(label);
        this.add(totalL);
        this.setResizable(false);
        this.setTitle("Add Numbers");
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(200,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1= Integer.parseInt(t1.getText());
        int num2= Integer.parseInt(t2.getText());
        int total = num1+num2;
        totalL.setText(String.valueOf(total));
        totalL.setVisible(true);

    }
}
