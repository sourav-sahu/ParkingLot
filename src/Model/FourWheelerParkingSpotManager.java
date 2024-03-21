package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FourWheelerParkingSpotManager implements ParkingSpotManager{
    List<FourWheelerParkingSpot> parkingSpotList = new ArrayList<>(100);
    public FourWheelerParkingSpotManager(){
        for(int i=0;i<100;i++){
            parkingSpotList.add(new FourWheelerParkingSpot(i,true,null));
        }
    }
    @Override
    public Optional<ParkingSpot> findParking(Vehicle vehicle) {
        for(ParkingSpot spot:parkingSpotList){
            if(spot.isAvailable()){
                spot.setAvailable(false);
                spot.setVehicle(vehicle);
                return Optional.of(spot);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean removeParking(ParkingSpot parkingSpot) {
        int id = parkingSpot.getId();
        if(Objects.nonNull(parkingSpotList.get(id)))
            parkingSpotList.get(id).setAvailable(true);
        else
            return false;
        return true;
    }
}
