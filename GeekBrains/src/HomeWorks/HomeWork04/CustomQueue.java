package HomeWorks.HomeWork04;

import java.util.LinkedList;
import java.util.Random;

public class CustomQueue {
    private final LinkedList<Integer> queue;

    CustomQueue(){
        queue = new LinkedList<>();
    }

    public void enqueue(int number) {
        queue.add(number);
    }

    public int dequeue(){
        return queue.removeFirst();
    }

    public int first(){
        return queue.getFirst();
    }

    public void showQueue(){
        System.out.println(queue);
    }

    public void fillRandom(int countNumbers){
        Random random = new Random();
        for (int i = 0; i < countNumbers; i++) {
            queue.add(random.nextInt(100));
        }
    }
}
