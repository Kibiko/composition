import products.Product;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Engine;
import vehicles.IVehicle;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class Runner {

    public static void main(String[] args) {

        ArrayList<IVehicle> vehicles = new ArrayList<>();

        Bicycle bicycle = new Bicycle(10,
                20,
                new Product(350,6,"BMX"));

        vehicles.add(bicycle);

        System.out.println("Bicycle has "+ bicycle.getWheelCount() + " wheels.");
        System.out.println("Bicycle has max speed of " + bicycle.getMaxSpeed() + "mph.");
        System.out.println("Price of the bicycle is £" + bicycle.getPrice());

        Car car = new Car(1000,
                200,
                new Product(2000,21,"Aygo"),
                new Engine(200,400));

        vehicles.add(car);

        System.out.println("Car Price: " + car.getPrice());
        System.out.println("Car Fuel: " + car.getFuel());
    }
}
