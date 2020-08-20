package com.avaj.weather;

public abstract class Tower {
    pirvate List<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    protected viod conditionsChanged() {

    }
}
