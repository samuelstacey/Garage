package org.example;

import org.example.vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GarageTest {

    public static final int VEHICLE_ID = 1;
    Garage garage;
    final ArrayList<Vehicle> vehicles = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        garage = new Garage(vehicles);
    }

    @Test
    void addVehicleAddsVehicle(@Mock Vehicle vehicle) {
        assertEquals(List.of(vehicle), garage.addVehicle(vehicle));
    }

    @Test
    void removeVehicleRemovesVehicle(@Mock Vehicle vehicle) {
        vehicles.add(vehicle);
        assertEquals(List.of(), garage.removeVehicle(vehicle));
    }

    @Test
    void removeVehicleByIDRemovesVehicle(@Mock Vehicle vehicle) {
        vehicles.add(vehicle);
        when(vehicle.getId()).thenReturn(VEHICLE_ID);
        assertEquals(List.of(), garage.removeVehicleByID(VEHICLE_ID));
    }
}