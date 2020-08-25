package models;

public class Client {
    private String id;
    private String name;
    private String dni;
    private int state;


    public Client(String id, String name, String dni, int state) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", state=" + state +
                '}';
    }
}
