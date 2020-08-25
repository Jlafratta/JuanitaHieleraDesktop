package models;

public class Vehicle {

    private int id;
    private String patent;
    private String model;
    private String brand;
    private Client client;


    public Vehicle(int id, String patent, String model, String brand, Client client) {
        this.id = id;
        this.patent = patent;
        this.model = model;
        this.brand = brand;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
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
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", patent='" + patent + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", client=" + client +
                '}';
    }
}
