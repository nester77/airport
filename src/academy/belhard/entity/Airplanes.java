package academy.belhard.entity;

public class Airplanes {
    private int id;
    private String brand;
    private String model;
    private int passengerCapacity;
    private String boardNumber;
    ;

    public Airplanes (int id, String  brand, String model, int passengerCapacity, String boardNumber) {
        this.id = id;
        this. brand = brand;
        this.model= model;
        this.passengerCapacity= passengerCapacity;
        this.boardNumber= boardNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this. brand= brand;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this. model= model;
    }

    public int getPassengerCapacity () {
        return passengerCapacity;
    }

    public void setPassengerCapacity (int passengerCapacity ) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getBoardNumber () {
        return boardNumber;
    }

    public void setBoardNumber (String boardNumber) {
        this. boardNumber = boardNumber;
    }

    @Override
    public String toString() {
        return " Airplanes {" +
                "id=" + id +
                ", brand ='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ",  capacity='" + passengerCapacity + '\'' +
                ", number ='" + boardNumber + '\'' +
                '}';
    }

}
