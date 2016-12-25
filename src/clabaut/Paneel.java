package clabaut;

import stappen.stap4.Stap4Paneel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
import java.util.Timer;

import static javax.imageio.ImageIO.read;

public abstract class Paneel extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private Omgeving omgeving = new Omgeving();

    public Paneel() {
        this (new PaneelOpties());
    }

    public Paneel(PaneelOpties paneelOpties) {
        super(null);

        addKeyListener(this);
        setBackground(paneelOpties.achtergrondKleur);
    }

    public void startTimer(TimerListener timerListener) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timerListener.handleTimer(omgeving);
            }
        }, 0, 10);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void drawImage(Graphics g, String resource, int x, int y) {
        g.drawImage(readImage(resource), x, y, 50, 50, null);
    }

    public void drawImage(Graphics g, String resource, int sourceX1, int sourceY1, int sourceX2, int sourceY2, int x, int y) {
        g.drawImage(readImage(resource), x, y, x+50, y+50, sourceX1, sourceY1, sourceX2, sourceY2, null);
    }

    private Image readImage(String resource) {
        try {
            return ImageIO.read(Stap4Paneel.class.getClassLoader().getResource(resource));
        } catch (IOException e) {
            throw new OefeningException(e);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        omgeving.toetsLosgelaten(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        omgeving.toetsIngedrukt(e.getKeyCode());
    }
}
