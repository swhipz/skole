package no.hiof.fredrjen.models;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CelestialBody implements Comparable<CelestialBody> {
    private String name;
    private double radius, mass;

    public static final double GRAVITATIONAL_CONSTANT = 6.67408E-11;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public abstract double getMassInKg();

    public abstract double getRadiusInKm();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }


    //oppgave 2.1 -- mye styr for å få det vi gikk gjennom i forelesning til å fungere med dette

    @Override
    public int compareTo(CelestialBody o) {
        int planet = 0;
        String sort = "Sorting successful";
        if (this.getRadius() < o.getRadius()) {
            return -1;
        } else if (this.getRadius() > o.getRadius()) {
            return 1;
        } else {
            return 0;
        }
    }

}
