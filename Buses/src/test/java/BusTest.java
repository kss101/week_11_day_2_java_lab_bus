import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 5);
        person = new Person();
    }

    @Test
    public void checkBusStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantAddPassengerBusFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals("Bus full!", bus.addPassenger(person));
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void canKickPassengerOffBus(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.kickPassengerOff();
        assertEquals(1, bus.passengerCount());
    }

}
