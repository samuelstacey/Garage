package org.example;

import org.example.vehicle.Vehicle;

import java.util.ArrayList;

public class Garage {

    ArrayList<Vehicle> vehicles;

    public Garage(final ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Vehicle> addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicles;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public ArrayList<Vehicle> removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        return vehicles;
    }

    public ArrayList<Vehicle> removeVehicleByID(int vehicleID) {
        vehicles.removeIf(vehicle -> vehicle.getId() == vehicleID);
        return vehicles;
    }

    public ArrayList<Vehicle> removeVehicleByType(String vehicleType) {
        vehicles.removeIf(vehicle -> vehicle.getType().equals(vehicleType));
        return vehicles;
    }

    public ArrayList<Vehicle> emptyGarage() {
        vehicles.clear();
        return vehicles;
    }

    public int fixVehicle(int id) {
        return vehicles.stream().filter(vehicle -> vehicle.getId() == id)
                .findFirst()
                .get()
                .calculatePrice();
    }

    public int fixVehicle(Vehicle vehicle) {
        return vehicle.calculatePrice();
    }

    public int fixVehicles() {
        return vehicles.stream()
                .map(Vehicle::calculatePrice)
                .reduce(0, Integer::sum);
    }
}
