package academy.belhard.util;

import academy.belhard.entity.Airplanes;

public class AirplanesUtil {
    public static Airplanes toObject(String line) {
        String[] airplanesArgs = line.split(";");

        String brand = airplanesArgs[0];
        String model = airplanesArgs[1];
        int passengerCapacity = Integer.parseInt(airplanesArgs[2]);
        String boardNumber = airplanesArgs[3];

        return new Airplanes(brand, model, passengerCapacity, boardNumber);
    }

}
