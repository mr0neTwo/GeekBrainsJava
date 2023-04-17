package HomeWorkOOP.HomeWork01.Products;

public class Milk extends Product {
    private double fatContent;

    public Milk(String name, Integer cost, double fatContent) {
        super(name, cost);
        this.fatContent = fatContent;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return "Milk [name=" + getName() + ", price=" + getCost() + ", fatContent=" + fatContent + "]";
    }
}
