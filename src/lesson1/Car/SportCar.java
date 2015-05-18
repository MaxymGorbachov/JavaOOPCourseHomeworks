package lesson1.Car;


public class SportCar extends Car {

    public SportCar(int fuel, String color, int fuelconsumption) {
        setFuel(fuel);
        setColor(color);
        setFuelconsumption(fuelconsumption);
    }

    @Override
    boolean startEngine() {
        return getFuel() >= 15;
    }

    @Override
    void stopEngine() {
        System.out.println("Sport car engine stopped");
    }
}

