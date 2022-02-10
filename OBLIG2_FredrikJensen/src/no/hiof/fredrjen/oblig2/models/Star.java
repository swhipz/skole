package no.hiof.fredrjen.oblig2.models;

public class Star {
    // lager private instansvariabler for Star
    private String starName;
    private double starRadius;
    private double starMass;
    private int starEffectiveTemp;
    // må lage konstruktør for Star
    public Star(String starName, double starRadius, double starMass, int starEffectiveTemperature) {
            this.starName = starName;
            this.starRadius = starRadius;
            this.starMass = starMass;
            this.starEffectiveTemp = starEffectiveTemp;
    }
    // skap gettere og settere for star
    // hurtig-generert med intellij pga cba - det holdt med planet
    public String getsName() {
        return starName;
    }

    public void setsName(String sName) {
        this.starName = sName;
    }

    public double getsRadius() {
        return starRadius;
    }

    public void setsRadius(double sRadius) {
        this.starRadius = sRadius;
    }

    public double getsMass() {
        return starMass;
    }

    public void setsMass(double sMass) {
        this.starMass = sMass;
    }

    public int getsEffectiveTemp() {
        return starEffectiveTemp;
    }

    public void setsEffectiveTemp(int sEffectiveTemp) {
        this.starEffectiveTemp = sEffectiveTemp;
    }
}
