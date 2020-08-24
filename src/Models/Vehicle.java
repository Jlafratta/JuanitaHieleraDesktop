package Models;

public class Vehicle {
            private int Id;
            private String patente;
            private String Nombre;
            private String Modelo;
            private String Marca;
            private Client cliente;



    public Vehicle(int id, String patente, String nombre, String modelo, String marca, Client cliente) {
        Id = id;
        this.patente = patente;
        Nombre = nombre;
        Modelo = modelo;
        Marca = marca;
        this.cliente = cliente;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "patente='" + patente + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }
}
