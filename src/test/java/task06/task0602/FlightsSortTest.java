package task06.task0602;

import org.junit.Before;
import org.junit.Test;
import task06.task0602.entity.Flight;
import static org.junit.Assert.*;

public class FlightsSortTest {
    Flight[] flightsPattern = new Flight[3];
    Flight[] flightsTest = new Flight[3];
    Flight f1 = new Flight(null, null, null, "Amsterdam", "12:00", "TUESDAY");
    Flight f2 = new Flight(null, null, null, "Boston", "10:00", "WEDNESDAY");
    Flight f3 = new Flight(null, null, null, "Kyiv", "11:30", "MONDAY");

    @Before
    public void setUp() throws Exception {
        flightsTest = new Flight[]{f1, f2, f3};
    }

    @Test
    public void testSortFlightsByTime() throws Exception {
        flightsPattern = new Flight[]{f2, f3, f1};
        assertArrayEquals(flightsPattern, FlightsSort.sortFlightsByTime(flightsTest));
    }

    @Test
    public void testSortFlightsByDestination() throws Exception {
        flightsPattern = new Flight[]{f1, f2, f3};
        assertArrayEquals(flightsPattern, FlightsSort.sortFlightsByDestination(flightsTest));
    }

    @Test
    public void testSortFlightsByDayOfFlight() throws Exception {
        flightsPattern = new Flight[]{f3, f1, f2};
        assertArrayEquals(flightsPattern, FlightsSort.sortFlightsByDayOfFlight(flightsTest));
    }

}