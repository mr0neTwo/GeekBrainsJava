package HomeWorkOOP.HomeWork02;

public class HomeWork02 {

    /**
     * Создать интерфейс, скорость плаванья
     * Добавить новое животное, способное плавать
     * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     * Написать аквариум, или террариум по аналогии
     */
    
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Wolf("Wolf"));
        zoo.addAnimal(new Hare("Hare"));
        zoo.addAnimal(new Duck("Donald"));
        zoo.addAnimal(new Bat("Man"));
        zoo.addAnimal(new Penguin("Max"));
        zoo.addAnimal(new Dolphin("Pen"));

        for (Animal animal: zoo.animalList) {
            System.out.println(animal);
        }

        System.out.println();
        for (Animal animal: zoo.animalList) {
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
    }
}
