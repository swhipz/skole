import no.hiof.fredrjen.oblig2.models.Planet;
import no.hiof.fredrjen.oblig2.models.PlanetSystem;
import no.hiof.fredrjen.oblig2.models.Star;
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {

        // jeg må lage objekt og arraylist av Planet-system, objekter av Planet og og et objekt av Star.

        PlanetSystem solarSystem = new PlanetSystem("Solsystemet", "Solen");


        //solsystemets planeter
        Planet merkur = new Planet("Merkur", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet jorden = new Planet("Jorden", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptun = new Planet("Neptun", 0.34440217087226543, 0.05395152792413066);


        //lage stjernen
        Star solen = new Star("Solen", 1.0, 1.0, 5777);
        //legger inn planetene i ArrayListen
        solarSystem.getPlanets().add(merkur);
        solarSystem.getPlanets().add(venus);
        solarSystem.getPlanets().add(jorden);
        solarSystem.getPlanets().add(mars);
        solarSystem.getPlanets().add(jupiter);
        solarSystem.getPlanets().add(saturn);
        solarSystem.getPlanets().add(uranus);
        solarSystem.getPlanets().add(neptun);
        // jeg er fult klar over at jeg kunne lagd objektene på en ryddigere måte utenom
        // å kalle opp Planet planetkode = new Planet("", 1, 1);
        // ettersom jeg allerede hadde skrevet opp disse. Ville ellers gjort slik: solarSystem.getPlanets().add(new Planet("Merkur".....)

        System.out.println("Antall Planeter i planetsystemet: " + solarSystem.getPlanets().size());
        System.out.println("Liste over Planeter og informasjon om planetene: " + "\n" + "\n" + solarSystem);
        System.out.println(solarSystem.getPlanets());

        System.out.println("Planetenes navn i rekkefølge er som følger:");
        for (Planet xPlanet : solarSystem.getPlanets()) {
            System.out.println("Planetnavn: " + xPlanet.getPlanetName());
        }
        System.out.println();
        System.out.println();
        // videre.


        // print for saturns radius i km
        System.out.println("Saturns radius i kilometer er: " + saturn.getPlanetRadiusInKm() + "km. " + "\n");
        // print for saturns masse i kg
        System.out.println("Saturns masse i kilogram er: " + saturn.getPlanetMassInKg() + "kg. " + "\n");
        // print for solens radius i km
        System.out.println("Solens radius i KM er: " + solen.sunRadiusInKm() + "km. " + "\n");
        //print for solens masse i kg
        System.out.println("Solens masse i KG er: " + solen.sunMassInKg() + "kg. " + "\n");

        // print ut overflategravitasjon (surfaceGravity)
        System.out.println("Overflategravitasjonen på Neptun er: " + neptun.getOverflateGravitasjon() + " meter per sekund!");



    }
}