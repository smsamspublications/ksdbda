import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Experiment 1: Week 1, 2
 * Demonstration of Map data structure using Java built-in methods
 */
public class MapDemo {
    public static void main(String[] args) {
        System.out.println("=== Map Demonstration ===\n");
        
        System.out.println("--- Part 1: HashMap Operations ---\n");
        
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        
        // 1. Putting key-value pairs
        System.out.println("1. Putting key-value pairs:");
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        hashMap.put("David", 28);
        hashMap.put("Eve", 32);
        System.out.println("HashMap: " + hashMap);
        
        // 2. Update existing key
        System.out.println("\n2. Update existing key:");
        hashMap.put("Alice", 26);
        System.out.println("After updating Alice's age: " + hashMap);
        
        // 3. Get operation
        System.out.println("\n3. Get operation:");
        System.out.println("Age of Bob: " + hashMap.get("Bob"));
        System.out.println("Age of Frank: " + hashMap.get("Frank")); // Returns null
        System.out.println("Age of Frank with default: " + hashMap.getOrDefault("Frank", 0));
        
        // 4. Contains operations
        System.out.println("\n4. Contains operations:");
        System.out.println("Contains key 'Charlie': " + hashMap.containsKey("Charlie"));
        System.out.println("Contains key 'Frank': " + hashMap.containsKey("Frank"));
        System.out.println("Contains value 30: " + hashMap.containsValue(30));
        System.out.println("Contains value 40: " + hashMap.containsValue(40));
        
        // 5. Size and empty check
        System.out.println("\n5. Size and empty check:");
        System.out.println("Size: " + hashMap.size());
        System.out.println("Is empty: " + hashMap.isEmpty());
        
        // 6. Remove operation
        System.out.println("\n6. Remove operation:");
        Integer removed = hashMap.remove("David");
        System.out.println("Removed David's age: " + removed);
        System.out.println("HashMap after remove: " + hashMap);
        
        // 7. Iterating through Map
        System.out.println("\n7. Iterating through Map:");
        
        // Using keySet
        System.out.println("Using keySet:");
        for (String key : hashMap.keySet()) {
            System.out.println("  " + key + " -> " + hashMap.get(key));
        }
        
        // Using entrySet
        System.out.println("Using entrySet:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // Using values
        System.out.print("All values: ");
        for (Integer value : hashMap.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // 8. putIfAbsent operation
        System.out.println("\n8. putIfAbsent operation:");
        hashMap.putIfAbsent("Frank", 29);
        hashMap.putIfAbsent("Alice", 27); // Won't update as Alice exists
        System.out.println("After putIfAbsent: " + hashMap);
        
        // 9. replace operations
        System.out.println("\n9. Replace operations:");
        hashMap.replace("Bob", 31);
        System.out.println("After replace Bob: " + hashMap);
        hashMap.replace("Charlie", 35, 36);
        System.out.println("After conditional replace Charlie: " + hashMap);
        
        // 10. compute operations
        System.out.println("\n10. Compute operations:");
        hashMap.compute("Eve", (key, value) -> value + 1);
        System.out.println("After compute (increment Eve's age): " + hashMap);
        
        hashMap.computeIfPresent("Alice", (key, value) -> value + 2);
        System.out.println("After computeIfPresent Alice: " + hashMap);
        
        hashMap.computeIfAbsent("Grace", key -> 24);
        System.out.println("After computeIfAbsent Grace: " + hashMap);
        
        // 11. merge operation
        System.out.println("\n11. Merge operation:");
        hashMap.merge("Bob", 5, Integer::sum);
        System.out.println("After merge (Bob's age + 5): " + hashMap);
        
        // 12. Clear operation
        System.out.println("\n12. Clear operation:");
        Map<String, Integer> tempMap = new HashMap<>(hashMap);
        tempMap.clear();
        System.out.println("After clear: " + tempMap);
        
        // Part 2: LinkedHashMap - maintains insertion order
        System.out.println("\n\n--- Part 2: LinkedHashMap (Maintains Insertion Order) ---\n");
        
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Java", "Programming Language");
        linkedHashMap.put("Python", "Scripting Language");
        linkedHashMap.put("SQL", "Query Language");
        linkedHashMap.put("HTML", "Markup Language");
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);
        
        // Part 3: TreeMap - sorted by keys
        System.out.println("\n--- Part 3: TreeMap (Sorted by Keys) ---\n");
        
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(8, "Eight");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        System.out.println("TreeMap (sorted by keys): " + treeMap);
        
        // TreeMap specific operations
        TreeMap<Integer, String> tm = new TreeMap<>(treeMap);
        System.out.println("\nTreeMap specific operations:");
        System.out.println("First entry: " + tm.firstEntry());
        System.out.println("Last entry: " + tm.lastEntry());
        System.out.println("First key: " + tm.firstKey());
        System.out.println("Last key: " + tm.lastKey());
        System.out.println("Higher entry than 4: " + tm.higherEntry(4));
        System.out.println("Lower entry than 4: " + tm.lowerEntry(4));
        System.out.println("SubMap (2 to 5): " + tm.subMap(2, 5));
    }
}
