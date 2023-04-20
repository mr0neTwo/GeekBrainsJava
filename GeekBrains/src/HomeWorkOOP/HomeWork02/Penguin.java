package HomeWorkOOP.HomeWork02;

public class Penguin extends Waterfowl implements ISwim {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Ua";
    }

    @Override
    public String feed() {
        return "Fish";
    }

    @Override
    public int swimSpeed() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Penguin [%s]", super.toString());
    }
}
