package HomeWorkOOP.HomeWork04;

public class WoodenShield implements IShield{
    
    private float strength = 30;
    @Override
    public float getStrength() {
        return strength;
    }

    @Override
    public ProtectionClass protectionClass() {
        return ProtectionClass.Light;
    }

    @Override
    public void takeDamage(float damage) {
        strength -= damage;
    }

    @Override
    public String toString() {
        return String.format("[WoodenShield, strength: %.1f, class: %s]", getStrength(), protectionClass().name());
    }
}
