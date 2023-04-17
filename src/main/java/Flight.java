import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getNumberOfPilots() {
        return pilots.size();
    }

    public int getNumberOfCabinCrew() {
        return cabinCrewMembers.size();
    }

    public int getPassengers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getFlightDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getNumberOfAvailableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public String addPassenger(Passenger passenger) {
        if (getNumberOfAvailableSeats() > 0){
            passengers.add(passenger);
        }
        return "My Brother Is Using Worms.";

    }

    public String pilotCanFly() {
        return this.pilots.get(0).pilotCanFly();

    }
}