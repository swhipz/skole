package no.hiof.fredrjen.oblig1;

import java.util.Scanner;
        // dette er mitt forsøk på bonusoppgave 3.1 i oblig 1
        //
public class UserPlanets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String, int og double

        String userPlanetName;
        int userPlanetRadius;
        double userPlanetMass;


        System.out.print("Skriv inn en planet: ");
        userPlanetName = scanner.next();
        System.out.print(" - Planeten heter " + userPlanetName + "\n");

        System.out.print("Skriv inn radiusen til planeten: ");
        userPlanetRadius = scanner.nextInt();
        System.out.println(" - Planeten har en radius på " + userPlanetRadius + "km" + "\n");

        System.out.print("Skriv inn massen til planeten: ");
        userPlanetMass = scanner.nextDouble();
        System.out.println(" - Planeten har en masse på " + userPlanetMass + "kg" + "\n");

        System.out.println("I følge deg selv har planeten " + userPlanetName + " en omkrets på " + userPlanetRadius + "km " + "og en masse på " + userPlanetMass + ". Kun gudene, og google, vet om dette stemmer. ");





    }
}
