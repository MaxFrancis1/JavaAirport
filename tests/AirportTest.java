import org.junit.Test;

import static org.junit.Assert.*;

//TESTING DOC

public class AirportTest {

    @Test
    public void initiate() {
        Airport x = new Airport();
        assertEquals("confirmed", x.test());
    }

    @Test
    public void checkArrayStartsEmpty() {
        Airport x = new Airport();
        assertEquals(0, x.printPlanesArray(0));
    }

    @Test
    public void pushingAPlaneToTheArray() {
        Airport x = new Airport();
        assertEquals("Aircraft 29 has been added to the Airport", x.addPlane(29));
        assertEquals(29, x.printPlanesArray(0));
    }

    @Test
    public void takingOffInAPlane() {
        Airport x = new Airport();
        x.addPlane(20);
        assertEquals("Plane 20 has taken off!", x.takeOff(20));
        assertEquals(0, x.printPlanesArray(0));
    }

}
