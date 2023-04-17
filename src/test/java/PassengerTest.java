import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Barney Gumble", 4);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Barney Gumble", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags() {
        assertEquals(4, passenger.getNumOfBags());
    }
}