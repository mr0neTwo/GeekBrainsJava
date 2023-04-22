package HomeWorkOOP.HomeWork02;

import java.util.Collections;
import java.util.List;

public class HomeWork02 {

    /**
     * Создать интерфейс, скорость плаванья
     * Добавить новое животное, способное плавать
     * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     * Написать аквариум, или террариум по аналогии
     */
    
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Wolf("Wolf", 45));
        zoo.addAnimal(new Hare("Hare", 8));
        zoo.addAnimal(new Duck("Donald", 12));
        zoo.addAnimal(new Bat("Man", 1));
        zoo.addAnimal(new Penguin("Max", 120));
        zoo.addAnimal(new Dolphin("Pen", 180));

        for (Animal animal: zoo) {
            System.out.println(animal);
        }

        System.out.println();
        for (Animal animal: zoo) {
            System.out.println(animal.say());
        }
        
        zoo.setRadio(new Radio());

        System.out.println();
        for (ISay sayble: zoo.getSayble()) {
            System.out.println(sayble.say());
        }

        System.out.println();
        for (IWalk walkable: zoo.getAnimalsByInterface(IWalk.class)) {
            System.out.println(walkable.walkSpeed());
        }

        System.out.println();
        for (IFly flyble: zoo.getAnimalsByInterface(IFly.class)) {
            System.out.println(flyble.flySpeed());
        }

        System.out.println();
        System.out.println("Самое быстрое ходящее:");
        System.out.println(zoo.fastestWalkable());

        System.out.println();
        System.out.println("Самое быстрое летающее:");
        System.out.println(zoo.fastestFlyble());

        System.out.println();
        System.out.println("Самое быстрое плавающее:");
        System.out.println(zoo.fastestSwimming());

        System.out.println();
        System.out.println("Сортируем список животных по весу:");
        List<Animal> listAnimals = zoo.toList();
        Collections.sort(listAnimals);
        for (Animal animal: listAnimals) {
            System.out.println(animal);
        }

        System.out.println();
        System.out.println("Сортируем список животных по имени:");
        listAnimals.sort((a, b) -> a.getName().compareTo(b.getName()));
        for (Animal animal: listAnimals) {
            System.out.println(animal);
        }
    }
}
