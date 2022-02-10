public class Main {
    public static void main(String[] args) {
       /* // Dette er planet-tingen
        public Planet(String n, int R, double M){
        Planet merkur = new Planet("Merkur", 2439, 3.285E23);
        Planet venus = new Planet("Venus", 6051, 4.867E24);
        Planet jorden = new Planet("Jorden", 6371, 5.972E24);
        Planet mars = new Planet("Mars", 3889, 6.39E23);
        Planet jupiter = new Planet("Jupiter", 69911, 1.898E27);
        Planet saturn = new Planet("Saturn", 58323, 5.863E26);
        Planet uranus = new Planet("Uranus", 25362, 8.681E25);
        Planet neptun = new Planet("Neptun", 24622, 1.024E26);
        }
        */
        /*
        Planet merkur = new Planet();
        merkur.planetNavn = "Merkur";
        merkur.planetRadius = 2439;
        merkur.planetMasse = 3.285E23;

        Planet venus = new Planet();
        venus.planetNavn = "Venus";
        venus.planetRadius = 6051;
        venus.planetMasse = 4.867E24;

        Planet jorden = new Planet();
        jorden.planetNavn = "Jorden";
        jorden.planetRadius = 6371;
        jorden.planetMasse = 5.972E24;

        Planet mars = new Planet();
        mars.planetNavn = "Mars";
        mars.planetRadius = 3889;
        mars.planetMasse = 6.39E23;

        Planet jupiter = new Planet();
        jupiter.planetNavn = "Jupiter";
        jupiter.planetRadius = 69911;
        jupiter.planetMasse = 1.898E27;

        Planet saturn = new Planet();
        saturn.planetNavn = "Saturn";
        saturn.planetRadius = 58323;
        saturn.planetMasse = 1.024E26;

        Planet uranus = new Planet();
        uranus.planetNavn = "Uranus";
        uranus.planetRadius = 24622;
        uranus.planetMasse = 8.681E25;

        Planet neptun = new Planet();
        neptun.planetNavn = "Neptun";
        neptun.planetRadius = 24622;
        neptun.planetMasse = 1.024E26;
        */

        Planet merkur = new Planet();
        merkur.setPlanetNavn("Merkur");
        merkur.setPlanetRadius(2439);
        merkur.setPlanetMasse(3.285E23);

        Planet venus = new Planet();
        venus.setPlanetNavn("Venus");
        venus.setPlanetRadius(6051);
        venus.setPlanetMasse(4.867E24);

        Planet jorden = new Planet();
        jorden.setPlanetNavn("Jorden");
        jorden.setPlanetRadius(6371);
        jorden.setPlanetMasse(5.972E24);

        Planet mars = new Planet();
        mars.setPlanetNavn("Mars");
        mars.setPlanetRadius(3889);
        mars.setPlanetMasse(6.39E23);

        System.out.println(
                "Planeten " + jorden.getPlanetNavn() +
                " har en radius på " + jorden.getPlanetRadius() +
                " og en masse på " + jorden.getPlanetMasse() + "kg.");


        jorden.getPlanetNavn();


    }/*
    public static void printPlanet(){

        System.out.println("Planeten " +  " har en radius på " + " og en masse på " + "kg.");


    }*/
}

