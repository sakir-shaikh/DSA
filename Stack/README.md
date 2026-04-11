# Stack Problems

## Overview

Stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. This section covers various stack operations and common problem-solving patterns using stacks.

## Common Patterns

1. **Expression Evaluation**
   - Parentheses matching
   - Postfix evaluation
   - Infix to postfix
2. **Monotonic Stack**
   - Next greater element
   - Next smaller element
   - Histogram area
3. **Stack Operations**
   - Reversing elements
   - Sorting stack
   - Custom stack implementations
4. **Stack with Other DS**
   - Stack using queues
   - Min stack
   - Stack with getMin()

## Problem List

| Problem                          | Pattern          | Difficulty |
| -------------------------------- | ---------------- | ---------- |
| [Reverse Stack](./ReverseStack/) | Stack Operations | Medium     |

## Learning Path

1. Basic stack operations (push, pop, peek)
2. Expression problems
3. Monotonic stack problems
4. Advanced implementations

## Key Concepts

1. **Stack Properties**
   - LIFO principle
   - Top element access
   - O(1) operations
2. **Common Templates**

   ```java
   // Next Greater Element Template
   Stack<Integer> stack = new Stack<>();
   for (int i = 0; i < n; i++) {
       while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
           int index = stack.pop();
           result[index] = arr[i];
       }
       stack.push(i);
   }

   // Parentheses Matching Template
   Stack<Character> stack = new Stack<>();
   for (char c : s.toCharArray()) {
       if (c == '(' || c == '{' || c == '[') {
           stack.push(c);
       } else {
           if (stack.isEmpty()) return false;
           if (!isMatching(stack.pop(), c)) return false;
       }
   }
   ```

## Implementation Tips

1. Consider stack emptiness
2. Handle edge cases
3. Use auxiliary stacks when needed
4. Consider recursion for some problems
5. Time complexity analysis

## Applications

1. Function call management
2. Expression evaluation
3. Undo operations
4. Browser history
5. Syntax parsing

## Folder Structure

Each problem folder contains:

- `Question.md`: Problem statement, examples, approach
- `Solution.java`: Implementation with detailed comments
- `TestCases.md` (where applicable): Test scenarios
