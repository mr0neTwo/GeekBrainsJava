package HomeWorks;

import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class Utilities {

    public static int GetIntegerFormConsole(String massage){
        Scanner input = new Scanner(System.in);
        System.out.print(massage);
        while (!input.hasNextInt()){
            System.out.print("Некоректный ввод!\nВведите целое число:");
            input.next();
        }

        int result = input.nextInt();
        input.close();

        return result;
    }

    public static <T> void printArrayGeneric(T[] array) {

        StringJoiner result = new StringJoiner(", ");

        for (T item: array) {
            result.add(item.toString());
        }
        System.out.println(result);
    }

    public static void printArrayInt(int[] array) {

        StringJoiner result = new StringJoiner(", ");

        for (int item: array) {
            result.add(Integer.toString(item));
        }
        System.out.println(result);
    }

    public static int[] makeRandomArray(int length){
        Random random = new Random();
        int[] randomArray = random.ints(0, 100).limit(length).toArray();

        return randomArray;
    }
}