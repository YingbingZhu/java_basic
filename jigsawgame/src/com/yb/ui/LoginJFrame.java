package com.yb.ui;

import com.yb.objects.User;
import com.yb.utils.CodeUtil;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Objects;

public class LoginJFrame extends JFrame implements MouseListener {
    // correct username and pw
    static ArrayList<User> list  = new ArrayList<User>();
    static {
        list.add(new User("yb", "123"));
        list.add(new User("ybb", "1234"));
    }

    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JTextField password = new JTextField();

    JTextField code = new JTextField();
    String codeStr = CodeUtil.getCode();
    JLabel rightCode = new JLabel(codeStr);

    public LoginJFrame() {
        initJFrame();
        initView();

        this.setVisible(true);

    }

    private void initJFrame() {
        this.setSize(488, 430);
        this.setTitle("JIGSAW login V1.0");
        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // turn odd default center
        this.setLayout(null);
    }

    private void initView() {

        JLabel unText = new JLabel(new ImageIcon("jigsawgame/image/login/username.png"));
        unText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(unText);

        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        JLabel pwText = new JLabel(new ImageIcon("jigsawgame/image/login/password.png"));
        pwText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(pwText);

        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        JLabel codeText = new JLabel(new ImageIcon("jigsawgame/image/login/code.png"));
        codeText.setBounds(130, 256, 50, 36);
        this.getContentPane().add(codeText);

        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        rightCode.setBounds(300, 256, 50, 30);
        this.getContentPane().add(rightCode);
        rightCode.addMouseListener(this);

        // login button
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("jigsawgame/image/login/login_button.png"));
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        login.addMouseListener(this);

        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("jigsawgame/image/login/register_button.png"));
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        register.addMouseListener(this);




        // add last
        ImageIcon bg = new ImageIcon("jigsawgame/image/login/background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
        // refresh
        this.getContentPane().repaint();
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



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object o = e.getSource();
        if ( o == login) {
            System.out.println("login");
            login.setIcon(new ImageIcon("jigsawgame/image/login/login_pressed.png"));

        } else if ( o == register) {
            System.out.println("register");
        } else if ( o == rightCode) {
            codeStr = CodeUtil.getCode();
            rightCode.setText(codeStr);

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object o = e.getSource();
        if ( o == login) {
            login.setIcon(new ImageIcon("jigsawgame/image/login/login_button.png"));

            String usernameText = username.getText();
            String pwText = password.getText();
            String codeText = code.getText();
            if (!codeText.equals(codeStr)) {
                 showDialog("wrong code");
                 return;
            }
            if (Objects.equals(pwText, "") || usernameText.equals("")) {
                showDialog("empty");
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                if (usernameText.equals(list.get(i).getUsername()) && pwText.equals(list.get(i).getPassword())) {
                    showDialog("login success");
                    new GameJFrame();
                    return;
                }
            }
            showDialog("wrong");

        } else if ( o == register) {
            System.out.println("register");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
