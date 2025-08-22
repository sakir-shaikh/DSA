# Array Problems

## Overview

Arrays are fundamental data structures that store elements in contiguous memory locations. This section covers various array manipulation techniques and patterns.

## Common Patterns

1. **Two Pointers**

   - Used in: Sorted array problems, Dutch flag
   - Examples: Sort Colors, Remove Duplicates

2. **Sliding Window**

   - Used in: Subarrays, consecutive elements
   - Examples: Max Subarray, Best Time to Buy Sell Stock

3. **Kadane's Algorithm**

   - Used in: Maximum sum problems
   - Examples: Maximum Subarray Sum

4. **Matrix Traversal**

   - Used in: 2D array problems
   - Examples: Set Matrix Zeros, Search 2D Matrix

5. **Frequency Counter**
   - Used in: Element counting, duplicates
   - Examples: Majority Element, Find Duplicate

## Problem List

| Problem                                               | Pattern            | Difficulty |
| ----------------------------------------------------- | ------------------ | ---------- |
| [Best Time to Buy Sell Stock](./BestTimeToSellStock/) | Sliding Window     | Easy       |
| [Find Duplicate](./FoundDuplicate/)                   | Floyd's Cycle      | Medium     |
| [Majority Element](./MajorityElement/)                | Boyer-Moore        | Easy       |
| [Maximum Subarray](./MaxSubArray/)                    | Kadane's Algorithm | Medium     |
| [Merged Intervals](./mergedOverlaps/)                 | Sorting            | Medium     |
| [Search 2D Matrix](./Search2DMatrix/)                 | Binary Search      | Medium     |
| [Set Matrix Zeros](./setMatrixZeros/)                 | Matrix Traversal   | Medium     |
| [Sort Colors](./sortcolor/)                           | Dutch Flag         | Medium     |

## Learning Path

1. Start with single array problems
2. Move to two-pointer techniques
3. Learn window-based problems
4. Practice matrix problems
5. Tackle complex combinations

## Key Concepts

1. Array Indexing and Memory
2. In-place Modifications
3. Space-Time Tradeoffs
4. Sorting Techniques
5. Search Algorithms

## Folder Structure

Each problem folder contains:

- `Question.md`: Problem statement, examples, approach, edge cases, complexity, references
- `Solution.java`: Implementation with detailed comments
- `TestCases.md` (where applicable): Comprehensive test cases
