package HomeWorkOOP.HomeWork01.Beverage;


public class Cappuccino extends Beverage {
    private int foamThickness; // толщина пены

    public Cappuccino(String name, double volume, double temperature, double price, int foamThickness) {
        super(name, volume, temperature, price);
        this.foamThickness = foamThickness;
    }

    public int getFoamThickness() {
        return foamThickness;
    }

    public void setFoamThickness(int foamThickness) {
        this.foamThickness = foamThickness;
    }

    @Override
    public String toString() {
        return "Cappuccino: " + super.toString() + ", foamThickness=" + foamThickness;
    }
}
