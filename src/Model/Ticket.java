package Model;

import java.time.Instant;

public class Ticket {
    private long ticketId;
    private Instant startTime;
    private VehicleType type;
    private ParkingSpot spot;
    private  static long id=0;

    public long getTicketId() {
        return ticketId;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public VehicleType getType() {
        return type;
    }

    public  ParkingSpot getParkingSpot() {
        return  spot;
    }

    public Ticket( VehicleType type, ParkingSpot spot) {
        this.ticketId = id++;
        this.startTime = Instant.now();
        this.type = type;
        this.spot=spot;
    }
}
