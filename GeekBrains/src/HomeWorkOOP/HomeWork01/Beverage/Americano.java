package HomeWorkOOP.HomeWork01.Beverage;


public class Americano extends Beverage {
    private boolean hasMilk; // есть ли молоко в напитке

    public Americano(String name, double volume, double temperature, double price, boolean hasMilk) {
        super(name, volume, temperature, price);
        this.hasMilk = hasMilk;
    }

    public boolean hasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    @Override
    public String toString() {
        return "Americano: " + super.toString() + ", hasMilk=" + hasMilk;
    }
}
