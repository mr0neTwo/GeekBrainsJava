package HomeWorkOOP.HomeWork02;

public abstract class Predator extends Animal {
    public Predator(String name, int weight){
        super(name, weight);
    }
    
    public String feed(){
        return "Meat";
    }
    
}

