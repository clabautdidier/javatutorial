package stappen.stap2;

import clabaut.Programma;
import clabaut.Venster;
import clabaut.VensterOpties;

public class Stap2 {

    public static void main(String[] args) {
        VensterOpties vensterOpties = new VensterOpties();
        vensterOpties.breedte = 1000;
        vensterOpties.titel = "Stap 2 - vensteropties";
        vensterOpties.resizable = false;

        Venster venster = new Venster(vensterOpties);

        Programma programma = new Programma();
        programma.start(venster);
    }
}
