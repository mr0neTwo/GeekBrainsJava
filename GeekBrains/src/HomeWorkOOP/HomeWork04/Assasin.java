package HomeWorkOOP.HomeWork04;

public class Assasin extends Warrior<Knife> {

    public Assasin(String name, int healthPoint, Knife knife) {
        super(name, healthPoint, knife);
    }

    @Override
    public String toString() {
        return String.format("Assasin, %s", super.toString());
    }
}

