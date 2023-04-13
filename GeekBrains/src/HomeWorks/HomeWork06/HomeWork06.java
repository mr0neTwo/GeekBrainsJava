package HomeWorks.HomeWork06;

import java.util.*;

public class HomeWork06 {
    public static void main(String[] args) {
        
        LaptopStore laptopStore = new LaptopStore();

        laptopStore.addLaptop(new Laptop("Apple", "MacBook Pro", OperatingSystem.MAC_OS, Color.GRAY, 1999.99, 2022, 16.0, 16, 512)); ;
        laptopStore.addLaptop(new Laptop("Dell", "XPS 13", OperatingSystem.WINDOWS, Color.BROWN, 1199.99, 2021, 13.4, 16, 1024));
        laptopStore.addLaptop(new Laptop("Lenovo", "ThinkPad X1 Carbon", OperatingSystem.WINDOWS, Color.BLACK, 1599.99, 2022, 14.0, 8, 512));
        laptopStore.addLaptop(new Laptop("HP", "Spectre x360", OperatingSystem.WINDOWS, Color.RED, 1399.99, 2021, 13.5, 16, 512));
        laptopStore.addLaptop(new Laptop("Asus", "ZenBook S", OperatingSystem.WINDOWS, Color.BLACK, 1299.99, 2022, 14.0, 16, 256));
        laptopStore.addLaptop(new Laptop("Acer", "Swift 5", OperatingSystem.WINDOWS, Color.BLACK, 999.99, 2021, 14.0, 16, 512));
        laptopStore.addLaptop(new Laptop("Microsoft", "Surface Laptop 4", OperatingSystem.WINDOWS, Color.GOLD, 1299.99, 2021, 13.5, 8, 512));
        laptopStore.addLaptop(new Laptop("Razer", "Blade Stealth 13", OperatingSystem.LINUX, Color.ORANGE, 1799.99, 2021, 13.3, 16, 256));
        laptopStore.addLaptop(new Laptop("LG", "Gram 17", OperatingSystem.WINDOWS, Color.WHITE, 1699.99, 2022, 17.0, 16, 512));
        laptopStore.addLaptop(new Laptop("Samsung", "Galaxy Book Pro", OperatingSystem.WINDOWS, Color.BLACK, 1199.99, 2021, 15.6, 16, 512));

        Map<FilterOption, Float> filter = laptopStore.createFilter();
        laptopStore.filterLaptops(filter);
    }
    
}

