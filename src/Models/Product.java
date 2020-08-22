package Models;

public class Product {
    private int Id;
    private String name;
    private float price_x_Kg;


    public Product(int id, String name, float price_x_Kg) {
        Id = id;
        this.name = name;
        this.price_x_Kg = price_x_Kg;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice_x_Kg() {
        return price_x_Kg;
    }

    public void setPrice_x_Kg(float price_x_Kg) {
        this.price_x_Kg = price_x_Kg;
    }

}
