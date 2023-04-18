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
        return String.format("%s [volume: %.2f, temperature: %.2f, price: %.2f, hasMilk: %b ]", getName(), getVolume(), getTemperature(),
                getPrice(), hasMilk);
    }
}
