package TruckAndCar;

import java.util.List;

public class Car extends Vehicle {
    private int seatCapacity;
    private double totalLoad;

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    void setSeatCapacity(int seatCapacity) {
        if(seatCapacity > 5) {
            System.out.println("Seat capacity cannot be more than 5.");
            this.seatCapacity = 5;
        } else {
            this.seatCapacity = seatCapacity;
        }
    }

    public Car(double maxLoadCapacity) {
        this.setSeatCapacity(5);
        this.setMaxLoadCapacity(maxLoadCapacity);
    }

    @Override
    void loadPassenger(List<Passenger> passengers) {
        double w = 0;
        for(Passenger p : passengers) {
            try {
                w += p.getWeight();
            } catch (Exception e) {
                System.out.println("One or more passenger object is null.!!");
            }
        }
        this.totalLoad = this.totalLoad + w;
    }

    @Override
    double getTotalLoad() {
        return this.totalLoad;
    }

    @Override
    void setTotalLoad(double totalLoad) {
        this.totalLoad = totalLoad;
    }

    @Override
    boolean run() {
        // Check if the total load is within the capacity
        return !(this.getTotalLoad() > this.getMaxLoadCapacity());
    }
}
