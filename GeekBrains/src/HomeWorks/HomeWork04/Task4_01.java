package HomeWorks.HomeWork04;

import java.util.LinkedList;

import static HomeWorks.Utilities.makeRandomLinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
 */
public class Task4_01 {

    public void start(){
        LinkedList<Integer> randomList = makeRandomLinkedList(15);
        System.out.println("Исходный список:");
        System.out.println(randomList);

        LinkedList<Integer> reversedList = reverseList(randomList);
        System.out.println("Перевернутый список список:");
        System.out.println(reversedList);
    }

    private LinkedList<Integer> reverseList(LinkedList<Integer> list) {

        LinkedList<Integer> reversedList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }
}


