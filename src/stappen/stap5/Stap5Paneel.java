package stappen.stap5;

import clabaut.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Stap5Paneel extends Paneel implements TimerListener {
    private final SpriteMap player;
    private int playerX = 100;
    private int playerY = 100;

    public Stap5Paneel() {
        player = new SpriteMap("player-spritemap-v9.png", 0, 0, 46, 50);

        setFocusable(true);
        startTimer(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        player.draw(g, 0, 3, playerX, playerY);
    }

    @Override
    public void handleTimer(Omgeving omgeving) {
        if (omgeving.isToetsIngedrukt(KeyEvent.VK_RIGHT)) {
            playerX++;
            repaint();
        }
        else if (omgeving.isToetsIngedrukt(KeyEvent.VK_LEFT)) {
            playerX--;
            repaint();
        }
        else if (omgeving.isToetsIngedrukt(KeyEvent.VK_UP)) {
            playerY--;
            repaint();
        }
        else if (omgeving.isToetsIngedrukt(KeyEvent.VK_DOWN)) {
            playerY++;
            repaint();
        }
    }

}
