package com.yb.game;

import com.yb.domain.Poker;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GameJFrame extends JFrame implements ActionListener {

    public static Container container = null;

    // take landlord or not
    JButton landlord[] = new JButton[2];
    // publish or not
    JButton publishCard[] = new JButton[2];

    JLabel lord;

    //集合嵌套集合
    //大集合中有三个小集合
    //小集合中装着每一个玩家当前要出的牌
    //0索引：左边的电脑玩家
    //1索引：中间的自己
    //2索引：右边的电脑玩家
    ArrayList<ArrayList<Poker>> currentList = new ArrayList<>();

    //集合嵌套集合
    //大集合中有三个小集合
    //小集合中装着每一个玩家的牌
    //0索引：左边的电脑玩家
    //1索引：中间的自己
    //2索引：右边的电脑玩家
    ArrayList<ArrayList<Poker>> playerList = new ArrayList<>();

    //底牌
    ArrayList<Poker> lordList = new ArrayList<>();

    //牌盒，装所有的牌
    ArrayList<Poker> pokerList = new ArrayList();


    JTextField time[] = new JTextField[3];


    public GameJFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("farmerandlord/image/dizhu.png"));
        // initialize frame
        initJFrame();

        initView();

        this.setVisible(true);

        initCard();
        initGame();
    }

    private void initGame() {
    }

    private void initCard() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 13; j++) {
                if ((i == 5) && (j > 2)) {
                    break;
                } else {
                    Poker poker = new Poker(i + "-" + j, false);
                    poker.setLocation(350, 150);
                    pokerList.add(poker);
                    container.add(poker);
                }
            }

        }

        Collections.shuffle(pokerList);

        ArrayList<Poker> player0 = new ArrayList<>();
        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();

        for (int i = 0; i < pokerList.size(); i++) {
            //获取当前遍历的牌
            Poker poker = pokerList.get(i);

            //发三张底牌
            if (i <= 2) {
                //移动牌
                Common.move(poker, poker.getLocation(), new Point(270 + (75 * i), 10));
                //把底牌添加到集合中
                lordList.add(poker);
                continue;
            }
            //给三个玩家发牌
            if (i % 3 == 0) {
                //给左边的电脑发牌
                Common.move(poker, poker.getLocation(), new Point(50, 60 + i * 5));
                player0.add(poker);
            } else if (i % 3 == 1) {
                //给中间的自己发牌
                Common.move(poker, poker.getLocation(), new Point(180 + i * 7, 450));
                player1.add(poker);
                //把自己的牌展示正面
                poker.turnFront();

            } else if (i % 3 == 2) {
                //给右边的电脑发牌
                Common.move(poker, poker.getLocation(), new Point(700, 60 + i * 5));
                player2.add(poker);
            }
            //把三个装着牌的小集合放到大集合中方便管理
            playerList.add(player0);
            playerList.add(player1);
            playerList.add(player2);

            //把当前的牌至于最顶端，这样就会有牌依次错开且叠起来的效果
            container.setComponentZOrder(poker, 0);

        }

        //给牌排序
        for (int i = 0; i < 3; i++) {
            //排序
            Common.order(playerList.get(i));
            //重新摆放顺序
            Common.rePosition(this, playerList.get(i), i);
        }

    }


    private void initJFrame() {
        this.setSize(830, 680);
        this.setTitle("Farmer V1.0");
        this.setAlwaysOnTop(true);
        this.setResizable(false);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.LIGHT_GRAY);

    }

    public void initView() {
        JButton robBut = new JButton("take lord");
        robBut.setBounds(320, 400, 75, 20);
        robBut.addActionListener(this);
        robBut.setVisible(false);
        landlord[0] = robBut;
        container.add(robBut);

        JButton noBut = new JButton("not take lord");
        noBut.setBounds(420, 400, 75, 20);
        noBut.addActionListener(this);
        noBut.setVisible(false);
        landlord[1] = noBut;
        container.add(noBut);

        JButton outCardBut = new JButton("publish");
        outCardBut.setBounds(320, 400, 60, 20);
        outCardBut.addActionListener(this);
        outCardBut.setVisible(false);
        publishCard[0] = outCardBut;
        container.add(outCardBut);

        JButton noCardBut = new JButton("not publish");
        noCardBut.setBounds(320, 400, 60, 20);
        noCardBut.addActionListener(this);
        noCardBut.setVisible(false);
        publishCard[1] = noCardBut;
        container.add(noCardBut);

        for (int i = 0; i < 3; i++) {
            time[i] = new JTextField("countdown:");
            time[i].setEditable(false);
            time[i].setVisible(false);
            container.add(time[i]);
        }

        time[0].setBounds(140, 230, 60, 20);
        time[1].setBounds(375, 360, 60, 20);
        time[2].setBounds(620, 230, 60, 20);

        lord = new JLabel("lord");
        lord.setVisible(false);
        lord.setSize(40,40);
        container.add(lord);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
