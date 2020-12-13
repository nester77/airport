package academy.belhard.util;

import academy.belhard.entity.Flights;
import academy.belhard.entity.Pilots;
import academy.belhard.entity.Rank;

public class FlightUtil {
    public static Flights toObject(String line) {
        String[] pilotsArgs = line.split(";");

        int id = Integer.parseInt(pilotsArgs[0]);
        int airplane_id = Integer.parseInt(pilotsArgs[1]);
        int pilot_id = Integer.parseInt(pilotsArgs[2]);
        String flight_date = pilotsArgs[3];
        String flight_time = pilotsArgs[4];
        String flight_number= pilotsArgs[5];

        return new Flights (id, airplane_id, pilot_id, flight_date, flight_time, flight_number);
    }

}
