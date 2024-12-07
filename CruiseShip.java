import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class CruiseShip {
    private String shipName;
    private int passengerCap;
    private ArrayList<Destination> itinerary = new ArrayList<>();
    private ArrayList<Passenger> passengerNames = new ArrayList<>();

    public CruiseShip(String shipName, int passengerCap){
        this.shipName = shipName;
        this.passengerCap = passengerCap;
    }

    //methods

    public void addDestination(Destination destination){
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger){
        if (passengerNames.size()<passengerCap){
            passengerNames.add(passenger);
        } else{
            System.out.println("Sorry, " + shipName + "has reached its maximum capacity.");
        }
    }

    public void printItinerary() {
        System.out.println("Itinerary for " + shipName);
        for (Destination destination : itinerary) { //enhanced for loop: provides direct access to each element
            System.out.println("Destination: " + destination.getDestName());
            for (Activity j : destination.getActivities()){
                System.out.println("              Activity: " + j);
            }
        }
    }

    public void printShipDetails(){
        System.out.println("Ship Name: " + shipName);
        System.out.println("Passenger Capacity: " + passengerCap);
        System.out.println("No. of Passengers right now: " + passengerNames.size());
        System.out.println("Passenger Names: ");
        for (Passenger p : passengerNames){
            System.out.println("- " + p);
        }
    }

    public void printDetails(){
        System.out.println();
    }
    //getter and setter methods

    //ship name
    public String getShipName() {
        return shipName;
    }
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    //itinerary
    public ArrayList<Destination> getItinerary() {
        return itinerary;
    }

    public void setItinerary(ArrayList<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    //passengerCap
    public int getPassengerCap() {
        return passengerCap;
    }

    public void setPassengerCap(int passengerCap) {
        this.passengerCap = passengerCap;
    }

    //passengerNames
    public ArrayList<Passenger> getPassengerNames() {
        return passengerNames;
    }

    public void setPassengerNames(ArrayList<Passenger> passengerNames) {
        this.passengerNames = passengerNames;
    }

}
