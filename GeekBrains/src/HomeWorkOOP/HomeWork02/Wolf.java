package HomeWorkOOP.HomeWork02;

public class Wolf extends Predator implements IWalk {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Wooow";
    }

    @Override
    public String toString() {
        return String.format("Wolf [%s]", super.toString());
    }

    @Override
    public int walkSpeed() {
        return 50;
    }
}

