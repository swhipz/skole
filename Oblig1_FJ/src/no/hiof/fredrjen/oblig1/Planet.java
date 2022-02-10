package no.hiof.fredrjen.oblig1;

public class Planet{
    //gjør instansvariablene private - innkapsling (?)
    private String pNavn;
    private int pRadius;
    private double pMasse;

    public Planet(String pNavn, int pRadius, double pMasse){
        this.pNavn = pNavn;
        this.pRadius = pRadius;
        this.pMasse = pMasse;
    }



    // Lager gettere og settere for alle variablene
    public String getpNavn() {
        return pNavn;
    }

    public void setpNavn(String pNavn) {
        this.pNavn = pNavn;
    }

    public int getpRadius() {
        return pRadius;
    }

    public void setpRadius(int pRadius) {
        this.pRadius = pRadius;
    }

    public double getpMasse() {
        return pMasse;
    }

    public void setpMasse(double pMasse) {
        this.pMasse = pMasse;
    }

    // en print-metode slik at jeg slipper å skrive system.out.pr... etc hver eneste gang, gode greier

    public void printPlanetFull() {
        System.out.println("\n" + pNavn +
               "\n" + "Planeten " + pNavn + " har en radius på " + pRadius + " km, og en masse på " + pMasse +"kg.");

    }



}
