package org.example;

import org.example.vehicle.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
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
    public static final VehicleType VEHICLE_TYPE = VehicleType.CAR;
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

    @Test
    void removeVehicleByTypeRemovesVehicle(@Mock Vehicle vehicle, @Mock Vehicle vehicle2) {
        vehicles.add(vehicle);
        vehicles.add(vehicle2);
        when(vehicle.getType()).thenReturn(VEHICLE_TYPE);
        when(vehicle2.getType()).thenReturn(VEHICLE_TYPE);
        assertEquals(List.of(), garage.removeVehicleByType(VEHICLE_TYPE));
    }

    @Test
    void emptyGarageRemovesVehicles(@Mock Vehicle vehicle, @Mock Vehicle vehicle2) {
        vehicles.add(vehicle);
        vehicles.add(vehicle2);
        assertEquals(List.of(), garage.emptyGarage());
    }


    @Nested
    class FixVehicle {
        @Test
        void fixVehicleWithIDGeneratesCorrectPrice(@Mock Vehicle vehicle) {
            vehicles.add(vehicle);
            when(vehicle.getId()).thenReturn(VEHICLE_ID);
            when(vehicle.calculatePrice()).thenReturn(150);
            assertEquals(150, garage.fixVehicle(VEHICLE_ID));
        }

        @Test
        void fixVehicleGeneratesCorrectPrice(@Mock Vehicle vehicle) {
            vehicles.add(vehicle);
            when(vehicle.calculatePrice()).thenReturn(150);
            assertEquals(150, garage.fixVehicle(vehicle));
        }

        @Test
        void fixVehiclesGeneratesCorrectPrice(@Mock Vehicle vehicle, @Mock Vehicle vehicle2) {
            vehicles.add(vehicle);
            vehicles.add(vehicle2);
            when(vehicle.calculatePrice()).thenReturn(150);
            when(vehicle2.calculatePrice()).thenReturn(250);
            assertEquals(400, garage.fixVehicles());
        }
    }
}