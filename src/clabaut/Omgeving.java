package clabaut;

import java.util.HashSet;

public class Omgeving {
    private HashSet<Integer> ingedrukteToetsen = new HashSet<>();

    public synchronized void toetsIngedrukt(int keyCode) {
        ingedrukteToetsen.add(keyCode);
    }

    public synchronized void toetsLosgelaten(int keyCode) {
        if (ingedrukteToetsen.contains(keyCode))
            ingedrukteToetsen.remove(keyCode);
    }

    public synchronized boolean isToetsIngedrukt(int keyCode) {
        return ingedrukteToetsen.contains(keyCode);
    }
}
