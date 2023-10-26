package org.example.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @Nested
    class CalculatePrice {
        @Test
        void calculatePriceReturnsCorrectPriceDefault() {
            car = new Car(1, 3, VehicleType.CAR,
                    "Ford", 2, 2);
            assertEquals(100, car.calculatePrice());
        }

        @Test
        void calculatePriceReturnsCorrectPrice4Wheels() {
            car = new Car(1, 4, VehicleType.CAR,
                    "Ford", 2, 2);
            assertEquals(150, car.calculatePrice());
        }

        @Test
        void calculatePriceReturnsCorrectPrice4Doors() {
            car = new Car(1, 3, VehicleType.CAR,
                    "Ford", 2, 4);
            assertEquals(200, car.calculatePrice());
        }
    }

}