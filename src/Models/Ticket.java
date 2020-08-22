package Models;

public class Ticket {
    private String date;
    private String time;
    private float neto;
    private Float TotalPrice;
    private Client client;
    private Product product;

    public Ticket(String date, String time, float neto, Float totalPrice, Client client, Product product) {
        this.date = date;
        this.time = time;
        this.neto = neto;
        TotalPrice = totalPrice;
        this.client = client;
        this.product = product;
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
}
