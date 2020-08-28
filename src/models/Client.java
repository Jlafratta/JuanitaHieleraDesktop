package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private int id = 1;
    private static int idCont = 0;
    private String name;
    private String dni;
    private int state;
    private List<Vehicle> vehicles;


    public Client(int id, String name, String dni, int state) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.state = state;
        this.vehicles = new ArrayList<>();
    }

    public Client(int id, String name, String dni, int state, List<Vehicle> vehicles) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.state = state;
        this.vehicles = vehicles;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
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
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", state=" + state +
                ",\n vehicles=" + vehicles +
                "}\n";
    }
}
