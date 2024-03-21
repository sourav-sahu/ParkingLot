package Model;

import java.time.Duration;
import java.time.Instant;

public class ExitGate {
    public static int computeCost(Ticket ticket){
        Instant   end = Instant.now();
        long duration= Duration.between(ticket.getStartTime(), end).toSeconds();
        return (int) (duration);
    }
    public static void allowExit(Ticket ticket){
        switch (ticket.getType()){
            case FOUR_WHEELER -> {
                FourWheelerParkingSpotManager fourWheelerParkingSpotManager=EntranceGate.getFourWheelerParkingSpotManager();
                fourWheelerParkingSpotManager.removeParking(ticket.getParkingSpot());
            }
            case TWO_WHEELER -> {
                TwoWheelerParkingSpotManager twoWheelerParkingSpotManager=EntranceGate.getTwoWheelerParkingSpotManager();
                twoWheelerParkingSpotManager.removeParking(ticket.getParkingSpot());
            }
        }

    }

}
