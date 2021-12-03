package entities;

public class Seance {
    public int num;
    public String date;
    public String heure;
    public String type;
    public float price;
    public boolean paid;
    public Engineer engineer;
    public Candidate condidate;
    public Vehicle vehicle = null;


    // pour seance conduit
    public Seance(int num, String date, String heure, boolean paid, Engineer engineer, Candidate condidate, Vehicle vehicle) {
        this.num = num;
        this.date = date;
        this.heure = heure;
        this.type = "conduit";
        switch(condidate.getLicenseCategory()){
            case "A" -> this.price = (float) 15.6;
            case "B" -> this.price = (float) 15.9;
            case "C" -> this.price = (float) 16.2;
            default -> this.price = 15;
        }
        this.paid = paid;
        this.engineer = engineer;
        this.condidate = condidate;
        this.vehicle = vehicle;
    }

    // pour seance code
    public Seance(int num, String date, String heure, boolean paid, Engineer engineer, Candidate condidate) {
        this.num = num;
        this.date = date;
        this.heure = heure;
        this.type = "code";
        switch(condidate.getLicenseCategory()){
            case "A" -> this.price = (float) 15.3;
            case "B" -> this.price = (float) 15.45;
            case "C" -> this.price = (float) 15.75;
            default -> this.price = 15;
        }
        this.paid = paid;
        this.engineer = engineer;
        this.condidate = condidate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public Candidate getCondidate() {
        return condidate;
    }

    public void setCondidate(Candidate condidate) {
        this.condidate = condidate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
