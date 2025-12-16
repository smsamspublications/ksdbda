import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

/**
 * Experiment 1: Week 1, 2
 * Demonstration of Set data structure using Java built-in methods
 */
public class SetDemo {
    public static void main(String[] args) {
        System.out.println("=== Set Demonstration ===\n");
        
        System.out.println("--- Part 1: HashSet Operations ---\n");
        
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        
        // 1. Adding elements
        System.out.println("1. Adding elements:");
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Apple"); // Duplicate - will not be added
        System.out.println("HashSet after add: " + hashSet);
        
        // 2. Size and empty check
        System.out.println("\n2. Size and empty check:");
        System.out.println("Size: " + hashSet.size());
        System.out.println("Is empty: " + hashSet.isEmpty());
        
        // 3. Contains operation
        System.out.println("\n3. Contains operation:");
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
        System.out.println("Contains 'Grape': " + hashSet.contains("Grape"));
        
        // 4. Remove operation
        System.out.println("\n4. Remove operation:");
        boolean removed = hashSet.remove("Cherry");
        System.out.println("Removed 'Cherry': " + removed);
        System.out.println("HashSet after remove: " + hashSet);
        
        // 5. Iterate through set
        System.out.println("\n5. Iterating through HashSet:");
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        System.out.print("Using enhanced for loop: ");
        for (String fruit : hashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // 6. Set operations
        System.out.println("\n6. Set operations:");
        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Grape");
        set2.add("Mango");
        System.out.println("Set 1: " + hashSet);
        System.out.println("Set 2: " + set2);
        
        // Union
        Set<String> union = new HashSet<>(hashSet);
        union.addAll(set2);
        System.out.println("Union: " + union);
        
        // Intersection
        Set<String> intersection = new HashSet<>(hashSet);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        
        // Difference
        Set<String> difference = new HashSet<>(hashSet);
        difference.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference);
        
        // 7. Clear operation
        System.out.println("\n7. Clear operation:");
        hashSet.clear();
        System.out.println("After clear: " + hashSet);
        System.out.println("Is empty: " + hashSet.isEmpty());
        
        // Part 2: LinkedHashSet - maintains insertion order
        System.out.println("\n\n--- Part 2: LinkedHashSet (Maintains Insertion Order) ---\n");
        
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(50);
        linkedHashSet.add(20);
        linkedHashSet.add(70);
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
        
        // Part 3: TreeSet - sorted set
        System.out.println("\n--- Part 3: TreeSet (Sorted Order) ---\n");
        
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(70);
        treeSet.add(10);
        treeSet.add(30);
        System.out.println("TreeSet (sorted order): " + treeSet);
        
        // TreeSet specific operations
        TreeSet<Integer> ts = new TreeSet<>(treeSet);
        System.out.println("\nTreeSet specific operations:");
        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());
        System.out.println("Higher than 30: " + ts.higher(30));
        System.out.println("Lower than 30: " + ts.lower(30));
        System.out.println("Ceiling of 25: " + ts.ceiling(25));
        System.out.println("Floor of 25: " + ts.floor(25));
        System.out.println("Subset (20 to 50): " + ts.subSet(20, 50));
    }
}
