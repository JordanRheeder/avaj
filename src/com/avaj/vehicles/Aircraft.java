package com.avaj.vehicles;

import com.avaj.weather.Coordinates;

public class Aircraft {
    protected Long id;
    protected String name;
    protected Coordinates coordinates;
    protected static long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {

        this.id = nextId();
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return (Long.toString(id));
    }

    private long nextId() {
        return (idCounter++);
    }
}
