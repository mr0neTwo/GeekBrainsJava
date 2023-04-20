package HomeWorkOOP.HomeWork02;

public class Duck extends Herbivores implements IFly, IWalk {

    public Duck(String name) {
        super(name);
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
    public String toString() {
        return String.format("Duck [%s]", super.toString());
    }
}
