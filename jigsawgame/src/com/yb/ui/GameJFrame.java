package com.yb.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    int[][] data = new int[4][4];

    // record empty block
    int x = 0;
    int y = 0;

    int steps = 0;

    int[][] win = new int[][]{
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    String path =  "jigsawgame/image/animal/animal3/";

    JMenuItem beautyItem = new JMenuItem("beauty");
    JMenuItem animalItem = new JMenuItem("animal");
    JMenuItem sportItem = new JMenuItem("sport");
    JMenuItem replayItem = new JMenuItem("restart");
    JMenuItem reLoginItem = new JMenuItem("re-login");
    JMenuItem closeItem = new JMenuItem("close");
    JMenuItem accountItem = new JMenuItem("account");

    public GameJFrame() {
        // initialize frame
        initJFrame();

        // initialize menu bar
        initJMenubar();

        //init data
        initData();

        // init image
        initImage();


        this.setVisible(true);
    }

    private void initData() {
        // shuffle one-d array
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // shuffle
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // method 1
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i/4;
                y = i%4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    // shuffle matrix
    private void initImage() {
        // reload images
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("jigsawgame/image/win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("steps: " + steps);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        // path: absolute, relative


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                // ImageIcon
                ImageIcon imageIcon = new ImageIcon(path + number +".jpg");
                // JLabel ( CONTAINER)
                JLabel jLabel = new JLabel(imageIcon);
                // add border
                jLabel.setBorder(new BevelBorder(1));

                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // this.add(jLabel1);
                this.getContentPane().add(jLabel);
            }
        }

        // add last
        ImageIcon bg = new ImageIcon("jigsawgame/image/background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
        // refresh
        this.getContentPane().repaint();
    }

    private void initJMenubar() {
        // initialize menu bar
        JMenuBar jMenuBar = new JMenuBar();
        // set options
        JMenu functionJMenu = new JMenu("function");
        JMenu aboutJMenu = new JMenu("about");
        JMenu switchItem = new JMenu("switch");

        // create bar
/*        JMenuItem replayItem = new JMenuItem("restart");
        JMenuItem reLoginItem = new JMenuItem("re-login");
        JMenuItem closeItem = new JMenuItem("close");

        JMenuItem accountItem = new JMenuItem("account");*/

        switchItem.add(beautyItem);
        switchItem.add(animalItem);
        switchItem.add(sportItem);


        functionJMenu.add(replayItem);
        functionJMenu.add(switchItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        functionJMenu.add(accountItem);

        aboutJMenu.add(accountItem);

        beautyItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);


        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);


        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("JIGSAW V1.0");
        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.addKeyListener(this);

        // turn odd default center
        this.setLayout(null);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon("jigsawgame/image/animal/animal3/all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            // add last
            ImageIcon bg = new ImageIcon("jigsawgame/image/background.png");
            JLabel background = new JLabel(bg);
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // if win, return
        if (victory()) {
            return;
        }

        
        // left 37 up 38 right 39 down 40
        int code = e.getKeyCode();
        if (code == 37) {
            if ( y == 3) {
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            steps++;
            y++;
            initImage();
            System.out.println("left");
        } else if (code == 38) {
            // x+1, y to x, y
            if ( x == 3) {
                return;
            }
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            steps++;
            x++;
            initImage();

            System.out.println("up");
        } else if (code == 39) {
            if ( y == 0) {
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            steps++;
            y--;
            initImage();
            System.out.println("right");
        } else if (code == 40) {
            if ( x == 0) {
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            steps++;
            x--;
            initImage();
            System.out.println("down");
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = win;
            initImage();
        }

    }

    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            if (data[i] != win[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        Random r = new Random();
        if (o == replayItem) {
            System.out.println("replay");
            // steps to 0
            steps = 0;
            // shuffle

            initData();

            // reload
            initImage();

        }  else if (o == reLoginItem) {
            this.setVisible(false);
            new LoginJFrame();

            System.out.println("relogin");
        } else if ( o == closeItem) {
            System.exit(0);
            System.out.println("close");
        } else if (o == accountItem) {
            System.out.println("account");
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("jigsawgame/image/damie.jpg"));
            jLabel.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            // if not close, can not action
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (o == beautyItem) {
            int index = 1 + r.nextInt(12);
            path = "jigsawgame/image/girl/girl" + index + "/";
            // steps to 0
            steps = 0;
            // shuffle
            initData();
            // reload
            initImage();

        } else if ( o == animalItem) {
            int index = 1 + r.nextInt(8);
            path = "jigsawgame/image/animal/animal" + index + "/";
            // steps to 0
            steps = 0;
            // shuffle
            initData();
            // reload
            initImage();
        } else if ( o == sportItem) {
            int index = 1 + r.nextInt(10);
            path = "jigsawgame/image/sport/sport" + index + "/";
            // steps to 0
            steps = 0;
            // shuffle
            initData();
            // reload
            initImage();
        }
    }

}
