import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Dundee", 2);
        person = new Person();
        busStop = new BusStop("Town");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(0, bus.getNumPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getNumPassengers());
    }

    @Test
    public void cannotAddPassengerIfCapacityMax(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.getNumPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getNumPassengers());
    }

    @Test
    public void canPickUp(){
        busStop.addPersonToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.getNumPassengers());
        assertEquals(0, busStop.getQueueSize());
    }
}
