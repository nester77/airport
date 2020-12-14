package academy.belhard.entity;

public class Flights {
    private int id;
    private int airplane_id;
    private int pilot_id;
    private String flight_date;
    private String flight_time;
    private String flight_number;

    public Flights(int id, int airplane_id, int pilot_id, String flight_date, String flight_time, String flight_number) {
        this.id = id;
        this.airplane_id = airplane_id;
        this.pilot_id = pilot_id;
        this.flight_date = flight_date;
        this.flight_time = flight_time;
        this.flight_number = flight_number;
    }

    public Flights(int airplane_id, int pilot_id, String flight_date, String flight_time, String flight_number) {
        this.airplane_id = airplane_id;
        this.pilot_id = pilot_id;
        this.flight_date = flight_date;
        this.flight_time = flight_time;
        this.flight_number = flight_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAirplane_id() {
        return airplane_id;
    }

    public void setAirplane_id(int airplane_id) {
        this.airplane_id = airplane_id;
    }

    public int getPilot_id() {
        return pilot_id;
    }

    public void setPilot_id(int pilot_id) {
        this.pilot_id = pilot_id;
    }

    public String getFlight_date() {
        return flight_date;
    }

    public void setFlight_date(String flight_date) {
        this.flight_date = flight_date;
    }

    public String getFlight_time() {
        return flight_time;
    }

    public void setFlight_time(String flight_time) {
        this.flight_time = flight_time;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", airplane_id=" + airplane_id +
                ", pilot_id=" + pilot_id +
                ", flight_date='" + flight_date + '\'' +
                ", flight_time='" + flight_time + '\'' +
                ", flight_number='" + flight_number + '\'' +
                '}';
    }
}
