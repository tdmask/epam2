package task06.task0602;

import task06.task0602.database.Database;
import task06.task0602.entity.Flight;

import java.util.Arrays;
import java.util.Comparator;

public class FlightsSort {

    public static Flight[] sortFlightsByTime(Flight[] flights) {
        Arrays.sort(flights, new Comparator<Flight>() {
            @Override
            public int compare(Flight o1, Flight o2) {
                String time1 = o1.getTime();
                String time2 = o2.getTime();
                return time1.compareTo(time2);
            }
        } );
        return flights;
    }

    public static Flight[] sortFlightsByDestination(Flight[] flights){
        Arrays.sort(flights, new Comparator<Flight>() {
            @Override
            public int compare(Flight o1, Flight o2) {
                String destination1 = o1.getDestination();
                String destination2 = o2.getDestination();
                return destination1.compareTo(destination2);
            }
        });
        return flights;
    }

    public static Flight[] sortFlightsByDayOfFlight(Flight[] flights){

        Arrays.sort(flights, new Comparator<Flight>() {
            @Override
            public int compare(Flight o1, Flight o2) {
                String day1 = o1.getDayOfFlight();
                String day2 = o2.getDayOfFlight();

                int indexDay1 = 0;
                int indexDay2 = 0;
                for (int i = 0; i < Database.dayOfWeek.length; i++) {
                    if (day1.equals(Database.dayOfWeek[i])) {
                        indexDay1 = i;
                    }
                    if (day2.equals(Database.dayOfWeek[i])) {
                        indexDay2 = i;
                    }
                }

                if (indexDay1 > indexDay2) return 1;
                if (indexDay1 < indexDay2) return -1;
                return 0;
            }
        });
        return flights;
    }
}
