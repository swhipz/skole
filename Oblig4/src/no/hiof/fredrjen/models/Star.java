package no.hiof.fredrjen.models;

public class Star extends CelestialBody{
    private double effectiveTemp;

    public static final double SOLAR_RADIUS_IN_KM = 695700;
    public static final double SOLAR_MASS_IN_KG = 1.98892E30;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public double getRadiusInKm() {
        return getRadius() * SOLAR_RADIUS_IN_KM;
    }




    @Override
    public double getMassInKg() {
        return getMass() * SOLAR_MASS_IN_KG;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public String toString() {
        return String.format("%s has a radius of %s Rsun, a mass of %s Msun and a effective temperature of %.0f K \n", getName(), getRadius(), getMass(), effectiveTemp );
    }



    // oppgave 2.2 - gjøre så star-arraylisten blir skrevet ut til en CSV-fil


 }




    // Oppgave 2.2 - les fra filen
   /* @Override
    public void readObjectsFromFile(ArrayList<Star> starList, File starfile) {

        ArrayList<Star> starlist = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(starfile))) {

            String lineString;

            while ((lineString = bufferedReader.readLine()) != null) {
                String[] vS =  lineString.split(",");

                Star star = new Star(vS[0], Double.parseDouble(vS[1]), Double.parseDouble(vS[2]), Double.parseDouble(vS[3]));

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/


