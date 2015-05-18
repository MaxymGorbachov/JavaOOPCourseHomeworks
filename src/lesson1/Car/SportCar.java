package lesson1.Car;


public class SportCar extends Car {

    public SportCar(int fuel, String color, int fuelconsumption) {
        setFuel(fuel);
        setColor(color);
        setFuelconsumption(fuelconsumption);
    }

    @Override
    boolean startEngine() {
        if (getFuel() < 15) {
            return false;
        }
        return true;
    }

    @Override
    void stopEngine() {
        System.out.println("Sport car engine stopped");
    }
}

