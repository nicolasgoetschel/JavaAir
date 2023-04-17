import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Bart Simpson", "Flight Attendant");
    }

    @Test
    public void cabinCrewMemberHasName() {
        assertEquals("Bart Simpson", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank() {
        assertEquals("Flight Attendant", cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberCanRelayMessageToPassengers() {
        assertEquals("My Brother Is Using Worms.", cabinCrewMember.relayMessage());
    }
}

