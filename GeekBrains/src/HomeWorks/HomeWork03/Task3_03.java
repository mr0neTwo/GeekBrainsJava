package HomeWorks.HomeWork03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static HomeWorks.Utilities.makeRandomArray;

public class Task3_03 {

    /**
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     */
    public void start(){
        int[] randomArray = makeRandomArray(15);
        List<Integer> listNumbers = Arrays.stream(randomArray).boxed().collect(Collectors.toList());
        System.out.println(listNumbers);
        printMinMaxAvg(listNumbers);
    }

    private void printMinMaxAvg(List<Integer> list){

        int min = Collections.min(list);
        int max = Collections.max(list);

        float sum = 0;
        for (int number : list) {
            sum += number;
        }
        float avg = sum / list.size();

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);

    }
}
