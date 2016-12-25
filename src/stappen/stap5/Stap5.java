package stappen.stap5;

import clabaut.Programma;
import clabaut.Venster;
import clabaut.VensterOpties;

public class Stap5 {

    public static void main(String[] args) {
        VensterOpties vensterOpties = new VensterOpties();
        vensterOpties.breedte = 1000;
        vensterOpties.titel = "Stap 5 - paneel";
        vensterOpties.resizable = false;

        Stap5Paneel paneel = new Stap5Paneel();

        Venster venster = new Venster(vensterOpties);
        venster.add(paneel);

        Programma programma = new Programma();
        programma.start(venster);
    }
}
