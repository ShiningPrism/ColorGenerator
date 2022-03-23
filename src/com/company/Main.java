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
        super("color");
        Random randInt = new Random();
        int value = 255;

        int r = randInt.nextInt(value);
        int g = randInt.nextInt(value);
        int b = randInt.nextInt(value);
        Color c = new Color(r, g, b);

        JPanel p = new JPanel();

        p.setBackground(c);

        setSize(200, 200);
        add(p);
        show();
    }
}
