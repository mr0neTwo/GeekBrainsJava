import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("23");
        list.add("12");
        list.add("23e");
        list.add("23r");
        removeElements(list);
        System.out.println(list);
    }

    public static void removeElements(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            try {
                Integer.parseInt(element);
                iterator.remove();
            } catch (NumberFormatException e) {
                // element cannot be converted to an integer
            }
        }
    }

    public static void removeEvenNumbers(List<Integer> list){
        // remove even element form list
    }

}