package com.yb.test;

import com.sun.javaws.IconUtil;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener, MouseListener, KeyListener {

    JButton jButton1 = new JButton("click");
    JButton jButton2 = new JButton("click");

    public MyJFrame() {
        this.setSize(603, 680);
        this.setTitle("event test");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        // button
        jButton1.setBounds(0, 0, 100, 50);
        // click or space
        // jButton.addActionListener(new MyActionListener());
        jButton1.addActionListener(this);

        jButton2.setBounds(100, 0, 100, 50);
        // click or space
        // jButton.addActionListener(new MyActionListener());
        jButton2.addActionListener(this);
        jButton2.addMouseListener(this);

        this.addKeyListener(this);

        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if ( o == jButton1 ) {
            jButton1.setSize(200, 200);
        } else if ( o == jButton2) {
            Random r = new Random();
            jButton2.setLocation(r.nextInt(500), r.nextInt(500));
        }

    }

    public static void main(String[] args) {
        new MyJFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("pressed and not released");
    }              

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("released");
        int code = e.getKeyCode();
        System.out.println(code);
    }
}
