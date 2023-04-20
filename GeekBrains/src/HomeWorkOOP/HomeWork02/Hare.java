package HomeWorkOOP.HomeWork02;

public class Hare extends Herbivores implements IWalk {

    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Ffff";
    }

    @Override
    public String toString() {
        return String.format("Hare [%s]", super.toString());
    }

    @Override
    public int walkSpeed() {
        return 15;
    }
}
