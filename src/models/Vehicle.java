package models;

public class Vehicle {

    private int id;
    private String patent;
    private String description;
    private float tara;
    private String client;  // id - nombre

    public Vehicle(int id, String patent, String description, float tara, String client) {
        this.id = id;
        this.patent = patent;
        this.description = description;
        this.tara = tara;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getModel() {
        return description;
    }

    public void setModel(String model) {
        this.description = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTara() {
        return tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return patent;
    }
}
