package com.easyit.jbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame implements ActionListener {
    JButton jButton;
    JLabel jLabel;
    public JButtonTest() throws HeadlessException {
        jLabel = new JLabel();
        jLabel.setBounds(200,100,50,50);
        jLabel.setText("Poo");
        jLabel.setVisible(false);

        jButton=new JButton();
        jButton.setText("test");
        jButton.setBounds(200,200,100,50);
        jButton.addActionListener(this);
        jButton.setFocusable(false);

        this.setTitle("jbutton");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500,500);
        this.setResizable(false);
        this.add(jButton);
        this.add(jLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {
            System.out.println("jbutton trigered!");
            jLabel.setVisible(true);
        }
    }
}
