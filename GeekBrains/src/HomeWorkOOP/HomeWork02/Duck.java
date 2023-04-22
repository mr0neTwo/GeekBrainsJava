package HomeWorkOOP.HomeWork02;

public class Duck extends Herbivores implements IFly, IWalk, ISwim {

    public Duck(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String say() {
        return "Кря кря";
    }

    @Override
    public int flySpeed() {
        return 10;
    }

    @Override
    public int walkSpeed() {
        return 2;
    }

    @Override
    public int swimSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Duck [%s]", super.toString());
    }
}
