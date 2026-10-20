abstract class Car {
    void start() {
        System.out.println("Car started");
    }

    abstract void accelerate();
    abstract void brake();
}

class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Fuel car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel car is stopping");
    }
}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric car is stopping");
    }
}

public class lec17part1 {
    public static void main(String[] args) {
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}