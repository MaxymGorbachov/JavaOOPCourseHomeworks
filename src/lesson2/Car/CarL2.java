package lesson2.Car;

/**
 * @author Alexander Tyshchenko.
 */
public class CarL2 {
    private String name;
    private Engine engine;
    private Climate climate = new Climate();

    public CarL2(String name) {
        this(name, 0);
    }

    public CarL2(String name, double mileage) {
        this.name = name;
        engine = new Engine(mileage);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }

    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    public void turnOff() {
        climate.turnOff();
        engine.turnOff();
    }

    public void start(int speed, double hours) {
        if (engine.isStarted()) {
            double distance = hours * speed;
            engine.addMileage(distance);
        }
    }

    @Override
    public String toString() {
        return "CarL2{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", climate=" + climate +
                '}';
    }
}
