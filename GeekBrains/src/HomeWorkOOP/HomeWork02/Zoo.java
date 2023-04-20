package HomeWorkOOP.HomeWork02;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();
    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
    
    public void addAnimal(Animal animal){
        animalList.add(animal);
    }
    
    public List<ISay> getSayble(){
        List<ISay> saybleList = new ArrayList<>(animalList);
        saybleList.add(radio);
        
        return saybleList;
    }


    public <T> List<T> getAnimalsByInterface(Class<T> interfaceClass) {
        List<T> animals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (interfaceClass.isInstance(animal)) {
                animals.add(interfaceClass.cast(animal));
            }
        }
        return animals;
    }
    
    public Animal fastestWalkable(){
        
        List<IWalk> walkables = getAnimalsByInterface(IWalk.class);
        
        IWalk fastestWalkable = walkables.get(0);
        
        for (IWalk walkable: walkables) {
            if(walkable.walkSpeed() > fastestWalkable.walkSpeed()) {
                fastestWalkable = walkable;
            }
        }
        return (Animal) fastestWalkable;
    }

    public Animal fastestFlyble(){

        List<IFly> flyables = getAnimalsByInterface(IFly.class);

        IFly fastestFlyble = flyables.get(0);

        for (IFly flyble: flyables) {
            if(flyble.flySpeed() > fastestFlyble.flySpeed()) {
                fastestFlyble = flyble;
            }
        }
        return (Animal) fastestFlyble;
    }

    public Animal fastestSwimming() {
        
        List<ISwim> swimmingList = getAnimalsByInterface(ISwim.class);
        
        ISwim fastestSwimming = swimmingList.get(0);

        for (ISwim swimming: swimmingList) {
            if(swimming.swimSpeed() > fastestSwimming.swimSpeed()) {
                fastestSwimming = swimming;
            }
        }
        return (Animal) fastestSwimming;
    }
}

