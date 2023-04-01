package HomeWorks.HomeWork03;
import java.util.*;
import java.util.stream.Collectors;

import static HomeWorks.Utilities.makeRandomArray;

/**
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа;
 */
public class Task3_02 {

    public void start(){
        int[] randomArray = makeRandomArray(15);
        List<Integer> listNumbers = Arrays.stream(randomArray).boxed().collect(Collectors.toList());

        System.out.println("Исходный массив:");
        System.out.println(listNumbers);

        removeEvenNumbers(listNumbers);

        System.out.println("Массив без четных чисел:");
        System.out.println(listNumbers);
    }

    private void removeEvenNumbers(List<Integer> list) {
        list.removeIf(element -> element % 2 == 0); // написал сначала через while, IDE подсказала что можно ковертнуть в такой вид
    }
}
