package no.hiof.fredrjen.oblig2.models;

import java.util.ArrayList;

public class Planet extends PlanetSystem{
    // lag private instansvariabler for planet
    private String planetName;
    private double planetRadius;
    private double planetMass;




    // konstruktør for planeter
    public Planet(String planetName, double planetRadius, double planetMass){
        super("Solsystemet", "Solen");
        this.planetName = planetName;
        this.planetRadius = planetRadius;
        this.planetMass = planetMass;
    }
    // lager gettere og settere -- se så pent å se på! NP.
 /*   public String getPlanetName(){return planetName; }
    public void setPlanetName(String planetName) {this.planetName = planetName; }
    public double getPlanetRadius(){return planetRadius; }
    public void setPlanetRadius(int planetRadius){this.planetRadius = planetRadius; }
    public double getPlanetMass(){return planetMass = planetMass; }
    public void setPlanetMass(double planetMass){this.planetMass = planetMass; }*/

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public double getPlanetRadius() {
        return planetRadius;
    }

    public void setPlanetRadius(double planetRadius) {
        this.planetRadius = planetRadius;
    }

    public double getPlanetMass() {
        return planetMass;
    }

    public void setPlanetMass(double planetMass) {
        this.planetMass = planetMass;
    }

    @Override
    public String toString(){
        return "\n" + "Planet: " + planetName + "\n" + "Planet radius: " + planetRadius + "\n" + "Planet masse: " + planetMass + "\n";
    }

    // omregning for å returnere radius i km
    public double getPlanetRadiusInKm(){
        return planetRadius * 71492;

    }
    // omregning for å returnere planetens masse i KG
    public double getPlanetMassInKg(){
        return planetMass * 1.898E27;
    }

    //bonusoppg. 3.1
    public double getPlanetRadiusEarth(){
        return planetRadius * 6371;
    }
    public double getPlanetMassEarth(){
        return  planetMass * 5.972E24;
    }

    // finne surface gravity for planeter.
    // inc stuk
//
    public double getOverflateGravitasjon(){
        return (6.67408E-11 * getPlanetMassInKg()) / ((Math.pow(getPlanetRadiusInKm(), 2)*Math.pow(10, 6)));
    }  //     grav.konstant*MASS / radius opphøyd ^2 gange 1million (quick maffs)

}
