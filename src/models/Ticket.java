package models;

import java.util.Objects;

public class Ticket {
    private int id;
    private String idCompound;
    private String date;
    private String time;
    private float neto;
    private float totalPrice;
    private Client client;
    private Product product;
    private Vehicle vehicle;

    public Ticket(int id, String date, String time, float neto, Client client, Product product, Vehicle vehicle) {
        this.id = id;
        this.idCompound = "E-"+this.id;
        this.date = date;
        this.time = time;
        this.neto = neto;
        this.client = client;
        this.product = product;
        this.vehicle = vehicle;
        this.totalPrice = (this.product.getPrice())*(this.neto);
    }

    public Ticket(String date, String time, float neto, Client client, Product product, Vehicle vehicle) {
        this.date = date;
        this.time = time;
        this.neto = neto;
        this.client = client;
        this.product = product;
        this.vehicle = vehicle;
        this.totalPrice = (this.product.getPrice())*(this.neto);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        setIdCompound("E-"+id);
    }

    public String getIdCompound() {
        return idCompound;
    }

    public void setIdCompound(String idCompound) {
        this.idCompound = idCompound;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getNeto() {
        return neto;
    }

    public void setNeto(float neto) {
        this.neto = neto;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return getId() == ticket.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", idCompound='" + idCompound + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", neto=" + neto +
                ", TotalPrice=" + totalPrice +
                ", client=" + client +
                ", product=" + product +
                ", vehicle=" + vehicle +
                '}';
    }
}
