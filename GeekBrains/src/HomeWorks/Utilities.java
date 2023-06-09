package HomeWorks;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class Utilities {

    public static int GetIntegerFormConsole(Scanner scanner, String massage){
        System.out.print(massage);
        while (!scanner.hasNextInt()){
            System.out.print("Некоректный ввод!\nВведите целое число:");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static float GetFloatFormConsole(Scanner scanner, String massage){
        System.out.print(massage);
        while (!scanner.hasNextInt()){
            System.out.print("Некоректный ввод!\nВведите число:");
            scanner.next();
        }

        return scanner.nextFloat();
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

    public static LinkedList<Integer> makeRandomLinkedList(int length){
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(0, 100));
        }
        return list;
    }
}
