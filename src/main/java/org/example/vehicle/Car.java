package org.example.vehicle;

public class Car extends Vehicle {

    private final int numberOfDoors;

    private final static VehicleType type = VehicleType.CAR;

    public Car(final int id, final int numberOfWheels, final VehicleType VehicleType, final String brand,
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
    public VehicleType getType() {
        return type;
    }

    @Override
    public String toString() {
        return '\n' + "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", id=" + id +
                ", numberOfWheels=" + numberOfWheels +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                ", numberOfMirrors=" + numberOfMirrors +
                '}';
    }
}
