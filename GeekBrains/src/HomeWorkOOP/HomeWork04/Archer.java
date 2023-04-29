package HomeWorkOOP.HomeWork04;

import java.util.Random;

public class Archer extends Warrior<Bow> {

    public Archer(String name, int healthPoint, Bow bow, WoodenShield shield) {
        super(name, healthPoint, bow, shield);
    }
    
    int getRange(){
        Random random = new Random();
        return random.nextInt(weapon.getRange());
    }

    @Override
    public String toString() {
        return String.format("Archer, %s", super.toString());
    }
}

