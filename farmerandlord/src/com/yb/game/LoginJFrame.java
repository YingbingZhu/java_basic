package com.yb.game;

import com.yb.domain.User;
import com.yb.util.CodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Objects;

public class LoginJFrame extends JFrame implements MouseListener {
    // correct username and pw
    static ArrayList<User> allUsers = new ArrayList<User>();
    static {
        allUsers.add(new User("yb", "123"));
        allUsers.add(new User("ybb", "1234"));
    }

    JButton login = new JButton();
    JButton register = new JButton();
    JTextField username = new JTextField();
    JTextField password = new JPasswordField();

    JTextField code = new JTextField();
    String codeStr = CodeUtil.getCode();
    JLabel rightCode = new JLabel(codeStr);

    public LoginJFrame() {
        initJFrame();
        initView();

        this.setVisible(true);

    }

    private void initJFrame() {
        this.setSize(633, 423);
        this.setTitle("Lord and Farmers");
        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // turn odd default center
        this.setLayout(null);
    }

    private void initView() {

        // add username
        Font usernameFont = new Font(null,1,16);
        JLabel unText = new JLabel("username");
        unText.setForeground(Color.white);
        unText.setFont(usernameFont);
        unText.setBounds(140, 55, 55, 22);
        this.getContentPane().add(unText);

        username.setBounds(223, 46, 200, 30);
        this.getContentPane().add(username);

        JLabel pwText = new JLabel("password");
        Font pwFont = new Font(null,1,16);
        pwText.setForeground(Color.white);
        pwText.setFont(pwFont);
        pwText.setBounds(197, 95, 40, 22);
        this.getContentPane().add(pwText);

        password.setBounds(263, 87, 160, 30);
        this.getContentPane().add(password);

        JLabel codeText = new JLabel("code");
        Font codeFont = new Font(null,1,16);
        codeText.setForeground(Color.white);
        codeText.setFont(codeFont);
        codeText.setBounds(215, 142, 55, 22);
        this.getContentPane().add(codeText);

        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        Font rightCodeFont = new Font(null,1,15);

        rightCode.setForeground(Color.red);
        rightCode.setFont(rightCodeFont);
        rightCode.setText(codeStr);
        rightCode.setBounds(400, 133, 100, 30);
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
        background.setBounds(0, 0, 633, 423);
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
        Object o = e.getSource();
        if ( o == login) {
            String usernameText = username.getText();
            String pwText = password.getText();
            String codeText = code.getText();
            if (codeText.length() == 0) {
                showDialog("empty code");
                return;
            }
            if (!codeText.equals(codeStr)) {
                showDialog("wrong code");
                return;
            }
            if (Objects.equals(pwText, "") || usernameText.equals("")) {
                showDialog("empty");
                return;
            }
            User userInfo = new User(usernameText, pwText);
            if (allUsers.contains(userInfo)) {
                this.setVisible(false);
                new GameJFrame();
            } else {
                showDialog("wrong username or password");
            }

        } else if ( o == register) {
            System.out.println("register");
        } else if (o == rightCode) {
            String code = CodeUtil.getCode();
            rightCode.setText(code);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object o = e.getSource();
        if ( o == login) {
            System.out.println("login");
            login.setIcon(new ImageIcon("jigsawgame/image/login/login_pressed.png"));

        } else if ( o == register) {
            System.out.println("register");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object o = e.getSource();
        if ( o == login) {
            login.setIcon(new ImageIcon("jigsawgame/image/login/login_button.png"));
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

