package no.hiof.fredrjen.models;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetSystem{
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets = new ArrayList<>();

    public PlanetSystem(String name, Star centerStar) {
        this.name = name;
        this.centerStar = centerStar;
    }

    public Planet getPlanet(String name) {
        for (Planet aPlanet : planets) {
            if (aPlanet.getName().equalsIgnoreCase(name)) {
                return aPlanet;
            }
        }

        return null;
    }

    public Planet getSmallestPlanet() {
        if (planets.size() == 0)
            return null;

        Planet smallestPlanet = planets.get(0);

        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadius() < smallestPlanet.getRadius()) {
                smallestPlanet = currentPlanet;
            } else if (currentPlanet.getRadius() == smallestPlanet.getRadius() &&
                    currentPlanet.getMass() < smallestPlanet.getMass()) {
                smallestPlanet = currentPlanet;
            }
        }

        return smallestPlanet;
    }

    public Planet getLargestPlanet() {
        if (planets.size() == 0)
            return null;

        Planet largestPlanet = planets.get(0);

        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadius() > largestPlanet.getRadius()) {
                largestPlanet = currentPlanet;
            } else if (currentPlanet.getRadius() == largestPlanet.getRadius() &&
                    currentPlanet.getMass() > largestPlanet.getMass()) {
                largestPlanet = currentPlanet;
            }
        }

        return largestPlanet;
    }

    public void addPlanet(Planet aPlanet) {
        planets.add(aPlanet);
    }

    public ArrayList<Planet> getPlanets() {
        return new ArrayList<>(planets);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    // Object.java
    @Override
    public String toString() {
        return name + " has " + planets.size() +
                " planets that revolve around the star " +
                centerStar.getName();
    }
    //----______-----______Oppgave 2.1 ______----------_____--
    // initialiserer compareto-implementasjonen


    /*
    Oppgave 2.1 - Sammenligning og sortering

Det er ofte naturlig å kunne sortere samlinger av objekter. Lag en naturlig sortering ved å
 implementere Comparable-interfacet som følger med i Java i klassene CelestialBody og PlanetSystem.
  Du velger selv hva du ser på som en naturlig sortering for hver av disse. Altså hva de sorteres basert på,
   og om de sorteres fra større til mindre eller motsatt. (Dette trengs ikke gjøres komplisert).
Test at du kan sortere listen med planeter i solsystemet vi opprettet i Oblig 3.

     */


}
