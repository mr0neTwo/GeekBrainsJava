package HomeWorkOOP.HomeWork02;

public abstract class Animal implements ISay {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String say();
    
    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, Say: %s, Feed: %s", name, say(), feed());
    }
}

