package vehicle;

public abstract class Vehicle {

    protected String color;
    protected int numberOfWheels;

    public Vehicle() {
    }

    public Vehicle(String color, int numberOfWheels) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = Math.abs(numberOfWheels);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

    public static void drive() {
        System.out.println("Vehicle drives with speed limit");
    }

    public abstract void refill();
}
