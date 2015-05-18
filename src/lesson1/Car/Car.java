package lesson1.Car;


public abstract class Car {

    private String color;
    private int fuel;
    private int fuelconsumption;

    abstract boolean startEngine ();

    abstract void stopEngine();

    double drive(){
        return ((double)fuel / fuelconsumption)* 100;
    }

     String holdSpeed(int speed){
       return "Holding " + speed + "km/h";
     }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(int fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }
}