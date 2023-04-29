package HomeWorkOOP.HomeWork04;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Warrior>{
    List<T> team = new ArrayList<>();
    
    public void addWarrior(T warrior){
        team.add(warrior);
    }
    
    public int getHealthPoints(){
        int sum = 0;
        
        for (T member: team) {
            sum += member.getHealth();
        }
        
        return sum;
    }
    
    public int getDamages(){
        int sum = 0;
        
        for (T member: team){
            sum += member.getDamage();
        }
        
        return sum;
    }
    
    public int getMaxRange(){
        int max = 0;
        
        for (T member: team){
            if(member instanceof Archer){
                if(max < ((Archer)member).getRange()){
                    max = ((Archer)member).getRange();
                }
            }
        }
        
        return max;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T member: team) {
            stringBuilder.append(member);
            stringBuilder.append("\n");
        }
        stringBuilder.append(String.format("teamHealth: %s, teamDamage: %s, maxRange: %s", getHealthPoints(), getDamages(), getMaxRange()));
        return stringBuilder.toString();
    }
}
