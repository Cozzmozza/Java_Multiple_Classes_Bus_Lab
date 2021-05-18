import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Bus bus;
    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Dundee", 2);
        busStop = new BusStop("Town");
        person = new Person();
    }

    @Test
    public void canGetSizeOfQueue(){
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
//    can we add a person to the queue
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.getQueueSize());
    }

}
