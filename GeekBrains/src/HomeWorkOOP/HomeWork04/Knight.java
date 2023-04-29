package HomeWorkOOP.HomeWork04;

public class Knight extends Warrior<Sword> {

    public Knight(String name, int healthPoint, Sword weapon, IShield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Knight, %s", super.toString());
    }
}
