package stappen.stap3;

import clabaut.Paneel;

import javax.swing.*;
import java.awt.*;

public class Stap3TekstveldPaneel extends Paneel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        /*  Een lijn van boven links tot beneden rechts
            Ons venster is 1000 pixels breed en 500 pixels hoog, en toch is beneden rechts voor de lijn 450.
            Waarom geen 500?

            Dat komt omdat ons paneel onder de titel van het venster staat, de titel is 50 pixels hoog.
         */
        g.drawLine(0, 0, 1000, 450);

        // We zorgen ervoor dat de tekst die de Graphics instantie schrijft, dezelfde font heeft als voor labels
        g.setFont(UIManager.getFont("Label.font"));
        g.drawString("Wat is jouw naam?", 500, 50);

        JTextField tekstveld = new JTextField();
        tekstveld.setBounds(500, 80, 250, 40);

        add(tekstveld);
    }
}
