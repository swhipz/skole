package no.hiof.fredrjen.models;

public class Person {

    protected String fornavn;
    protected String etternavn;
    protected int alder;

    public Person(String fornavn, String etternavn, int alder) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;

    }
    public void sammenlignAlderMedPerson(Person person){
        if(this.alder > person.getAlder()) {
            System.out.println(fornavn + " " + person.getEtternavn() + " er eldre.");
        }
        else if (person.getAlder() > this.alder) {
            System.out.println(person.getFornavn() + " " + person.getEtternavn() + " er eldre.");

        }
        else {
            System.out.println("Personene er like gamle.");
        }
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
        this.alder = alder;
    }
}
