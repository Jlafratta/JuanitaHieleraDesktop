package models;

import java.util.Objects;

public class Ticket {
    private int id;
    private String idCompound;
    private String date;
    private float bruto;
    private float tara;
    private float neto;
    private float totalPrice;
    private Client client;
    private Product product;
    private Vehicle vehicle;

    public Ticket(int id, String date, float bruto, float tara, Client client, Product product, Vehicle vehicle) {  // a borrar
        this.id = id;
        this.idCompound = "E-"+this.id;
        this.date = date;
        this.bruto = bruto;
        this.tara = tara;
        this.neto = this.bruto-this.tara;
        this.client = client;
        this.product = product;
        this.vehicle = vehicle;
        this.totalPrice = (this.product.getPrice())*(this.neto);
    }

    public Ticket(String date, float bruto, float tara, Client client, Product product, Vehicle vehicle) {
        this.date = date;
        this.bruto = bruto;
        this.tara = tara;
        this.neto = this.bruto-this.tara;
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

    public float getBruto() {
        return bruto;
    }

    public void setBruto(float bruto) {
        this.bruto = bruto;
    }

    public float getTara() {
        return tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
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
                ", neto=" + neto +
                ", TotalPrice=" + totalPrice +
                ", client=" + client +
                ", product=" + product +
                ", vehicle=" + vehicle +
                '}';
    }
}
