package org.example;

import org.example.vehicle.Car;
import org.example.vehicle.Motorbike;
import org.example.vehicle.Van;
import org.example.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 * Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.).
 * Each derived class should have its own attributes in addition to the normal Vehicle attributes.
 *
 * Using an array, store all your Vehicles in a Garage class.
 *
 * Create a method in Garage that iterates through each Vehicle,
 * calculating a bill for each type of Vehicle in a different way,
 * depending on the type of Vehicle it is (this does not need to be complex).
 *
 * Garage should have methods that add a Vehicle, remove a Vehicle 
 * by its ID or its type, fix a Vehicle (which calculates the bill) and to empty the Garage.
 *
 * Garage should have a method to remove multiple Vehicles by their type.
 */
public class App 
{
    public static void main( String[] args ) {
        Car car = new Car(1, 3, VehicleType.CAR,
                "Ford", 2, 2);
        Van van = new Van(1, 3, VehicleType.VAN,
                "Ford", 2, 2, 150);
        Motorbike motorbike = new Motorbike(1, 3, VehicleType.MOTORBIKE,
                "Ford", 2, 2, true);
        Garage garage = new Garage(new ArrayList<>());

        garage.addVehicle(car);
        garage.addVehicle(van);
        garage.addVehicle(motorbike);

        System.out.println(garage);

        System.out.println(car.getType().name() + " fixing price: " + garage.fixVehicle(car));
        System.out.println(van.getType().name() + " fixing price: " + garage.fixVehicle(van.getId()));
        System.out.println(motorbike.getType().name() + " fixing price: " + garage.fixVehicle(motorbike));
        System.out.println("Total price: " + garage.fixVehicles());
    }
}
