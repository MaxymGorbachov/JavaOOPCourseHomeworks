package lesson2.Car;


public class CarExample {
    public static void main(String[] args) {
        CarL2 bmw = new CarL2("BMW");
        CarL2 ferrari = new CarL2("Ferrari", 20000);

        System.out.println(bmw);

        bmw.turnOn();
        ferrari.turnOn();

        final int[] speeds = {20, 60, 100};

        for (int s : speeds)
            bmw.start(s, 0.5);
//        Java 8
//        Arrays.stream(speeds).forEach((s) -> bmw.start(s, 0.5));
        for (int s : speeds)
            ferrari.start(s, 1);
//        Java 8
//        Arrays.stream(speeds).forEach((s) -> ferrari.start(s, 0.5));


        bmw.turnOff();
        ferrari.turnOff();

        System.out.println(bmw.getName() + ": " + bmw.getMileage());
        System.out.println(ferrari.getName() + ": " + ferrari.getMileage());
        System.out.println();

    }
}
