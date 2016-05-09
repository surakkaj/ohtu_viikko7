package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String vastaus = "";

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
            vastaus = scanner.nextLine();
            PeliTehdas tehdas = new PeliTehdas();
            Pelattava peli = tehdas.valitsePeli(vastaus);
            if (peli == null) {
                break;
            }
            peli.pelaa();

        }

    }
}
