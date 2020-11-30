package com.easyit;

import javax.swing.*;
import java.awt.*;

public class Calculater extends JFrame {
    public Calculater() throws HeadlessException {
        this.setVisible(true);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setResizable(false);

    }
}
