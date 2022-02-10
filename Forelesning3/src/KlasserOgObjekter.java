
public class KlasserOgObjekter {

    public static void main(String[] args) {

        // Deklarasjon og initialisering av et student-objekt. Dette kan gjøres på to eller èn linje.
        //Student student1;
        //student1 = new Student();
        Student student1 = new Student();
        System.out.println(student1.fornavn); // skriver ut null ettersom variabelen ikke er initialisert

        // Initialiserer samtlige variabler for student-objektet
        student1.fornavn = "Ole-Edvard";
        student1.etternavn = "Ørebæk";
        student1.alder = 24;
        student1.studentId = "12345";

        student1.printBeskrivelse();
        // Skriver ut innholdet av samtlige variabler for student-objektet etter initialisering.
       /* System.out.println();
        System.out.println(student1.fornavn + "\n" +
                student1.etternavn + "\n" +
                student1.alder + "\n" +
                student1.studentId); */

        Student student2 = new Student();

        student2.fornavn = "Klækken";
        student2.etternavn = "gremlings";
        student2.alder = 59;
        student2.studentId = "smækkælækken";
      /*  System.out.println(student2.fornavn + "\n" +
                student2.etternavn + "\n" +
                student2.alder + "\n" +
                student2.studentId); */

        student2.printBeskrivelse();

        Kurs kurs = new Kurs();
        kurs.kursNavn = "Programmering 2";
        kurs.kursKode = 10619;

        System.out.println("\n" + kurs.kursNavn + "\n" + kurs.kursKode);



    }
}