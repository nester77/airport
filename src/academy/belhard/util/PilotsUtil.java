package academy.belhard.util;

import academy.belhard.entity.Pilots;
import academy.belhard.entity.Rank;

public class PilotsUtil {
    public static Pilots toObject(String line) {
        String[] pilotsArgs = line.split(";");

        int id = Integer.parseInt(pilotsArgs[0]);
        String first_name = pilotsArgs[1];
        String last_name = pilotsArgs[2];
        Rank pilot_rank = Rank.valueOf(pilotsArgs[3]);
        String pilot_code= pilotsArgs[4];

        return new Pilots (id, first_name, last_name, pilot_rank, pilot_code);
    }
}
