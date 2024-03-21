package Model;

public class Vehicle {
    int registrationNo;
    VehicleType type;
    Ticket ticket;

    public Vehicle(int registrationNo, VehicleType type) {
        this.registrationNo = registrationNo;
        this.type = type;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getRegistrationNo() {
        return registrationNo;
    }

    public VehicleType getType() {
        return type;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
