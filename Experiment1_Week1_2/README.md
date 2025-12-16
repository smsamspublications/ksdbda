# Experiment 1: Week 1, 2 - Advanced Data Structures in Java

## Overview
This directory contains Java implementations demonstrating various advanced data structures using Java's built-in methods and classes from the Java Collections Framework.

## Data Structures Implemented

### 1. LinkedList (`LinkedListDemo.java`)
Demonstrates the LinkedList data structure with operations including:
- Adding elements (add, addFirst, addLast)
- Accessing elements (get, getFirst, getLast)
- Modifying elements (set)
- Removing elements (remove, removeFirst, removeLast)
- Searching (contains, indexOf)
- Iteration methods
- Size and empty checks

### 2. Stack (`StackDemo.java`)
Demonstrates the Stack data structure with operations including:
- Push operation
- Pop operation
- Peek operation
- Search operation
- Empty check
- Exception handling
- Iteration methods

### 3. Queue (`QueueDemo.java`)
Demonstrates Queue data structures with two implementations:
- **LinkedList-based Queue**: Basic FIFO operations
- **PriorityQueue**: Priority-based ordering

Operations demonstrated:
- Enqueue (offer, add)
- Dequeue (poll, remove)
- Peek operations (peek, element)
- Size and empty checks
- Contains operation
- Iteration methods

### 4. Set (`SetDemo.java`)
Demonstrates Set data structures with three implementations:
- **HashSet**: Unordered unique elements
- **LinkedHashSet**: Maintains insertion order
- **TreeSet**: Sorted unique elements

Operations demonstrated:
- Adding elements
- Removing elements
- Contains operation
- Set operations (union, intersection, difference)
- Iteration methods
- TreeSet-specific operations (first, last, higher, lower, ceiling, floor)

### 5. Map (`MapDemo.java`)
Demonstrates Map data structures with three implementations:
- **HashMap**: Unordered key-value pairs
- **LinkedHashMap**: Maintains insertion order
- **TreeMap**: Sorted by keys

Operations demonstrated:
- Put and get operations
- Contains operations (containsKey, containsValue)
- Remove operation
- Iteration methods (keySet, entrySet, values)
- Advanced operations (putIfAbsent, replace, compute, merge)
- TreeMap-specific operations (firstEntry, lastEntry, higherEntry, lowerEntry)

## How to Compile and Run

### Compile all programs:
```bash
cd Experiment1_Week1_2
javac LinkedListDemo.java
javac StackDemo.java
javac QueueDemo.java
javac SetDemo.java
javac MapDemo.java
```

### Run individual programs:
```bash
java LinkedListDemo
java StackDemo
java QueueDemo
java SetDemo
java MapDemo
```

### Or compile and run all at once:
```bash
javac *.java && java LinkedListDemo && java StackDemo && java QueueDemo && java SetDemo && java MapDemo
```

## Learning Outcomes
After running these programs, you will understand:
- How to use Java's built-in data structures
- Common operations and methods for each data structure
- Differences between various implementations (e.g., HashSet vs LinkedHashSet vs TreeSet)
- Practical use cases for each data structure
- Time complexity considerations for different operations

## Requirements
- Java Development Kit (JDK) 8 or higher
- Command line access or any Java IDE (Eclipse, IntelliJ IDEA, NetBeans, etc.)
