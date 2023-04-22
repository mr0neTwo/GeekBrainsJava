package HomeWorkOOP.HomeWork03;

public class Node<T> {
    private T data;

    public Node<T> next;

    public Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public T getData() {
        return data;
    }
    
    public String toString() {
        return data.toString();
    }
}
