package HomeWorks.HomeWork06;

import java.util.*;

import static HomeWorks.Utilities.GetFloatFormConsole;
import static HomeWorks.Utilities.GetIntegerFormConsole;

public class LaptopStore {
    
    private final List<Laptop> laptops = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    
    public void addLaptop(Laptop laptop){
        laptops.add(laptop);
    }
    
    public Map<FilterOption, Float> createFilter(){
        
        
        Map<FilterOption, Float> filter = new HashMap<>();
        
        boolean continueSelection = true;
        while (continueSelection){
            addOption(filter);
            System.out.println("1 - выбрать слудующий критерий\nИли любое другое число чтобы заверишить");
            int key = GetIntegerFormConsole(scanner,"");
            continueSelection = key == 1 && filter.size() < 6;
        }
        
        return filter;
    }

    public void filterLaptops(Map<FilterOption, Float> filter){
        for (Laptop laptop: laptops) {
            if (checkFilterCondition(filter, laptop)) laptop.printInfo();
        }
    }
    
    private void addOption(Map<FilterOption, Float> filter) {
        
        System.out.println("Выберите критерии для поиска");
        printAllOption(filter);

        int option = GetIntegerFormConsole(scanner,"Введите номер: ");
        FilterOption key = FilterOption.values()[option];

        float value;

        switch (key) {
            case RAM -> {
                System.out.println("Введите минимальный объем оперативной памяти");
                value = GetFloatFormConsole(scanner, "Введите значение: ");
                filter.put(FilterOption.RAM, value);
            }
            case SCREEN_SIZE -> {
                System.out.println("Введите минимальную необходимую диоганаль");
                value = GetFloatFormConsole(scanner, "Введите значение: ");
                filter.put(FilterOption.SCREEN_SIZE, value);
            }
            case COLOR -> {
                System.out.println("Выберите цвет");
                printAllColors();
                value = GetFloatFormConsole(scanner, "Введите номер: ");
                filter.put(FilterOption.COLOR, value);
            }
            case OS -> {
                System.out.println("Выберите операционную систему");
                printAllOS();
                value = GetFloatFormConsole(scanner, "Введите номер: ");
                filter.put(FilterOption.OS, value);
            }
            case STORAGE -> {
                System.out.println("Введите минимальный объем основной памяти");
                value = GetFloatFormConsole(scanner, "Введите значение: ");
                filter.put(FilterOption.STORAGE, value);
            }
            case YEAR -> {
                System.out.println("Введите минимальный год выпуска");
                value = GetFloatFormConsole(scanner, "Введите значение: ");
                filter.put(FilterOption.YEAR, value);
            }
            default -> System.out.println("Категория с данным номером не существует");
        }
    }

    private boolean checkFilterCondition(Map<FilterOption, Float> filter, Laptop laptop) {
        
        for (var option: filter.entrySet()) {
            switch (option.getKey()) {
                case RAM -> {
                    if (option.getValue() > laptop.getRam()) return false;
                }
                case SCREEN_SIZE -> {
                    if (option.getValue() > laptop.getScreenSize()) return false;
                }
                case STORAGE -> {
                    if (option.getValue() > laptop.getStorage()) return false;
                }
                case YEAR -> {
                    if (option.getValue() > laptop.getYear()) return false;
                }
                case COLOR -> {
                    if (option.getValue() != laptop.getColor().ordinal()) return false;
                }
                case OS -> {
                    if (option.getValue() != laptop.getOS().ordinal()) return false;
                }
            }
        }
        return true;
    }

    private void printAllOption(Map<FilterOption, Float> filter) {
        System.out.println();
        for (FilterOption option : FilterOption.values()) {
            if(!filter.containsKey(option)){
                System.out.printf("%d - %s\n", option.ordinal(), option.name());
            }
        }
    }

    private void printAllColors() {
        System.out.println();
        for (Color color : Color.values()) {
            System.out.printf("%d - %s\n", color.ordinal(), color.name());

        }
    }

    private void printAllOS() {
        System.out.println();
        for (OperatingSystem os : OperatingSystem.values()) {
            System.out.printf("%d - %s\n", os.ordinal(), os.name());
        }
    }
}

