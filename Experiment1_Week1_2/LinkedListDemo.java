import java.util.LinkedList;
import java.util.Iterator;

/**
 * Experiment 1: Week 1, 2
 * Demonstration of LinkedList data structure using Java built-in methods
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("=== LinkedList Demonstration ===\n");
        
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        
        // 1. Adding elements
        System.out.println("1. Adding elements:");
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        System.out.println("After add(): " + linkedList);
        
        // 2. Adding at specific positions
        linkedList.addFirst("JavaScript");
        linkedList.addLast("Ruby");
        linkedList.add(2, "Go");
        System.out.println("After addFirst(), addLast(), add(index): " + linkedList);
        
        // 3. Accessing elements
        System.out.println("\n2. Accessing elements:");
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        System.out.println("Element at index 2: " + linkedList.get(2));
        
        // 4. Modifying elements
        System.out.println("\n3. Modifying elements:");
        linkedList.set(3, "Kotlin");
        System.out.println("After set(3, 'Kotlin'): " + linkedList);
        
        // 5. Removing elements
        System.out.println("\n4. Removing elements:");
        linkedList.removeFirst();
        System.out.println("After removeFirst(): " + linkedList);
        linkedList.removeLast();
        System.out.println("After removeLast(): " + linkedList);
        linkedList.remove(1);
        System.out.println("After remove(1): " + linkedList);
        linkedList.remove("C++");
        System.out.println("After remove('C++'): " + linkedList);
        
        // 6. Searching elements
        System.out.println("\n5. Searching elements:");
        System.out.println("Contains 'Python': " + linkedList.contains("Python"));
        System.out.println("Index of 'Kotlin': " + linkedList.indexOf("Kotlin"));
        
        // 7. Size and empty check
        System.out.println("\n6. Size and empty check:");
        System.out.println("Size: " + linkedList.size());
        System.out.println("Is empty: " + linkedList.isEmpty());
        
        // 8. Iterating through LinkedList
        System.out.println("\n7. Iterating through LinkedList:");
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        System.out.print("Using enhanced for loop: ");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println();
        
        // 9. Clear the list
        System.out.println("\n8. Clearing the list:");
        linkedList.clear();
        System.out.println("After clear(): " + linkedList);
        System.out.println("Is empty: " + linkedList.isEmpty());
    }
}
