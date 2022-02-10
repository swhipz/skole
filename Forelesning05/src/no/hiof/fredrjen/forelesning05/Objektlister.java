package no.hiof.fredrjen.forelesning05;

import no.hiof.fredrjen.forelesning05.models.Kurs;
import no.hiof.fredrjen.forelesning05.models.Student;

import java.util.ArrayList;

public class Objektlister {

    public static void main(String[] args) {
        Kurs kurs1 = new Kurs("Programmering 2", "ITF10619", 10);
     //   kurs1.printBeskrivelse();

        Student student = new Student("Fredrikjensen", "Jensemann", 22, "12345");

        student.setKurs(kurs1);
        student.getKurs().printBeskrivelse();

        ArrayList<Student> arrayList = new ArrayList<Student>();



    }
}
