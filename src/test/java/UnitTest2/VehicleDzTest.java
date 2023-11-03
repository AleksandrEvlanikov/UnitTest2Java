package UnitTest2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VehicleDzTest {

    private Car vehicle;
    private Motorcycle vehicleMo;


    @BeforeEach
    public void setup(){
        vehicle = new Car("Toyota", "Camry", 2023);
        vehicleMo = new Motorcycle("Ям", "Run", 2009);
    }

    @Test
    @DisplayName("Проверка на экземпляр класса Car")
    public void testCarIsInstanceOfVehicle(){
        assertTrue(vehicle instanceof Vehicle);
    }

    @Test
    @DisplayName("Проверка на экземпляр класса Motorcycle")
    public void testMotorcycleIsInstanceOfVehicle(){
        assertTrue(vehicleMo instanceof Vehicle);
    }

    @Test
    @DisplayName("Проверка обьекта Car с 4-мя колесами")
    public void testCarHasFourWheels(){
        int assumesWheels = 4;
        int actualWheels = vehicle.getNumWheels();

        assertEquals(assumesWheels, actualWheels);
    }

    @Test
    @DisplayName("Проверка обьекта Motorcycle с 2-мя колесами")
    public void testMotorcycleHasFourWheels(){
        int assumesWheels = 2;
        int actualWheels = vehicleMo.getNumWheels();

        assertEquals(assumesWheels, actualWheels);
    }
    @Test
    @DisplayName("Проверка скорости обьекта Car")
    public void testCarSpeed(){
        vehicle.testDrive();

        int assumesSpeed = 60;
        int actualSpeed = vehicle.getSpeed();
        assertEquals(assumesSpeed, actualSpeed);
    }

    @Test
    @DisplayName("Проверка скорости обьекта Motorcycle")
    public void testMotorcycleSpeed(){
        vehicleMo.testDrive();

        int assumesSpeed = 75;
        int actualSpeed = vehicleMo.getSpeed();
        assertEquals(assumesSpeed, actualSpeed);
    }

    @Test
    @DisplayName("Проверка парковки обьекта Car")
    public void testCarPark(){
        vehicle.testDrive();
        vehicle.park();

        int assumesSpeed = 0;
        int actualSpeed = vehicle.getSpeed();
        assertEquals(assumesSpeed, actualSpeed);
    }
    @Test
    @DisplayName("Проверка парковки обьекта Motorcycle")
    public void testMotorcyclePark(){
        vehicleMo.testDrive();
        vehicleMo.park();

        int assumesSpeed = 0;
        int actualSpeed = vehicleMo.getSpeed();
        assertEquals(assumesSpeed, actualSpeed);
    }

}
