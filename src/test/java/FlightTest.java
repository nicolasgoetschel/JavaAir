import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    ArrayList<Pilot> pilots;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    ArrayList<Passenger> passengers;
    Plane plane;

    @Before
    public void before() {
        pilots = new ArrayList<>();
        pilots.add(new Pilot("Homer Simpson", "Captain", "742ET"));
        pilots.add(new Pilot("Ned Flanders", "Co-Pilot", "744ET"));

        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(new CabinCrewMember("Bart Simpson", "Flight Attendant"));
        cabinCrewMembers.add(new CabinCrewMember("Lisa Simpson", "First Officer"));
        cabinCrewMembers.add(new CabinCrewMember("Maggie Simpson", "Flight Attendant"));

        passengers = new ArrayList<>();
        plane = new Plane(PlaneType.AIRBUSA320);


        flight = new Flight(pilots, cabinCrewMembers, passengers, plane, "FR1234", "SPR", "SHE", "15:30"  );
    }

    @Test
    public void flightHasAtLeastOnePilot() {
        assertEquals(2, flight.getNumberOfPilots());
    }

    @Test
    public void flightHasAListOfCabinCrewMembers() {
        assertEquals(3, flight.getNumberOfCabinCrew());
    }

    @Test
    public void flightStartsWithAnEmptyListOfPassengers() {
        assertEquals(0, flight.getPassengers());
    }

    @Test
    public void flightHasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("FR1234", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("SPR", flight.getFlightDestination());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("SHE", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("15:30", flight.getDepartureTime());
    }

    @Test
    public void flightCanReturnNumberOfAvailableSeats() {
        assertEquals(5, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void flightCanBookPassengerIfSeatsAvailable() {
        flight.addPassenger(new Passenger("Barney Gumble", 2));
        assertEquals(1, flight.getPassengers());
    }

    @Test
    public void flightCannotBookPassengerIfNoSeatsAvailable() {
        flight.addPassenger(new Passenger("Barney Gumble", 2));
        flight.addPassenger(new Passenger("Moe Szyslak", 2));
        flight.addPassenger(new Passenger("Carl Carlson", 2));
        flight.addPassenger(new Passenger("Lenny Leonard", 2));
        flight.addPassenger(new Passenger("Barry Huffman", 2));
        flight.addPassenger(new Passenger("Kirk Van Houten", 2));
        assertEquals(5, flight.getPassengers());
    }

    @Test
    public void pilotShouldBeAbleToFlyThePlane() {
        assertEquals("I’m normally not a praying man, but if you’re up there, please save me Superman.", flight.pilotCanFly());
    }

    @Test
    public void cabinCrewMemberShouldBeAbleToRelayMessage() {
        assertEquals("My Brother Is Using Worms.", cabinCrewMembers.get(0).relayMessage());
    }
}
