package HomeWorkOOP.HomeWork01.Products;

public class Product {
    private final String name;

    private Integer cost;

    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", name, cost);
    }
}






