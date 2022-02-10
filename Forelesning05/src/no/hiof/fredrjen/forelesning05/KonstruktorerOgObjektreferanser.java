package no.hiof.fredrjen.forelesning05;

import no.hiof.fredrjen.forelesning05.models.Student;
public class KonstruktorerOgObjektreferanser {
    public static void main(String[] args) {


        Student fredrik = new Student("Fredrik", "Jensen", 22, "6969");



        Student pluto = fredrik;
        fredrik.printBeskrivelse();
        pluto.printBeskrivelse();

    }
}
