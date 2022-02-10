package no.hiof.fredrjen.oblig1;

import java.util.Scanner;
// dette er oppgave 2.2 i oblig 1
public class ToTheMoon {
    public static void main(String[] args) {
        // jeg laget en input fra tastatur 'Sys.in', slik at vekt-variabelen er relativ til brukeren

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("MÅNEVEKTKALKULATOREN");
        System.out.println();
        System.out.print("Skriv inn din VEKT(kg): ");
        double moon = .165; // bruker her double datatypen fordi det tar for seg desimaler
        int vekt = input.nextInt();
        System.out.println("Din vekt på jorden er " + vekt + "kg, det tilsvarer: "+ vekt*moon + "kg på månen!");
                        //   Text + hente inn vektvariabel + Text + gange vekt-verdi med måne-verdi + tekststreng


        System.out.print("Skriv hvor mye du tar i markløft(kg): ");
        short repsmaximum = input.nextShort();
        double moonToEarth = 16.5;
        System.out.println();
        System.out.println("Hvis din 1RM i markløft er "+ repsmaximum + "kg, vil du kunne løfte: " + repsmaximum*moonToEarth + "kg på månen! Light weight baby!");
    }
}
