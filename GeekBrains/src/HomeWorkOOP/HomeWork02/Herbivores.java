package HomeWorkOOP.HomeWork02;

public abstract class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }

    public String feed() {
        return "Grass";
    }
}

