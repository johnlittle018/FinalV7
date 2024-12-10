package TruckAndCar;

import java.util.List;

public class Truck extends Vehicle {
    private int seatCapacity;
    private double totalLoad;

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    void setSeatCapacity(int seatCapacity) {
        if(seatCapacity > 2) {
            // Throw exception
            System.out.println("Seat capacity is maximum 2");
            this.seatCapacity = 2;
        } else {
            this.seatCapacity = seatCapacity;
        }
    }

    public Truck(double maxLoadCapacity) {
        this.setSeatCapacity(2);
        this.setMaxLoadCapacity(maxLoadCapacity);
        this.setTotalLoad(0);
    }

    void loadWeight(Weight weight) {
        this.setTotalLoad(this.getTotalLoad() + weight.getWeight());
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
