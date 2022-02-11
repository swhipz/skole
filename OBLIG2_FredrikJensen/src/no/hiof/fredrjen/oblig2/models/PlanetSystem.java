package no.hiof.fredrjen.oblig2.models;
import no.hiof.fredrjen.oblig2.models.Planet;
import java.util.ArrayList;

public class PlanetSystem {
    // planetsystem må være super-klassen i denne oppgaven.
    private String planetSystemName;
    private String centerStar;
    private ArrayList<Planet> planets;


    // lage konstruktør for planetsystem
    public PlanetSystem(String planetSystemName, String centerStar) {
        this.planetSystemName = planetSystemName;
        this.centerStar = centerStar;

        planets = new ArrayList<>();

    }

    // må lage gettere og settere etc
    // blir fort auto-generate her også

    public String getPlanetSystemName() {
        return planetSystemName;
    }

    public void setPlanetSystemName(String planetSystemName) {
        this.planetSystemName = planetSystemName;
    }

    public String getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(String centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planeter) {
        this.planets = planeter;
    }



    @Override
    public String toString() {
        return "\n" + "Planetsystemet " + planetSystemName + " har en stjerne som heter " + centerStar + ", og har " + getPlanets().size() + " planeter i seg.";

    }

}
