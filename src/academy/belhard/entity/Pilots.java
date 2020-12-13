package academy.belhard.entity;

public class Pilots {

    private int id;
    private String first_name;
    private String last_name;
    private Rank pilot_rank;
    private String pilot_code;
    ;

    public Pilots (int id, String first_name, String last_name, Rank pilot_rank, String pilot_code) {
        this.id = id;
        this.first_name= first_name;
        this.last_name= last_name;
        this.pilot_rank= pilot_rank;
        this.pilot_code= pilot_code;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName () {
        return first_name;
    }

    public void setFirstName (String first_name) {
        this. first_name= first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName (String last_name) {
        this. last_name= last_name;
    }

    public Rank getPilotRank () {
        return pilot_rank;
    }

    public void setPilotRank (Rank pilot_rank ) {
        this. pilot_rank = pilot_rank;
    }

    public String getPilotCode () {
        return pilot_code;
    }

    public void setPilotCode (String pilot_code) {
        this. pilot_code = pilot_code;
    }

    @Override
    public String toString() {
        return " Pilots {" +
                "id=" + id +
                ", first name ='" + first_name + '\'' +
                ", last name ='" + last_name + '\'' +
                ", rank ='" + pilot_rank + '\'' +
                ", code ='" + pilot_code + '\'' +
                '}';
    }

}
