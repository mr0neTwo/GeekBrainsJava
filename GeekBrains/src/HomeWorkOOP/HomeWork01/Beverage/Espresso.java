package HomeWorkOOP.HomeWork01.Beverage;

public class Espresso extends Beverage {
    private int intensity; // интенсивность кофе

    public Espresso(String name, double volume, double temperature, double price, int intensity) {
        super(name, volume, temperature, price);
        this.intensity = intensity;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Espresso: " + super.toString() + ", intensity=" + intensity;
    }
}
