package models;

public class Ticket {
    private String date;
    private String time;
    private float neto;
    private float TotalPrice;
    private Client client;
    private Product product;
    private Vehicle vehicle;

    public Ticket(String date, String time, float neto, float totalPrice, Client client, Product product, Vehicle vehicle) {
        this.date = date;
        this.time = time;
        this.neto = neto;
        this.TotalPrice = totalPrice;
        this.client = client;
        this.product = product;
        this.vehicle = vehicle;
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
        return TotalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        TotalPrice = totalPrice;
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

    @Override
    public String toString() {
        return "Ticket{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", neto=" + neto +
                ", TotalPrice=" + TotalPrice +
                ", client=" + client +
                ", product=" + product +
                ", vehicle=" + vehicle +
                '}';
    }
}
