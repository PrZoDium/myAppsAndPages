package com.przodium;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class PraneethClass2 extends JFrame {

    JPanel p=new JPanel();
    JTextArea t=new JTextArea("Hello, My name is Praneeth Mashetty");
    JTextArea ta=new JTextArea("My codename is PrZoDium");
    JCheckBox cb=new JCheckBox("Click the Check if you Subscribed to Praneeth Mashetty on You-Tube");
    JButton b=new JButton("Rate 1 star");
    JButton bu=new JButton("Rate 2 star");
    JButton bt=new JButton("Rate 3 star");
    JButton bo=new JButton("Rate 4 star");
    JButton bx=new JButton("Rate 5 star");


    public static void main(String[] args) {
        new PraneethClass2();
    }

    public PraneethClass2() {
        super("Praneeth Basic Swing App");
        setSize(400,300);
        setResizable(true);
        p.add(t);
        p.add(ta);
        p.add(cb);
        p.add(b);
        p.add(bu);
        p.add(bt);
        p.add(bo);
        p.add(bx);
        add(p);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}