package HomeWorkOOP.HomeWork04;

public class Knife implements IWeapon {
    private final float damageAmount = 15;
    
    @Override
    public float damage() {
        return damageAmount;
    }

    @Override
    public String toString() {
        return String.format("Knife, damage: %.1f", damageAmount);
    }
}

