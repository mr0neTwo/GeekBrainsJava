package HomeWorkOOP.HomeWork04;

public class Battle {
    private final Warrior one;
    private final Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
    }
    
    public Warrior fight(){
        
        while (one.getHealth() > 0 && two.getHealth() > 0){
            
            hitSomeone(one, two);
            if(two.getHealth() < 0){
                return one;
            }

            hitSomeone(two, one);
            if(one.getHealth() < 0){
                return two;
            }
        }
        
        return null;
    }

    private void hitSomeone(Warrior from, Warrior to) {
        
        float hitDamage = from.hit();
        
        if(to.shield != null && to.shield.getStrength() > 0){
            switch (to.shield.protectionClass()){
                case Light -> hitDamage *= 0.9f;
                case Medium -> hitDamage *= 0.7;
                case Heavy -> hitDamage *= 0.5f;
            }
            to.shield.takeDamage(hitDamage/2);
        }
        System.out.println();
        System.out.printf("%s warrior hit damage %.1f.\n", from.getName(), hitDamage);
        to.takeDamage(hitDamage);
        System.out.printf("%s warrior heave health %.1f.\n", to.getName(), to.getHealth());
    }
}
