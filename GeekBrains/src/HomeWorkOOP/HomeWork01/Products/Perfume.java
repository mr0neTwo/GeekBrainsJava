package HomeWorkOOP.HomeWork01.Products;

public class Perfume extends Product {

    private final String brand;

    public Perfume(String name, Integer cost, String brand) {
        super(name, cost);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return String.format("Perfume [name: '%s', price: %d, brand: %s]", getName(), getCost(), brand);
    }
}
