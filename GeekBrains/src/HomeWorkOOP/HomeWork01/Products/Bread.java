package HomeWorkOOP.HomeWork01.Products;

public class Bread extends Product {
    private String type;

    public Bread(String name, Integer cost, String type) {
        super(name, cost);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Bread [name: '%s', price: %d, type: %s]", getName(), getCost(), type);
    }
}
