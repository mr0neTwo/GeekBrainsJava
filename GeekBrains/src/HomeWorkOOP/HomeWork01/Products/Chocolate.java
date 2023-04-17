package HomeWorkOOP.HomeWork01.Products;

public class Chocolate extends Product {
    private String flavor;

    public Chocolate(String name, Integer cost, String flavor) {
        super(name, cost);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Chocolate [name=" + getName() + ", price=" + getCost() + ", flavor=" + flavor + "]";
    }
}

