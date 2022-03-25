package no.hiof.fredrjen.tools;



import no.hiof.fredrjen.interfaces.ObjectFileHandler;
import no.hiof.fredrjen.models.Star;

import java.io.*;
import java.util.ArrayList;

public class StarCSVFilehandler implements ObjectFileHandler<Star> {


    @Override
    public void writeObjectsToFile(File file, ArrayList<Star> starlist) {
        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))
        ) {
            for (Star oneStar : starlist) {
                bufferedWriter.write(oneStar.getName() + ", " + oneStar.getRadius() + ", " +
                        oneStar.getMass() + ", " + oneStar.getEffectiveTemp());

                bufferedWriter.newLine();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    @Override
    public ArrayList<Star> readObjectsFromFile(File file) {
        ArrayList<Star> starlistRead = new ArrayList<>();

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] value = line.split(", ");

                Star s = new Star(value[0], Double.parseDouble(value[1]), Double.parseDouble(value[2]), Double.parseDouble(value[3]));

                starlistRead.add(s);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return starlistRead;
    }
}