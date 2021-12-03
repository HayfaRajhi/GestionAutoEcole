package entities;

import org.json.simple.JSONObject;

public class Candidate {

    private int numCIN;
    private String name;
    private String prename;
    private String licenseCategory;
    private Seance[] seances;

    public Candidate(int numCIN, String licenseCategory, String name, String prename) {
        super();
        this.numCIN = numCIN;
        this.licenseCategory = licenseCategory;
        this.name = name;
        this.prename = prename;
    }

    public Seance[] getSeances() {
        return seances;
    }

    public void setSeances(Seance[] seances) {
        this.seances = seances;
    }

    public int getNumCIN() {
        return numCIN;
    }

    public void setNumCIN(int numCIN) {
        this.numCIN = numCIN;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public JSONObject toJSON(){
        JSONObject c = new JSONObject();
        c.put("numCIN", this.numCIN);
        c.put("name", this.name);
        c.put("prename", this.prename);
        c.put("licenseCategory", this.licenseCategory);
        return c;
    }
}