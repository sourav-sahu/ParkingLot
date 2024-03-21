import Model.EntranceGate;
import Model.ExitGate;
import Model.Vehicle;
import Model.VehicleType;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vehicle vehicle1=new Vehicle(100, VehicleType.FOUR_WHEELER);
        Vehicle vehicle2=new Vehicle(100, VehicleType.FOUR_WHEELER);
        Vehicle vehicle3=new Vehicle(100, VehicleType.FOUR_WHEELER);
        Vehicle vehicle4=new Vehicle(100, VehicleType.FOUR_WHEELER);
        Vehicle vehicle5=new Vehicle(100, VehicleType.TWO_WHEELER);
        Vehicle vehicle6=new Vehicle(100, VehicleType.TWO_WHEELER);
        Vehicle vehicle7=new Vehicle(100, VehicleType.TWO_WHEELER);
        Vehicle vehicle8=new Vehicle(100, VehicleType.TWO_WHEELER);
        EntranceGate.issueTicket(vehicle1);
        System.out.println("parking no for vehicle1 = "+vehicle1.getTicket().getParkingSpot().getId());
        EntranceGate.issueTicket(vehicle2);
        System.out.println("parking no for vehicle2 = "+vehicle2.getTicket().getParkingSpot().getId());

        EntranceGate.issueTicket(vehicle3);
        System.out.println("parking no for vehicle3 = "+vehicle3.getTicket().getParkingSpot().getId());

        Thread.sleep(5000);
        System.out.println("parking charge for vehicle1 = "+ExitGate.computeCost(vehicle1.getTicket()));
        ExitGate.allowExit(vehicle1.getTicket());
        Thread.sleep(5000);
        System.out.println("parking charge for vehicle2 = "+ExitGate.computeCost(vehicle2.getTicket()));
        ExitGate.allowExit(vehicle2.getTicket());
        EntranceGate.issueTicket(vehicle4);
        System.out.println("parking no for vehicle4 = "+vehicle4.getTicket().getParkingSpot().getId());


    }
}