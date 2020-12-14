package academy.belhard.entity;

public class FullInfo {
    private String flightNumber;
    private String flightDate;
    private String flightTime;
    private String boardNumber;
    private String airplane;
    private int passengerCapacity;
    private String pilotName;
    private String pilotCodeRank;

    public FullInfo(String flightNumber, String flightDate, String flightTime, String boardNumber, String airplane, int passengerCapacity, String pilotName, String pilotCodeRank) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.boardNumber = boardNumber;
        this.airplane = airplane;
        this.passengerCapacity = passengerCapacity;
        this.pilotName = pilotName;
        this.pilotCodeRank = pilotCodeRank;
    }

    @Override
    public String toString() {
        return "FullInfo{" +
                "flightNumber='" + flightNumber + '\'' +
                ", flightDate='" + flightDate + '\'' +
                ", flightTime='" + flightTime + '\'' +
                ", boardNumber='" + boardNumber + '\'' +
                ", airplane='" + airplane + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", pilotName='" + pilotName + '\'' +
                ", pilotCodeRank='" + pilotCodeRank + '\'' +
                '}';
    }
}
