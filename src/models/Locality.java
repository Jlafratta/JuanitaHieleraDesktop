package models;

public class Locality {

    private int id;
    private String name;
    private Province Province;

    public Locality(int id, String name, models.Province province) {
        this.id = id;
        this.name = name;
        Province = province;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public models.Province getProvince() {
        return Province;
    }

    public void setProvince(models.Province province) {
        Province = province;
    }
}
