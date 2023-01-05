package com.yb.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    // name of pokers
    private String name;

    private boolean up;

    private boolean canClick = false;

    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;

        if (this.up) {
            turnFront();;
        } else {
            turnRear();
        }

        this.setSize(71, 96);

        this.setVisible(true);

        this.addMouseListener(this);
    }

    public void turnFront() {
        this.setIcon(new ImageIcon("farmerandlord/image/poker/" + name +".png"));
        this.up = true;
    }

    public void turnRear() {
        this.setIcon(new ImageIcon("farmerandlord/image/poker/rear.png"));
        this.up = false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (canClick) {
            int step = 0;
            if (clicked) {
                step = 20;
            } else {
                step = -20;
            }
            clicked = !clicked;
            Point from = this.getLocation();
            Point to = new Point(from.x, from.y + step);

            this.setLocation(to);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isCanClick() {
        return canClick;
    }

    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }
}
