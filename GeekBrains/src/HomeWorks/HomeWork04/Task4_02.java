package HomeWorks.HomeWork04;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 *  • enqueue() — помещает элемент в конец очереди,
 *  • dequeue() — возвращает первый элемент из очереди и удаляет его,
 *  • first() — возвращает первый элемент из очереди, не удаляя.
 */
public class Task4_02 {

    private final CustomQueue queue;

    Task4_02(){
        queue = new CustomQueue();
    }

    public void start(){
        queue.fillRandom(10);
        System.out.println("Исходная очередь");
        queue.showQueue();
        System.out.println("Помещаем элемент 99 в конец очереди");
        queue.enqueue(99);
        queue.showQueue();
        System.out.println("возвращаем первый элемент из очереди и удаляем его");
        System.out.println(queue.dequeue());
        queue.showQueue();
        System.out.println("возвращаем первый элемент из очереди, не удаляя");
        System.out.println(queue.first());
        queue.showQueue();
    }
}
