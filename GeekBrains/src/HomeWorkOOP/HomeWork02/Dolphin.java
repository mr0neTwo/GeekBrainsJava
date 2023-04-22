package HomeWorkOOP.HomeWork02;

public class Dolphin extends Waterfowl implements ISwim {

    public Dolphin(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String say() {
        return "Uuua";
    }

    @Override
    public String feed() {
        return "Fish";
    }

    @Override
    public int swimSpeed() {
        return 55;
    }

    @Override
    public String toString() {
        return String.format("Dolphin [%s]", super.toString());
    }
}
