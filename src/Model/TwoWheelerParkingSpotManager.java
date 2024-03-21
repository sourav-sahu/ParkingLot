package Model;

import java.util.*;

public class TwoWheelerParkingSpotManager implements ParkingSpotManager{
    List<TwoWheelerParkingSpot> parkingSpotList = new ArrayList<>(50);

    public TwoWheelerParkingSpotManager() {
        for(int i=0;i<50;i++){
            this.parkingSpotList.add(new TwoWheelerParkingSpot(i,true,null));
        }
    }

    @Override
    public Optional<ParkingSpot> findParking(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.isAvailable()) {
                parkingSpot.setAvailable(false);
                parkingSpot.setVehicle(vehicle);
                return Optional.of(parkingSpot);
            }

        }
        return Optional.empty();
    }



    @Override
    public boolean removeParking(ParkingSpot spot) {
        int id = spot.getId();
        if(Objects.nonNull(parkingSpotList.get(id)))
            parkingSpotList.get(id).setAvailable(true);
        else
            return false;
        return true;
    }
}
