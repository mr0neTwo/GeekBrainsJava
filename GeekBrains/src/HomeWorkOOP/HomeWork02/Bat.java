package HomeWorkOOP.HomeWork02;

public class Bat extends Predator implements IFly {

    public Bat(String name, int weigth) {
        super(name, weigth);
    }

    @Override
    public String say() {
        return "Псс";
    }

    @Override
    public int flySpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Bat [%s]", super.toString());
    }
}
