package TruckAndCar;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Driver {
    public static void main(String[] args) {
        // Take a Truck
        Truck t1 = new Truck(2000);
        t1.setSeatCapacity(2);

        // Create a weight
        Weight tree = new Tree();
        tree.setWeight(500);

        // Load weight (tree) on the truck
        t1.loadWeight(tree);

        Passenger p1 = new Passenger(60);
        Passenger p2 = new Passenger(50);
        List<Passenger> passengerList = new ArrayList<>();
        passengerList.add(p1);
        passengerList.add(p2);

        t1.loadPassenger(passengerList);

        if(t1.run()) {
            System.out.println("Truck running smooth!");
        } else {
            System.out.println("Cannot run, excessive load!!!");
        }

        Car c1 = new Car(500);
        c1.setSeatCapacity(5);
        c1.setMaxLoadCapacity(1000);
        c1.loadPassenger(passengerList);
        if(c1.run()) {
            System.out.println("Car running smooth!");
        } else {
            System.out.println("Car cannot run, excessive load!!!");
        }
    }
}