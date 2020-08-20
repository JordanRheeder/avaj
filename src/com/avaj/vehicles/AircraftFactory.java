package com.avaj.vehicles;

import com.avaj.weather.Coordinates;

public class AircraftFactory {
    enum Aircrafts {
        helicopter,
        jetplane,
        balloon
    }

    public Flyable new Aircraft(String type, String name, int longitude, int latitude, int height) throws InvalidAircaftTypeException {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);

        try {
            switch (Aircrafts.valueOf())
        }
    }
}
