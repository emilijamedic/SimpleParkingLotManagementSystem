import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int nFloors=4;
        //int nSlotsPerFloor=6;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of floors of your garage: ");
        int nFloors = in.nextInt();
        System.out.println("Enter number of slots per floor of your garage: ");
        int nSlotsPerFloor= in.nextInt();
        ParkingLot parkingLot = new ParkingLot("PR1234", nFloors, nSlotsPerFloor);

        parkingLot.getNoOfOpenSlots("car");

        String ticket1 = parkingLot.parkVehicle("car", "MH-03", "red");
        String ticket2 = parkingLot.parkVehicle("car", "MH-04", "purple");
        System.out.println("Occupied slots: ");
        parkingLot.displayOccupiedSlots("car");
        parkingLot.unPark(ticket2);
        //System.out.println("Occupied slots: ");
        parkingLot.displayOccupiedSlots("car");
        System.out.println("Parking vehicles: ");
        parkingLot.displayOpenSlots("truck");
        parkingLot.parkVehicle("truck", "MH-01", "black");
        System.out.println("Occupied slots: ");
        parkingLot.displayOccupiedSlots("truck");
        parkingLot.displayOccupiedSlots("car");
    }
}