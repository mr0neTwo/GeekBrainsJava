package HomeWorkOOP.HomeWork04;

public class SteelShield implements IShield{
    
    private float strength = 100;
    
    @Override
    public float getStrength() {
        return strength;
    }

    @Override
    public ProtectionClass protectionClass() {
        return ProtectionClass.Heavy;
    }

    @Override
    public void takeDamage(float damage) {
        strength -= damage;
    }

    @Override
    public String toString() {
        return String.format("[SteelShield, strength: %.1f, class: %s]", getStrength(), protectionClass().name());
    }
}
