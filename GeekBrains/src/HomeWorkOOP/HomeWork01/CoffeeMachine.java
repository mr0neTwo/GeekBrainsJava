package HomeWorkOOP.HomeWork01;

import HomeWorkOOP.HomeWork01.Beverage.Beverage;

import java.util.ArrayList;
import java.util.List;

class CoffeeMachine {
    private final List<Beverage> beverages = new ArrayList<>();
    
    private double amount;
    
    public void sellBeverage(String name) {

        Beverage beverage = getBeverage(name);

        if (beverage == null) {
            System.out.println("Такого напитка нет в автомате.");
            return;
        }
        
        double change = getTotalMoney() - beverage.getPrice();
        if (change < 0) {
            System.out.println("Не хватает денег для покупки напитка.");
            return;
        }
        
        System.out.println("Вы купили напиток " + beverage.getName() + " за " + beverage.getPrice() + " рублей.");
        if (change > 0) {
            System.out.println("Ваша сдача: " + change + " рублей.");
        }
        
        amount += beverage.getPrice();

        // Удалить напиток из списка напитков автомата
        beverages.remove(beverage);
    }

    private Beverage getBeverage(String searchWord) {
        for (Beverage beverage: beverages) {
            if(beverage.getName().contains(searchWord)){
                return beverage;
            }
        }

        return null;
    }

    private double getTotalMoney() {
        return amount;
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public List<Beverage> getBeverages() {
        return new ArrayList<>(beverages);
    }
}
