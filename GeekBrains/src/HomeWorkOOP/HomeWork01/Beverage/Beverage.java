package HomeWorkOOP.HomeWork01.Beverage;

public class Beverage {
    private final String name;
    private double volume;
    private double temperature;

    public Beverage(String name, double volume, double temperature, double price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private double price;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Beverage [name=" + name + ", volume=" + volume + ", temperature=" + temperature + ", price=" + price + "]";
    }
}



