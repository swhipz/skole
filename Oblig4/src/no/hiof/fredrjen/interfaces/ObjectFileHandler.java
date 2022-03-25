package no.hiof.fredrjen.interfaces;

import no.hiof.fredrjen.models.Planet;
import no.hiof.fredrjen.models.Star;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public interface ObjectFileHandler<T> {

                // lage såkalte "kontrakter"
        void writeObjectsToFile(File file, ArrayList<T> arrayList);
        ArrayList<T> readObjectsFromFile(File file);

}








