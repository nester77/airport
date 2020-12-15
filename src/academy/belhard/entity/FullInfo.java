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

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(String boardNumber) {
        this.boardNumber = boardNumber;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getPilotCodeRank() {
        return pilotCodeRank;
    }

    public void setPilotCodeRank(String pilotCodeRank) {
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
