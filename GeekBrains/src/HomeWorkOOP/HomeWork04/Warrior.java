package HomeWorkOOP.HomeWork04;

import java.util.Random;

public abstract class Warrior<T extends IWeapon> {
    private final String name;
    private float healthPoint;
    protected T weapon;
    
    protected IShield shield;

    public Warrior(String name, float healthPoint, T weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public Warrior(String name, float healthPoint, T weapon, IShield shield) {
        this(name, healthPoint, weapon);
        this.shield = shield;
    }

    public int hit(){
        Random random = new Random();
        return random.nextInt((int) weapon.damage());
    }

    public float getHealth() {
        return healthPoint;
    }

    public float getDamage() {
        return weapon.damage();
    }

    public void takeDamage(float damage) {
        healthPoint -= damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String shieldSting = shield != null ? shield.toString(): "None";
        return String.format("Name: %s, HealthPoint: %.1f,  Weapon: %s, Shield: %s", name, healthPoint, weapon.toString(), shieldSting);
    }
}

