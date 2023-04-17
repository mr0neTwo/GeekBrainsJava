package HomeWorkOOP.HomeWork01;


import HomeWorkOOP.HomeWork01.Beverage.*;
import HomeWorkOOP.HomeWork01.Products.*;

/**
 * На основе кода с урока добавить еще один класс продукта, (Молоко, шоколад ,и т.п.,
 * можно добавить несколько классов), они должны наследоваться от класса Product,
 * надо переопределить метод toString и попробовать включить эти классы в VendingMachine,
 * вывести список товаров из VendingMachine
 * <p>
 * (*) Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные:
 * наименование, объем, температура, цена. Проинициализировать несколько напитков в классе main и
 * торговый автомат, воспроизвести логику продажи напитков. Сделать на основе ООП
 */
public class HomeWork01 {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine
                .addProduct(new Product("Cheese", 300))
                .addProduct(new Product("Water", 10))
                .addProduct(new Product("Wine", 330))
                .addProduct(new Yougurt("Danone", 300, "Sweet"))
                .addProduct(new Perfume("Si", 6500, "Dior" ))
                .addProduct(new Chocolate("Dark Chocolate", 150, "Bitter"))
                .addProduct(new Milk("Milk 2.5%", 90, 2.5))
                .addProduct(new Bread("Rye bread", 45, "Rye"));

        for (Product product: vendingMachine.getProducts()) {
            System.out.println(product);
        }
        
        System.out.println();
        
        Product found = vendingMachine.findProduct("Water");
        System.out.println(found.toString());
        
        Product sold = vendingMachine.sellProduct(found);
        System.out.println(vendingMachine.getAmount());

        System.out.println();
        for (Product product: vendingMachine.getProducts()) {
            System.out.println(product);
        }

        CoffeeMachine machine = new CoffeeMachine();
        machine.addBeverage(new Espresso("Espresso", 0.3, 65, 2.5, 10));
        machine.addBeverage(new Americano("Americano", 0.2, 75, 3.0, false));
        machine.addBeverage(new Latte("Latte", 0.3, 60, 3.5, 70));
        machine.addBeverage(new Cappuccino("Cappuccino", 0.3, 65, 4.0, 15));

        // Проверяем, что напитки добавлены в автомат
        System.out.println("Кофейный автомат содержит следующие напитки:");
        for (Beverage beverage : machine.getBeverages()) {
            System.out.println(beverage);
        }
    }
}

