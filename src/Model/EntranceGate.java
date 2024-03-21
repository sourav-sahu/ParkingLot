package Model;

import java.util.Optional;

public class EntranceGate {

    private final static TwoWheelerParkingSpotManager twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager();
    private final static FourWheelerParkingSpotManager fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager();
    public static void issueTicket(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case TWO_WHEELER -> {
                Optional<ParkingSpot> optionalParkingSpot = twoWheelerParkingSpotManager.findParking(vehicle);
                if (optionalParkingSpot.isEmpty()) {
                    System.out.println("TWO_WHEELER Parking is Full");
                } else {

                    Ticket ticket = new Ticket(VehicleType.TWO_WHEELER, optionalParkingSpot.get());
                    vehicle.setTicket(ticket);
                }

            }
            case FOUR_WHEELER -> {
                Optional<ParkingSpot> optionalParkingSpot = fourWheelerParkingSpotManager.findParking(vehicle);
                if (optionalParkingSpot.isEmpty()) {
                    System.out.println("FOUR_WHEELER Parking is Full");
                } else {

                    Ticket ticket = new Ticket(VehicleType.FOUR_WHEELER, optionalParkingSpot.get());
                    vehicle.setTicket(ticket);;
                }

            }


        }
    }
    public static TwoWheelerParkingSpotManager getTwoWheelerParkingSpotManager(){
        return twoWheelerParkingSpotManager;
    }
    public static FourWheelerParkingSpotManager getFourWheelerParkingSpotManager(){
        return fourWheelerParkingSpotManager;
    }
}
