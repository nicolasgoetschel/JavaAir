import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Homer Simpson", "Captain", "742ET");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Homer Simpson", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void pilotHasPilotLicenceNumber() {
        assertEquals("742ET", pilot.getPilotLicenceNumber());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("I’m normally not a praying man, but if you’re up there, please save me Superman.", pilot.pilotCanFly());
    }
}



