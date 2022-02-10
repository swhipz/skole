import no.hiof.fredrjen.oblig2.models.Planet;
import no.hiof.fredrjen.oblig2.models.PlanetSystem;
import no.hiof.fredrjen.oblig2.models.Star;
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {

        // jeg må lage objekter av Planet-system, objekter av Planet og et objekt av Star.
        // jeg gjør det først.


        PlanetSystem solarSystem = new PlanetSystem("Solar system", "Solen");


        //solsystemets planeter
        /*
        Planet merkur = new Planet("Merkur", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet jorden = new Planet("Jorden", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptun = new Planet("Neptun", 0.34440217087226543, 0.05395152792413066);*/


        //lage stjernen
        Star solen = new Star("Solen", 1.0, 1.0, 5777);

        // prøver å legge inn planeten på en annen måte
        solarSystem.getPlanets().add(new Planet("Merkur", 0.03412549655905556, 1.7297154899894627E-4));
        System.out.println(solarSystem.getPlanets().size());
        // ^her erkjenner terminalen hvertfall at det er 1 (!) objekt i listen
        // ender ikke opp med null her men med en annen utskrift
        System.out.println(solarSystem.getPlanets());


        /* for (Planet xPlanet : solarSystem.getPlanets()) {
            System.out.println(xPlanet.getPlanetName());
        }*/



        /*
        for (int x = 0; x < planetsys.size(); x++) {
            Planet xPlanet = planetsys.get(x);
            System.out.println(xPlanet.getPlanetName());
        }*/


    }
}
