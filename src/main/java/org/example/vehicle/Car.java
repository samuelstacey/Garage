package org.example.vehicle;

public class Car extends Vehicle {

    private int numberOfDoors;

    private final static String type = "Car";

    public Car(final int id, final int numberOfWheels, final String type, final String brand,
               final int numberOfMirrors, final int numberOfDoors) {
        super(id, numberOfWheels, type, brand, numberOfMirrors);
        this.numberOfDoors = numberOfDoors;
    }

    public int calculatePrice() {
        if (numberOfDoors > 2) {
            return 200;
        }
        if (numberOfWheels > 3) {
            return 150;
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
