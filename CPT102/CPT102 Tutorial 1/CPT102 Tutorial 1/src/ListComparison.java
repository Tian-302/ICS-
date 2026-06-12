import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {

     public static void main(String[] args) {

        // Create an ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Create a LinkedList
        List<Integer> linkedList = new LinkedList<>();

        // Add elements
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Access elements
        System.out.println("ArrayList element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList element at index 2: " + linkedList.get(2));

        // Insert element at the beginning
        arrayList.add(0, 99);
        linkedList.add(0, 99);

        // Remove an element
        arrayList.remove(3);
        linkedList.remove(3);

        // Display contents
        System.out.println("ArrayList contents: " + arrayList);
        System.out.println("LinkedList contents: " + linkedList);
    }
}