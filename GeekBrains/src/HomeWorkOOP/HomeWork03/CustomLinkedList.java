package HomeWorkOOP.HomeWork03;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<Node<T>> {
    private Node<T> head;
    private Node<T> tail;

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addNode(T data) {
        Node<T> new_node = new Node<>(data);

        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            this.tail.next = new_node;
            new_node.prev = this.tail;
            this.tail = new_node;
        }
    }

    public Iterator<Node<T>> iterator() {
        return new CustomLinkedListIterator<>(this.head);
    }

    private class CustomLinkedListIterator<T> implements Iterator<Node<T>> {
        private Node<T> current_node;

        public CustomLinkedListIterator(Node<T> head) {
            this.current_node = head;
        }

        public boolean hasNext() {
            return this.current_node != null;
        }

        public Node<T> next() {
            Node<T> node = this.current_node;
            this.current_node = this.current_node.next;
            return node;
        }

    }
}


