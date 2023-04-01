package HomeWorks.HomeWork01;

import java.util.ArrayList;

/**
 * Вывести все простые числа от 1 до 1000
 */
public class Task1_02 {

    public void start() {
        int from = 1;
        int to = 1000;
        String massage = String.format("Простые числа в диапазоне %s - %s:", from, to);
        System.out.println(massage);
        printSimpleNumbers(from, to);
    }

    private void printSimpleNumbers(int from, int to) {

        ArrayList<Integer> dividers = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        int firstSimpleNumber = 2;

        for (int i = firstSimpleNumber; i < to + 1; i++) {

            int dividerCount = 0;
            for (int divider : dividers) {
                if (i % divider == 0) {
                    dividerCount++;
                }
            }

            if (dividerCount == 0) {
                dividers.add(i);
                if (i > from) {
                    result.append(i);
                    result.append(", ");
                }
            }
        }
        result.deleteCharAt(result.lastIndexOf(","));
        System.out.println(result);
    }
}
