package no.hiof.fredrjen.interfaces;

import no.hiof.fredrjen.models.PlanetSystem;

public interface FileHandler<T extends Object> {

    void doSomethingWithObject(T object);

    T getObject();


    String getFile();

    int compareTo(PlanetSystem o);

    void writeObjectsToFile();

    void readObjectsFromFile();

}
