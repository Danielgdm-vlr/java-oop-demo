package vehicle;

public class Motorcycle extends Vehicle {

    private int numberOfPlaces;

    public Motorcycle() {
    }

    public Motorcycle(String color, int numberOfWheels) {
        super(color, numberOfWheels);
        this.numberOfPlaces = 2;
    }

    public Motorcycle(String color, int numberOfWheels, int numberOfPlaces) {
        super(color, numberOfWheels);
        this.numberOfPlaces = numberOfPlaces;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "numberOfPlaces=" + numberOfPlaces +
                ", color='" + color + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

    @Override
    public void refill() {
        System.out.println("The motorcycle is being refilled");
    }

    public static void drive() {

        System.out.println("The motorcycle is speeding on the highway");
    }
}
