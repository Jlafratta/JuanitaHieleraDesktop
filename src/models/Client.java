package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private int id = 1;
    private static int idCont = 0;
    private String name;
    private String cuit;
    private int state;
    private List<Vehicle> vehicles;
    private int phoneNumber;
    private String direction;
    private Locality locality;


    public Client(int id, String name, String cuit, int state) {
        this.id = id;
        this.name = name;
        this.cuit = cuit;
        this.state = state;
        this.vehicles = new ArrayList<>();
    }

    public Client(int id, String name, String cuit, int state, int phoneNumber, String direction, Locality locality) {
        this.id = id;
        this.name = name;
        this.cuit = cuit;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.direction = direction;
        this.locality = locality;
    }


    ///Por ahi vuela este contructor
    public Client(int id, String name, String cuit, int state, List<Vehicle> vehicles) {
        this.id = id;
        this.name = name;
        this.cuit = cuit;
        this.state = state;
        this.vehicles = vehicles;
    }

    public Client(int id, String name, String cuit, int state, List<Vehicle> vehicles, int phoneNumber, String direction, Locality locality) {
        this.id = id;
        this.name = name;
        this.cuit = cuit;
        this.state = state;
        this.vehicles = vehicles;
        this.phoneNumber = phoneNumber;
        this.direction = direction;
        this.locality = locality;
    }

    private static int getIdCont(){
        return idCont++;
    }

    private static void changeId(int id){
        idCont = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getId() == client.getId() &&
                Objects.equals(getName(), client.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
