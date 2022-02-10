public class KlasserOgObjekter {


    public static void main(String[] args) {
    /* Dette er i hovedsak "basic" måten å gjøre dette på.
        Student Fredrik;
        Fredrik = new Student();
        Fredrik.fornavn = "Fredrik";
        Fredrik.etternavn = "Jensen";
        Fredrik.alder = 22;
        Fredrik.studentId = "42069691337";

        System.out.println(Fredrik.fornavn + "\n" + Fredrik.etternavn + "\n" + Fredrik.alder + "\n" + Fredrik.studentId);
        System.out.println();
    /*
        Student Mækken;
        Mækken = new Student();
        Mækken.fornavn = "Mækken";
        Mækken.etternavn = "Lækken";
        Mækken.alder = 69;
        Mækken.studentId = "42069";

        System.out.println(Mækken.fornavn + "\n" + Mækken.etternavn + "\n" + Mækken.alder + "\n" + Mækken.studentId);
        System.out.println();
        System.out.println();
*/
        // denne måten å skrive opp på krever at det blir definert slik i Pult.java -klassen
        Pult p1 = new Pult("Loddbrok", 120, 250, 60, "Loddbrok_mk1");

        p1.skrivUtPult();
        System.out.println();


        //Jeg vil nå forsøke å gjøre dette med student -classen.

        Student s1 = new Student("Fredrik", "Jensen", 22, "69420");
        Student s2 = new Student("Jab", "Mababalls", 69, "691337");
        Student s3 = new Student ("Joe", "Mama", 420, "no u");

        System.out.println();

        s1.skrivUtStudent();
        s3.skrivUtStudent();
        System.out.println();
        s2.skrivUtStudent();
    }


}
