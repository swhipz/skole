public class Student {
        // klasse for å representere studenter
        //objektene for disse verdiene vil være fornavn, etternavn, alder og studentID
        // dette er et ganske godt eksempel på en ren klasse
    public String fornavn;
    public String etternavn;
    public int alder;
    public String studentId;

    Student(String f, String e, int a, String i) {
        this.fornavn = f;
        this.etternavn = e;
        this.alder = a;
        this.studentId = i;

    }
    void skrivUtStudent() {
        System.out.println("Studentinformasjon" + "\n"
                + "Fornavn: " + this.fornavn + "\n"
                + "Etternavn: " + this.etternavn + "\n"
                + "Alder: " +  this.alder + "\n"
                + "Student-ID: " + this.studentId + "\n" + "\n");
    }

}

