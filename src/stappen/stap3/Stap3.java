package stappen.stap3;

import clabaut.Programma;
import clabaut.Venster;
import clabaut.VensterOpties;

public class Stap3 {

    public static void main(String[] args) {
        VensterOpties vensterOpties = new VensterOpties();
        vensterOpties.breedte = 1000;
        vensterOpties.titel = "Stap 3 - paneel";
        vensterOpties.resizable = false;

        Stap3Paneel paneel = new Stap3Paneel();

        Venster venster = new Venster(vensterOpties);
        venster.add(paneel);

        Programma programma = new Programma();
        programma.start(venster);
    }
}
