package clabaut;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Programma {
    public void start(Venster venster) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                venster.open();
            }
        });
    }

    public void start() {
        start(new Venster());
    }
}
