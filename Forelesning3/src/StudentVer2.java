public class StudentVer2 {

    // En rekke med instansvariabler som alle objekter av klassen skal inneholde.
    // Disse er deklarert, men ikke initialisert, ettersom dette må gjøres i forbindelse med
    // hvert opprettede objekt.
    public String fornavn;
    public String etternavn;
    public int alder;


    private String studentId;

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;

    }
    public int getAlder() {
        return alder;
    }/*
    public void setAlder(int alder) {
        //minst 0. max 120
        if (alder 0 < || > 120)) {
            System.out.println("Alder må være mellom 0 og 120");
    }
        this.alder = alder; */
    public void printBeskrivelse() {
        System.out.println(
                "Hei, jeg er en " + alder + "år gammel student med navn " +
                        fornavn + " " + etternavn + ". Min studentID er " + studentId + ".");


    }

}
