package HomeWorks.HomeWork05;

import java.util.*;

public class Task5_02 {

    String[] people = new String[]{
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Мария Федорова",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"};

    public void start(){
        Map<String, Integer> rating = makeRating();
        printRating(rating);
        System.out.println();
        Map<String, Integer> sortedRating = sortRating(rating);
        printRating(sortedRating);
    }

    private Map<String, Integer> makeRating(){
        Map<String, Integer> rating = new HashMap<>();
        for (String person: people) {
            if(rating.containsKey(person)){
                rating.put(person, rating.get(person) + 1);
            } else {
                rating.put(person, 1);
            }
        }

        return rating;
    }
    private Map<String, Integer> sortRating(Map<String, Integer> rating){

        List<Map.Entry<String, Integer>> list = new ArrayList<>(rating.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> sortedRating = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedRating.put(entry.getKey(), entry.getValue());
        }


        return sortedRating;
    }

    private void printRating(Map<String, Integer> rating){
        for (var item: rating.entrySet()) {
            System.out.println(item);
        }
    }
}
