package Models;

public class Client {
    private String Id;
    private String Name;
    private String dni;


    public Client(String id, String name, String dni) {
        Id = id;
        Name = name;
        this.dni = dni;
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
