package no.hiof.fredrjen.forelesning06;


import java.util.ArrayList;

public class Kurs {
    public static void main(String[] args) {

        ArrayList<Kurs> kursListe = new ArrayList<>();


        Kurs kurs1 = new Kurs();
        kursListe.add(kurs1);
        System.out.println("Antall elementer i liste : " + kursListe.size());

        kursListe.get(0);
    }
}
