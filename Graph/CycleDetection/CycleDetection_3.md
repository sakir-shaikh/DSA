# CycleDetection

## Algorithm
# Cycle Detection Algorithms

## Description

Cycle detection can be performed in graphs (DFS, BFS) and linked lists (Floyd’s Tortoise and Hare).

## Pseudocode (Linked List)

```
function hasCycle(head):
    slow = head
    fast = head
    while fast != null and fast.next != null:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return true
    return false
```

## Steps

1. Use two pointers (slow and fast) for linked lists.
2. Use DFS/BFS for graphs, marking visited nodes.


## Examples
# Cycle Detection Examples

## Example 1: Linked List Cycle

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle linking node -4 to node 2.

## Example 2: Directed Graph Cycle

Input: Graph = {0: [1], 1: [2], 2: [0]}
Output: true
Explanation: There is a cycle 0 → 1 → 2 → 0.


## PatternRecognition
# Pattern Recognition: When to Use Cycle Detection

## How to Recognize Cycle Detection Problems

- The problem involves graphs or linked lists
- You need to check for infinite loops or repeated nodes
- The problem asks for deadlock or dependency resolution

## Common Patterns

- **Detect cycle in linked list**
- **Detect cycle in directed/undirected graph**
- **Deadlock detection**

## Typical Question Keywords

- "Cycle"
- "Loop"
- "Repeated"
- "Deadlock"
- "Dependency"

## Example Interview Prompts

- "Detect a cycle in a linked list."
- "Check if a directed graph has a cycle."
- "Detect deadlock in a system."

## How to Get the 'Click'

- If the problem involves repeated nodes or infinite loops, think cycle detection
- If the problem is about dependencies or deadlocks, cycle detection applies

---

**Tip:** Practice cycle detection on graphs and linked lists to recognize these patterns quickly!


## README
# Cycle Detection

## Overview

Cycle detection is used to determine if a cycle exists in a graph or linked list. It is crucial for avoiding infinite loops and for many graph algorithms.

## Real-life Use Cases

- Detecting infinite loops in linked lists
- Deadlock detection in operating systems
- Checking for cycles in dependency graphs

## Interview Relevance

Cycle detection is common in interviews for graph and linked list problems.

---

## Files

- `Algorithm.md`: Step-by-step explanation and pseudocode
- `PatternRecognition.md`: How to spot cycle detection problems
- `Examples.md`: Worked examples
- `TestCases.md`: Sample test cases
- `Solution.java`: Java implementation


## TestCases
# Cycle Detection Test Cases

## Test Case 1: Linked List

Input: head = [1,2,3,4,2] (cycle at node 2)
Expected Output: true

## Test Case 2: Directed Graph

Input: Graph = {0: [1], 1: [2], 2: [0]}
Expected Output: true

## Test Case 3: Undirected Graph

Input: Graph = {0: [1], 1: [0,2], 2: [1]}
Expected Output: false



