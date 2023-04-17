package HomeWorkOOP.HomeWork01.Products;

public class Yougurt extends Product {

    private final String flavor;

    public Yougurt(String name, Integer cost, String flavor) {
        super(name, cost);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + flavor;
    }
}

