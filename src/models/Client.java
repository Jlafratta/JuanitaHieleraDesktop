package models;

import java.util.ArrayList;
import java.util.List;

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
