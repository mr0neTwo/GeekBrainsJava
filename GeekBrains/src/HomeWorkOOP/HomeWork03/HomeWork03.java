package HomeWorkOOP.HomeWork03;

public class HomeWork03 {

    public static void main(String[] args) {
        CustomLinkedList<Integer> numbers = new CustomLinkedList<>();
        numbers.addNode(1);
        numbers.addNode(2);
        numbers.addNode(3);
        
        for (Node<Integer> number : numbers) {
            System.out.println(number);
        }

        System.out.println();
        CustomLinkedList<String> words = new CustomLinkedList<>();
        words.addNode("Аптека");
        words.addNode("Улица");
        words.addNode("Фонарь");

        for (Node<String> node : words) {
            System.out.println(node);
        }

    }
}

