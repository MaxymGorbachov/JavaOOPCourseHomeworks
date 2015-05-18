package lesson2.Car;


public class Engine {
    private double mileage;
    private boolean started;


    public int getConsumption() {
        return consumption;
    }

    private int consumption;


    public int fuelCons(double getVolume){
     consumption = (int)(getVolume*10*0.5);
        return consumption;
    }


    public Engine(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "mileage=" + mileage +
                ", started=" + started +
                '}';
    }
}
