package academy.belhard.util;

import academy.belhard.entity.Pilots;
import academy.belhard.entity.Rank;

public class PilotsUtil {
    public static Pilots toObject(String line) {
        String[] pilotsArgs = line.split(";");

        String first_name = pilotsArgs[0];
        String last_name = pilotsArgs[1];
        Rank pilot_rank = Rank.valueOf(pilotsArgs[2]);
        String pilot_code= pilotsArgs[3];

        return new Pilots (first_name, last_name, pilot_rank, pilot_code);
    }
}
