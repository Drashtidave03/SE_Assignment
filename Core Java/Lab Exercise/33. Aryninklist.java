import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
    
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList Elements:");
        for (String lang : arrayList) {
            System.out.println(lang);
        }


        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        
        linkedList.remove(1); // Removes 200
        linkedList.addFirst(50); // Specific to LinkedList reference

        System.out.println("\nLinkedList Elements:");
        linkedList.forEach(num -> System.out.println(num));
    }
}
