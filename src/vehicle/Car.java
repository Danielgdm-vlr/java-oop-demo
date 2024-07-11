package vehicle;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car() {
    }

    public Car(String color, int numberOfWheels) {
        super.color = color;
        super.numberOfWheels = numberOfWheels;
        this.numberOfDoors = 4;
    }

    public Car(String color, int numberOfWheels, int numberOfDoors) {
        super(color, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void refill() {
        System.out.println("The car is required to be refilled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", color='" + color + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

    public static void drive() {

        System.out.println("The car is driving on the road");
    }
}
