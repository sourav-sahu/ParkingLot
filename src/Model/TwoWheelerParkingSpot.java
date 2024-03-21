package Model;

public class TwoWheelerParkingSpot implements ParkingSpot {
    int id;
    boolean isAvailable;
    Vehicle vehicle;

    public TwoWheelerParkingSpot(int id, boolean isAvailable,Vehicle vehicle) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.vehicle=vehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public int getRate(){
        return 200;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
