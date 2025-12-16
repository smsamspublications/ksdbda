import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * Experiment 1: Week 1, 2
 * Demonstration of Queue data structure using Java built-in methods
 */
public class QueueDemo {
    public static void main(String[] args) {
        System.out.println("=== Queue Demonstration ===\n");
        
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        
        System.out.println("--- Part 1: Basic Queue Operations ---\n");
        
        // 1. Adding elements (enqueue)
        System.out.println("1. Adding elements (offer/add):");
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        queue.add("David");
        queue.add("Eve");
        System.out.println("After offer/add operations: " + queue);
        
        // 2. Peek operation
        System.out.println("\n2. Peek operation:");
        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Front element (element): " + queue.element());
        System.out.println("Queue after peek: " + queue);
        
        // 3. Remove operation (dequeue)
        System.out.println("\n3. Remove operation (poll/remove):");
        String removed = queue.poll();
        System.out.println("Removed element (poll): " + removed);
        System.out.println("Queue after poll: " + queue);
        removed = queue.remove();
        System.out.println("Removed element (remove): " + removed);
        System.out.println("Queue after remove: " + queue);
        
        // 4. Size and empty check
        System.out.println("\n4. Size and empty check:");
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is queue empty: " + queue.isEmpty());
        
        // 5. Contains operation
        System.out.println("\n5. Contains operation:");
        System.out.println("Contains 'Charlie': " + queue.contains("Charlie"));
        System.out.println("Contains 'Alice': " + queue.contains("Alice"));
        
        // 6. Iterate through queue
        System.out.println("\n6. Iterating through queue:");
        System.out.print("Queue elements: ");
        for (String person : queue) {
            System.out.print(person + " ");
        }
        System.out.println();
        
        // 7. Clear queue
        System.out.println("\n7. Clearing the queue:");
        queue.clear();
        System.out.println("After clear: " + queue);
        System.out.println("Is queue empty: " + queue.isEmpty());
        
        // 8. Null handling
        System.out.println("\n8. Null handling:");
        System.out.println("poll() on empty queue: " + queue.poll());
        System.out.println("peek() on empty queue: " + queue.peek());
        
        // Part 2: PriorityQueue demonstration
        System.out.println("\n\n--- Part 2: PriorityQueue Operations ---\n");
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        // Adding elements to PriorityQueue
        System.out.println("9. PriorityQueue - Adding elements:");
        priorityQueue.offer(50);
        priorityQueue.offer(20);
        priorityQueue.offer(70);
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        System.out.println("PriorityQueue: " + priorityQueue);
        
        // PriorityQueue automatically orders elements
        System.out.println("\n10. PriorityQueue - Removing in priority order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removed: " + priorityQueue.poll());
        }
    }
}
