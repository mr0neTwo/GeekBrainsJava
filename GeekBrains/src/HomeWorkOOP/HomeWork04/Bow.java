package HomeWorkOOP.HomeWork04;

public class Bow implements IWeapon {
    private final int damageAmount = 45;

    private final int range = 50;

    @Override
    public float damage() {
        return damageAmount;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Bow, damage: %d", damageAmount);
    }
}
