package com.company;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        color c = new color();
    }
}

class color extends JFrame {

    color() {
        super("ColorGenerator");
        setSize(400, 400);

        Color c = new Color(255,255,255);

        JPanel p = new JPanel();
        JButton b1;

        b1 = new JButton("Click to generate color");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1.doClick(); {
                    Random randInt = new Random();
                    int value = 255;
                    int r = randInt.nextInt(value);
                    int g = randInt.nextInt(value);
                    int b = randInt.nextInt(value);

                    Color c = new Color(r, g, b);
                    p.setBackground(c);
                    b1.setText("R:"+r+" G:"+g+" B:"+b);
                }
            }
        });
        add(p);
        p.setBackground(c);
        p.add(b1);
        show();
    }
}