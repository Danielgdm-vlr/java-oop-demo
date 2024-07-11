package vehicle;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("black", 4, 4);
        doWorkOnVehicle(car);

        System.out.println();
        Motorcycle motorcycle = new Motorcycle("red", 2, 2);
        doWorkOnVehicle(motorcycle);

        Vehicle carVehicle = car;
        doWorkOnVehicle(carVehicle);
        Vehicle motoVehicle = motorcycle;
        doWorkOnVehicle(motoVehicle);
    }

    private static void doWorkOnVehicle(Vehicle vehicle) {

        if (vehicle instanceof Car) {
            Car temp = (Car) vehicle;
            temp.drive();
        }
        else if (vehicle instanceof Motorcycle) {
            Motorcycle temp = (Motorcycle) vehicle;
            temp.drive();
        }
        vehicle.refill();
        vehicle.drive();
        System.out.println(vehicle);
    }
}
