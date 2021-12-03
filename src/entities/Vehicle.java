package entities;

public class Vehicle {
    private int registrationNumber;
    private String dateOfCommissioning;
    private int totalKm;
    private String type;
    private int numOfKmLeft;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setDateOfCommissioning(String dateOfCommissioning) {
        this.dateOfCommissioning = dateOfCommissioning;
    }

    public void setTotalMileage(int totalMileage) {
        this.totalKm = totalMileage;
    }

    public void setNumOfKmLeft(int numOfKmLeft) {
        this.numOfKmLeft = numOfKmLeft;
    }

    public String getDateOfCommissioning() {
        return dateOfCommissioning;
    }

    public int getTotalMileage() {
        return totalKm;
    }

    public int getNumOfKmLeft() {
        return numOfKmLeft;
    }



    public Vehicle(int registrationNumber, String dateOfCommissioning, int totalKm, String type, int numOfKmLeft) {
        this.registrationNumber = registrationNumber;
        this.dateOfCommissioning = dateOfCommissioning;
        this.totalKm = totalKm;
        this.type = type;
        this.numOfKmLeft = numOfKmLeft;
    }
}
