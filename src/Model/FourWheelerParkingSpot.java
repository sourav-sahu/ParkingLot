package Model;

public class FourWheelerParkingSpot implements ParkingSpot {
    int id;
    boolean isAvailable;
    Vehicle vehicle;

    public FourWheelerParkingSpot(int id, boolean isAvailable,Vehicle vehicle) {
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
        return 400;
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
