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
        return String.format("%s [volume: %.2f, temperature: %.2f, price: %.2f, intensity: %d ]", getName(), getVolume(), getTemperature(),
                getPrice(), intensity);
    }
}
