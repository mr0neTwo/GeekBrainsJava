package HomeWorkOOP.HomeWork01.Beverage;


public class Latte extends Beverage {
    private int milkPercentage; // процентное содержание молока

    public Latte(String name, double volume, double temperature, double price, int milkPercentage) {
        super(name, volume, temperature, price);
        this.milkPercentage = milkPercentage;
    }

    public int getMilkPercentage() {
        return milkPercentage;
    }

    public void setMilkPercentage(int milkPercentage) {
        this.milkPercentage = milkPercentage;
    }

    @Override
    public String toString() {
        return String.format("%s [volume: %.2f, temperature: %.2f, price: %.2f, milkPercentage: %d ]", getName(), getVolume(), getTemperature(),
                getPrice(), milkPercentage);
    }
}
