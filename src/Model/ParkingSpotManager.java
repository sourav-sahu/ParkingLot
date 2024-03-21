package Model;

import java.util.Optional;

public interface ParkingSpotManager {
    public Optional<ParkingSpot> findParking(Vehicle vehicle);
    public boolean removeParking(ParkingSpot parkingSpot);

}
