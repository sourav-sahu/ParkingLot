package Model;

public interface ParkingSpot {
    public int getRate();
    public boolean isAvailable();
    public void setAvailable(boolean isAvailable);
    public int getId();
    public Vehicle getVehicle();
    public void setVehicle(Vehicle vehicle);
}
