package HomeWorkOOP.HomeWork02;

public abstract class Animal implements ISay, Comparable<Animal> {
    private final String name;

    private final int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public abstract String say();
    
    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, Waight: %d, Say: %s, Feed: %s", name, weight, say(), feed());
    }

    @Override
    public int compareTo(Animal animal) {
        return this.weight - animal.weight;
    }
}

