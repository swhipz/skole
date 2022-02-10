package no.hiof.fredrjen.forelesning07;

import no.hiof.fredrjen.forelesning07.models.Person;
import no.hiof.fredrjen.forelesning07.models.Snekker;

public class Main {
    public static void main(String[] args) {
        // konstruktør
        Person per = new Person("Per", "Berg", 32);
        System.out.println("Han kuken heter " + per.getFornavn() + " og er " + per.getAlder() + " år gammal!");
        Snekker szymon = new Snekker("szymon", "swardrhowski", 24, 3);

        System.out.println("\n" + szymon.getAntallHusbygd() +" "+ szymon.getAlder() + " " + szymon.getFornavn());

        szymon.setAntallHusbygd(6);
        szymon.setFornavn("Bing");
        szymon.setEtternavn("Chilling");
        szymon.setAlder(9);
        System.out.println("\n" + szymon.getFornavn() + " " + szymon.getEtternavn() + " bygde " + szymon.getAntallHusbygd() + " hus.");
    }
}
