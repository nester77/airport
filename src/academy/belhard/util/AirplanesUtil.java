package academy.belhard.util;

import academy.belhard.entity.Airplanes;

public class AirplanesUtil {
    public static Airplanes toObject(String line) {
        String[] airplanesArgs = line.split(";");

        int id = Integer.parseInt(airplanesArgs[0]);
        String brand = airplanesArgs[1];
        String model = airplanesArgs[2];
        int passengerCapacity = Integer.parseInt(airplanesArgs[3]);
        String boardNumber = airplanesArgs[4];

        return new Airplanes(id, brand, model, passengerCapacity, boardNumber);
    }

}
