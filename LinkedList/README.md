# Linked List Problems

## Overview

Linked Lists are linear data structures where elements are stored in nodes, each pointing to the next node in the sequence. This section covers various linked list operations and problem-solving patterns.

## Common Patterns

1. **Two Pointer Technique**
   - Fast & Slow pointers
   - Multiple pointers
   - Floyd's Cycle Detection
2. **Reversal Problems**
   - Full reversal
   - Partial reversal
   - K-group reversal
3. **Modification Operations**

   - Node insertion/deletion
   - List merging
   - List manipulation

4. **Mathematical Operations**
   - Number addition
   - List arithmetic
   - Polynomial operations

## Problem List

| Problem                                                           | Pattern          | Difficulty |
| ----------------------------------------------------------------- | ---------------- | ---------- |
| [Add Numbers as LinkedList](./AddNumbersAsLinkedList/)            | Mathematical     | Medium     |
| [Find Middle](./FindMiddle/)                                      | Two Pointers     | Easy       |
| [Remove Nth Node From End](./RemoveNthNodeFromLast/)              | Two Pointers     | Medium     |
| [Reverse LinkedList](./ReverseLinkedList/)                        | Reversal         | Easy       |
| [Consecutive Ones](./LinkedListAndArray/ConsecutivesOnes/)        | Array Conversion | Medium     |
| [Remove Duplicates](./LinkedListAndArray/RemoveInplaceduplicate/) | Two Pointers     | Easy       |

## Learning Path

1. Basic operations (traversal, insertion, deletion)
2. Two pointer techniques
3. Reversal problems
4. Mathematical operations
5. Advanced modifications

## Key Concepts

1. **Node Structure**

   ```java
   class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
   }
   ```

2. **Common Templates**

   ```java
   // Two Pointer Template
   ListNode slow = head, fast = head;
   while (fast != null && fast.next != null) {
       slow = slow.next;
       fast = fast.next.next;
   }

   // Reversal Template
   ListNode prev = null, curr = head;
   while (curr != null) {
       ListNode next = curr.next;
       curr.next = prev;
       prev = curr;
       curr = next;
   }
   ```

3. **Edge Cases**
   - Empty list
   - Single node
   - Two nodes
   - Circular lists
   - Invalid inputs

## Implementation Tips

1. Always maintain proper links while modifying
2. Use dummy nodes for easier head modifications
3. Check for null pointers
4. Draw pointer movements for complex operations
5. Test with various list lengths

## Folder Structure

Each problem folder contains:

- `Question.md`: Problem statement, examples, approach
- `Solution.java`: Implementation with detailed comments
- `TestCases.md` (where applicable): Test scenarios
