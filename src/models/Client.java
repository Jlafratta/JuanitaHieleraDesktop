package models;

public class Client {
    private String Id;
    private String Name;
    private String dni;
    private int state;


    public Client(String id, String name, String dni, int state) {
        Id = id;
        Name = name;
        this.dni = dni;
        this.state = state;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
