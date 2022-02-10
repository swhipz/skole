package no.hiof.fredrjen.forelesning07.models;

public class Snekker extends Person {
    private int antallHusbygd;

    public Snekker(String fornavn, String etternavn, int alder, int antallHusbygd) {
        super(fornavn, etternavn, alder);

        this.antallHusbygd = antallHusbygd;
    }
    public int getAntallHusbygd(){
        return antallHusbygd;
    }
    public void setAntallHusbygd(int antallHusbygd){
        this.antallHusbygd = antallHusbygd;
    }
}
