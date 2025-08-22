# Binary Search Problems

## Overview

Binary Search is a fundamental searching algorithm that works on sorted arrays by repeatedly dividing the search space in half. This section covers various applications and variations of binary search.

## Common Patterns

1. **Classic Binary Search**

   - Used in: Sorted array searching
   - Examples: Find element in sorted array

2. **Binary Search on Answer**

   - Used in: Optimization problems
   - Examples: Find Nth root of N

3. **Modified Binary Search**

   - Used in: Rotated arrays, mountain arrays
   - Examples: Search in rotated sorted array

4. **Matrix Binary Search**
   - Used in: 2D sorted matrices
   - Examples: Search in row-column sorted matrix

## Problem List

| Problem                                      | Pattern                 | Difficulty |
| -------------------------------------------- | ----------------------- | ---------- |
| [Find Nth Root of N](./FindNthRootOfN/)      | Binary Search on Answer | Medium     |
| [Search 2D Matrix](../Array/Search2DMatrix/) | Matrix Binary Search    | Medium     |

## Learning Path

1. Start with classic binary search
2. Learn search space modification
3. Practice predicate functions
4. Tackle matrix problems
5. Solve optimization problems

## Key Concepts

1. **Search Space**

   - Defining proper boundaries
   - Handling overflow
   - Inclusive vs exclusive bounds

2. **Termination Conditions**

   - Loop conditions
   - Edge cases
   - Infinite loop prevention

3. **Implementation Tips**

   ```java
   // Preferred template to avoid overflow
   int mid = left + (right - left) / 2;

   // For floating point precision
   double epsilon = 1e-6;
   while (right - left > epsilon) {
       // binary search code
   }
   ```

## Folder Structure

Each problem folder contains:

- `Question.md`: Problem statement, examples, approach
- `Solution.java`: Implementation with detailed comments
- `TestCases.md` (where applicable): Edge cases and test scenarios
