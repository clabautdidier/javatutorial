package clabaut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Set;

public class Venster extends JFrame {

    public Venster() {
        this(new VensterOpties());
    }

    public Venster(VensterOpties vensterOpties) {
        this(vensterOpties, new Paneel() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Venster action");

            }
        });

/*        addKeyListener(this);*/
    }

    public Venster(VensterOpties vensterOpties, Paneel paneel) {

        setSize(vensterOpties.breedte, vensterOpties.hoogte);
        setResizable(vensterOpties.resizable);

        setTitle(vensterOpties.titel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(false);

        setDefaultSize(24);

        add(paneel);
    }

    public void open() {
        setVisible(true);
    }

    public static void setDefaultSize(int size) {

        Set<Object> keySet = UIManager.getLookAndFeelDefaults().keySet();
        Object[] keys = keySet.toArray(new Object[keySet.size()]);

        for (Object key : keys) {

            if (key != null && key.toString().toLowerCase().contains("font")) {

//                System.out.println(key);
                Font font = UIManager.getDefaults().getFont(key);
                if (font != null) {
                    font = font.deriveFont((float)size);
                    UIManager.put(key, font);
                }

            }

        }

    }
}
