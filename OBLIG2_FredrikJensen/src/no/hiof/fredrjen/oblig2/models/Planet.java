package no.hiof.fredrjen.oblig2.models;

import java.util.ArrayList;

public class Planet extends PlanetSystem{
    // lag private instansvariabler for planet
    private String planetName;
    private double planetRadius;
    private double planetMass;




    // konstruktør for planeter
    public Planet(String Planetnavn, double Planetradius, double Planetmasse){
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
        return "Planeten heter: " + planetName + "\n" + "Planetens radius: " + planetRadius + "\n" + "Planetens masse: " + planetMass + "\n";
    }
}
