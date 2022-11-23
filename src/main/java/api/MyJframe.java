package api;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJframe extends JFrame implements ActionListener {
    JButton yesBut = new JButton("cool");
    JButton midBut = new JButton("mid");
    JButton noBut = new JButton("ugly");

    boolean flag = false;

    public MyJframe()  {
        initJFrame();

        initView();

        this.setVisible(true);

    }

    private void initView() {
        this.getContentPane().removeAll();

        if (flag) {
            JButton button = new JButton("haha");
            button.setBounds(50, 20, 100, 30);
            this.getContentPane().add(button);
        }

        JLabel text = new JLabel("are you happy?");
        text.setBounds(120, 150, 300, 50);
        yesBut.setBounds(200, 250, 100, 30);
        midBut.setBounds(200, 325, 100, 30);
        noBut.setBounds(160, 400, 180, 30);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);


        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);
        this.getContentPane().repaint();

    }

    private void initJFrame() {
        this.setSize(500, 600);
        this.setTitle("game");
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if ( o == yesBut) {
            System.out.println("1");
            showDialog("1");
            flag = true;
            initView();
        } else if ( o == midBut) {
            System.out.println("2");
        } else if (o == noBut) {
            System.out.println("3");
        }
    }

    public void showDialog(String content) {
        JDialog jDialog = new JDialog();
        jDialog.setSize(200, 150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);
    }
}
