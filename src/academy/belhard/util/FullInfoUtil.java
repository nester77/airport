package academy.belhard.util;

import academy.belhard.entity.FullInfo;

public class FullInfoUtil {

    public static String formatForWriting (FullInfo fullInfo){
        return fullInfo.getFlightNumber() + ";"
                + fullInfo.getFlightDate() + ";"
                + fullInfo.getFlightTime() + ";"
                + fullInfo.getBoardNumber() + ";"
                + fullInfo.getAirplane() + ";"
                + fullInfo.getPassengerCapacity() + ";"
                + fullInfo.getPilotName() + ";"
                + fullInfo.getPilotCodeRank() + "\n";
    }
}
