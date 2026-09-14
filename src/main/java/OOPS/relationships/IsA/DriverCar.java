package OOPS.relationships.IsA;

public class DriverCar {
    public static void main(String[] args) {
        // in is a relation ship car can access vehicle proprties directly

        Car car = new Car();

        car.color = "red";
        car.name = "audi";
        car.speed = 1000;


        car.display();

    }
}
