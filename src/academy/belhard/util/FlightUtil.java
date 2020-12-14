package academy.belhard.util;

import academy.belhard.entity.Flights;


public class FlightUtil {
    public static Flights toObject(String line) {
        String[] pilotsArgs = line.split(";");


        int airplane_id = Integer.parseInt(pilotsArgs[0]);
        int pilot_id = Integer.parseInt(pilotsArgs[1]);
        String flight_date = pilotsArgs[2];
        String flight_time = pilotsArgs[3];
        String flight_number= pilotsArgs[4];

        return new Flights (airplane_id, pilot_id, flight_date, flight_time, flight_number);
    }

}
