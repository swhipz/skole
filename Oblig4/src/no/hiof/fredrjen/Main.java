package no.hiof.fredrjen;

import no.hiof.fredrjen.tools.StarCSVFilehandler;
import no.hiof.fredrjen.models.Planet;
import no.hiof.fredrjen.models.PlanetSystem;
import no.hiof.fredrjen.models.Star;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

    public static void main(String[] args) throws IOException {
        System.out.println(
                "                                                                        \n" +

                        "                                                                        \n" +
                        "    ______              __     _ __          __                         \n" +
                        "   / ____/_______  ____/ /____(_) /__       / /__  ____  ________  ____ \n" +
                        "  / /_  / ___/ _ \\/ __  / ___/ / //_/  __  / / _ \\/ __ \\/ ___/ _ \\/ __ \\\n" +
                        " / __/ / /  /  __/ /_/ / /  / / ,<    / /_/ /  __/ / / (__  )  __/ / / /\n" +
                        "/_/   /_/   \\___/\\__,_/_/  /_/_/|_|   \\____/\\___/_/ /_/____/\\___/_/ /_/ \n" +
                        "                                                                        \n" +
                        "                 ____  ____  __    __________   __ __                   \n" +
                        "                / __ \\/ __ )/ /   /  _/ ____/  / // /                   \n" +
                        "               / / / / __  / /    / // / __   / // /_                   \n" +
                        "              / /_/ / /_/ / /____/ // /_/ /  /__  __/                   \n" +
                        "              \\____/_____/_____/___/\\____/     /_/                      \n" +
                        "                                                                        \n" +
                        "                                                                        \n" +
                        "                                                                        \n" +

                        "                                                                        ");



        Star sun = new Star("sun", 1.0, 1.0, 5777);
        Star mucas = new Star("MU Cas", 4.192, 4.656, 14750.0);
        Star v69 = new Star("V69-47", 1.316, 0.876, 5945.0);
        Star yz = new Star("YZ Cas", 2.547, 2.308, 9200.0);
        Star NGC = new Star("NGC188", 1.425, 1.102, 5900.0);
        Star zet = new Star("zet Phe", 2.853, 3.922, 14550.0);

        PlanetSystem solarSystem = new PlanetSystem("Solar System", sun);
        //planetobjekter
        solarSystem.addPlanet(new Planet("Mercury", 3.283E23,2439.7, 0.387, 0.206, 88, sun));
        solarSystem.addPlanet(new Planet("Venus",4.867E24,6051.8, 0.723, 0.007, 225, sun));
        solarSystem.addPlanet(new Planet("Earth",5.972E24,6371, 1, 0.017, 365, sun));
        solarSystem.addPlanet(new Planet("Mars",6.39E23,3389.5, 1.524, 0.093, 687, sun));
        solarSystem.addPlanet(new Planet("Jupiter",1.898E27,69911, 5.20440, 0.049, 4380, sun));
        solarSystem.addPlanet(new Planet("Saturn",5.683E26,58232, 9.5826, 0.057, 10585, sun));
        solarSystem.addPlanet(new Planet("Uranus",8.681E25,25362, 19.2184, 0.046, 30660, sun));
        solarSystem.addPlanet(new Planet("Neptune",1.024E26,24622, 30.11, 0.010, 60225, sun));



        // 2 . 1
//________________________________________________________________________________________________________________________________
        System.out.println("\n **************||| Oppgave 2.1  |||*************\n" );

        // sorteringen går per koden i CelestialBody (linje 45++) etter radiusverdien av planetene.
        ArrayList<Planet> planets = solarSystem.getPlanets();
        System.out.println(" \n **Planetenes rekkefølge før sortering etter radius:** ");

        for (Planet p: planets) {
            System.out.println(p);
        }


        Collections.sort(planets);

        // print ut planetene etter hverandre og ikke på en linje (tidligere problem jeg strevet med hehhe)
        System.out.println("\n** Objektene er her sortert etter størrelse (radius): **");
        for (Planet p : planets) {
            System.out.println(p);
        }






        System.out.println("\n **************||| Oppgave 2.2a og 2.2b  |||*************\n" );
        //2.2
        // skriv liste med objekter til csv fil
        // ObjectFileHandler.writeObjectsToFile(planets, file1);
        //Les fra CSV-filen

        // For at dette skal fungere og kjøre som det skal må vel begge oppgavene være besvart og gjort riktig,
        // dette mener jeg at jeg har gjort et tilstrekkelig forsøk på her.



        StarCSVFilehandler starCsvFilehandler = new StarCSVFilehandler();

        ArrayList<Star> starlist = new ArrayList<>();
        starlist.add(sun);
        starlist.add(mucas);
        starlist.add(v69);
        starlist.add(yz);
        starlist.add(NGC);
        starlist.add(zet);


        File starfile = new File("starlist.csv");

        starCsvFilehandler.writeObjectsToFile(starfile, starlist);
        starCsvFilehandler.readObjectsFromFile(starfile);


        System.out.println(starCsvFilehandler.readObjectsFromFile(starfile));




    }

}

