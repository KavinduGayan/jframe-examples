package com.easyit;

import javax.swing.*;
import java.awt.*;

public class JpanelTest {
    public static void main(String[] args) {
        JLabel greenLabel = new JLabel();
        greenLabel.setText("Hi");

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 0, 50, 50);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(50, 0, 50, 50);
        greenPanel.add(greenLabel);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(100, 0, 50, 50);

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setSize(200, 200);
        jFrame.add(bluePanel);
        jFrame.add(greenPanel);
        jFrame.add(redPanel);
    }
}
