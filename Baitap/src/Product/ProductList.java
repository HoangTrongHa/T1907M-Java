package Product;

public class ProductList {
    int id;
    String name;
    String description;
    long money;

    public ProductList(int id, String name, String description, long money) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.money = money;
    }

    public ProductList() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
