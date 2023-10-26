package org.example.vehicle;

public abstract class Vehicle {

    int id;
    int numberOfWheels;
    String type;
    String brand;
    int numberOfMirrors;

    public Vehicle(final int id, final int numberOfWheels, final String type, final String brand, final int numberOfMirrors) {
        this.id = id;
        this.numberOfWheels = numberOfWheels;
        this.type = type;
        this.brand = brand;
        this.numberOfMirrors = numberOfMirrors;
    }

    public abstract int calculatePrice();

    public abstract int getId();

    public abstract String getType();
}
