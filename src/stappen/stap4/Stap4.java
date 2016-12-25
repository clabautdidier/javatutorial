package stappen.stap4;

import clabaut.Programma;
import clabaut.Venster;
import clabaut.VensterOpties;

public class Stap4 {

    public static void main(String[] args) {
        VensterOpties vensterOpties = new VensterOpties();
        vensterOpties.breedte = 1000;
        vensterOpties.titel = "Stap 4 - paneel";
        vensterOpties.resizable = false;

        Stap4Paneel paneel = new Stap4Paneel();

        Venster venster = new Venster(vensterOpties);
        venster.add(paneel);

        Programma programma = new Programma();
        programma.start(venster);
    }
}
