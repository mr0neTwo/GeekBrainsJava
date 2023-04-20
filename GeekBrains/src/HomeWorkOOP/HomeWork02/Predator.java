package HomeWorkOOP.HomeWork02;

public abstract class Predator extends Animal {
    public Predator(String name){
        super(name);
    }
    
    public String feed(){
        return "Meat";
    }
    
}

