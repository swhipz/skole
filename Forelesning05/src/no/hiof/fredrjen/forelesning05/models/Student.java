package no.hiof.fredrjen.forelesning05.models;

public class Student {

    private String fornavn;
    private String etternavn;
    private int alder;
    private String studentId;
    private Kurs kurs;


    public Student (String f, String e, int a, String id){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
        this.studentId = studentId;



    }

    public void printBeskrivelse() {
        System.out.println("Hei. Jeg er en " + this.alder + " år gammel student med navn " +
                this.fornavn + " " + this.etternavn + ". Min studentid er " + this.studentId + ".");}

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        //minst 0. max 120
        if (alder < 0 || alder > 120) {
            System.out.println("Alder må være mellom 0 og 120.");
        } else {
            this.alder = alder;
        }
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}




