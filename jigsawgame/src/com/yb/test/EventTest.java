package com.yb.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(603, 680);
        jFrame.setTitle("event test");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        // button
        JButton jButton = new JButton("click");
        jButton.setBounds(0, 0, 100, 50);
        // click or space
        // jButton.addActionListener(new MyActionListener());
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
            }
        });
        jFrame.getContentPane().add(jButton);
        

        jFrame.setVisible(true);
    }
}
