import java.util.Stack;
import java.util.EmptyStackException;

/**
 * Experiment 1: Week 1, 2
 * Demonstration of Stack data structure using Java built-in methods
 */
public class StackDemo {
    public static void main(String[] args) {
        System.out.println("=== Stack Demonstration ===\n");
        
        // Create a Stack
        Stack<Integer> stack = new Stack<>();
        
        // 1. Pushing elements
        System.out.println("1. Pushing elements:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("After push operations: " + stack);
        
        // 2. Peek operation
        System.out.println("\n2. Peek operation:");
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Stack after peek: " + stack);
        
        // 3. Pop operation
        System.out.println("\n3. Pop operation:");
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);
        
        // 4. Search operation
        System.out.println("\n4. Search operation:");
        int position = stack.search(30);
        System.out.println("Position of 30 from top: " + position);
        System.out.println("Position of 10 from top: " + stack.search(10));
        System.out.println("Position of 99 (not present): " + stack.search(99));
        
        // 5. Check if stack is empty
        System.out.println("\n5. Check if stack is empty:");
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
        
        // 6. Iterate through stack
        System.out.println("\n6. Iterating through stack:");
        System.out.print("Stack elements (bottom to top): ");
        for (Integer element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        // 7. Pop all elements
        System.out.println("\n7. Popping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("Is stack empty now: " + stack.isEmpty());
        
        // 8. Exception handling
        System.out.println("\n8. Exception handling:");
        try {
            stack.pop(); // This will throw EmptyStackException
        } catch (EmptyStackException e) {
            System.out.println("Exception caught: Cannot pop from empty stack");
        }
        
        // 9. Additional operations
        System.out.println("\n9. Additional operations:");
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("New stack: " + stack);
        System.out.println("Contains 200: " + stack.contains(200));
        System.out.println("Index of 200: " + stack.indexOf(200));
        stack.clear();
        System.out.println("After clear: " + stack);
    }
}
