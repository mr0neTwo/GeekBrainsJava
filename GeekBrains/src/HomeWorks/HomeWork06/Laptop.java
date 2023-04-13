package HomeWorks.HomeWork06;

public class Laptop {
    
    private final String brand;
    private final String model; // Модель
    private final OperatingSystem operatingSystem;
    private final Color color;
    private final int year; // Год выпуска
    private final double screenSize; // Размер экрана
    private final int ram; // Оперативная память
    private final int storage; // Хранение (в Гб)
    private double price; // Цена

    // Конструктор класса
    public Laptop(String brand, String model, OperatingSystem operatingSystem, Color color, double price, int year, double screenSize, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.price = price;
        this.year = year;
        this.screenSize = screenSize;
        this.ram = ram;
        this.storage = storage;
    }

    // Методы для доступа к полям класса
    public String get_brand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public Color getColor() {
        return color;
    }
    public OperatingSystem getOS() {
        return operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    // Метод для изменения цены
    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для вывода информации о ноутбуке
    public void printInfo() {
        System.out.printf("%s %s ", brand, model);
        System.out.printf("%d ", year);
        System.out.printf("Цвет: %s ", color.name());
        System.out.printf("ОС: %s ", operatingSystem.name());
        System.out.printf("Диагональ: %.1f ", screenSize);
        System.out.printf("RAM: %d GB ", ram);
        System.out.printf("Жесткий диск: %d GB ", storage);
        System.out.printf("Цена: %.2f\n", price);
    }
}

