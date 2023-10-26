package org.example.vehicle;

public class Motorbike extends Vehicle {

    private int numberOfHandles;
    private boolean hasStorageBox;
    private final static String type = "Motorbike";

    public Motorbike(final int id, final int numberOfWheels, final String type, final String brand, final int numberOfMirrors, final int numberOfHandles, final boolean hasStorageBox) {
        super(id, numberOfWheels, type, brand, numberOfMirrors);
        this.numberOfHandles = numberOfHandles;
        this.hasStorageBox = hasStorageBox;
    }

    public int calculatePrice() {
        if (hasStorageBox) {
            return 350;
        }
        return 150;
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
