// Product
abstract class Vehicle {
    public abstract void drive();
}

// Concrete Products
class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving a car.");
    }
}

class Bike extends Vehicle {
    public void drive() {
        System.out.println("Riding a bike.");
    }
}

// Creator
abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}

// Concrete Creator
class CarFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Bike();
    }
}
