package no.hiof.fredrjen.forelesning08.models;

public class Snekker extends Person {

    private int antallHusBygd;

    public Snekker(String fornavn, String etternavn, int alder, int antallHusBygd) {
        super(fornavn, etternavn, alder);

        this.antallHusBygd = antallHusBygd;
    }

    public int getAntallHusBygd() {
        return antallHusBygd;
    }

    public void setAntallHusBygd(int antallHusBygd) {

        this.antallHusBygd = antallHusBygd;
    }
}
