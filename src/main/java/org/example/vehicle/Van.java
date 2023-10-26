package org.example.vehicle;

public class Van extends Vehicle {

    private int numberOfDoors;

    private static String type = "Van";
    private int capacity;

    public Van(final int id, final int numberOfWheels, final String type,
               final String brand, final int numberOfMirrors, final int numberOfDoors, final int capacity) {
        super(id, numberOfWheels, type, brand, numberOfMirrors);
        this.numberOfDoors = numberOfDoors;
        this.capacity = capacity;
    }

    public int calculatePrice() {
        if (capacity > 150) {
            return 200;
        }
        return 100;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }
}
