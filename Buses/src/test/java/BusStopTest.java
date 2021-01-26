import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Edinburgh");
    }

    @Test
    public void checkCanAddPassengerToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.checkQueueCount());
    }
}
