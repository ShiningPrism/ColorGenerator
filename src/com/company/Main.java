package com.company;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;

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
        JButton b1, b2, b3;

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
        b2 = new JButton("Exit");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2.doClick(); {
                    System.exit(0);
                }
            }
        });
        b3 = new JButton("Copy Color (RGB)");
        b3.addMouseListener(new java.awt.event.MouseAdapter()  {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3.doClick(); {
                    String myString = b1.getText();
                    if(myString.equals("Click to generate color")) {
                        String clipboardStr = "You found the secret... congratulations!";
                        StringSelection stringSelection = new StringSelection(clipboardStr);
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        clipboard.setContents(stringSelection, null);
                    } else {
                        String clipboardStr = b1.getText();
                        StringSelection stringSelection = new StringSelection(clipboardStr);
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        clipboard.setContents(stringSelection, null);
                    }
                }
            }
        });
        add(p);
        p.setBackground(c);
        p.add(b1); // random
        p.add(b3); // copy
        p.add(b2); // exit
        show();
    }
}