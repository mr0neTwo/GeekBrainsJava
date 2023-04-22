package HomeWorkOOP.HomeWork02;

public abstract class Herbivores extends Animal {
    public Herbivores(String name, int weight) {
        super(name, weight);
    }

    public String feed() {
        return "Grass";
    }
}

