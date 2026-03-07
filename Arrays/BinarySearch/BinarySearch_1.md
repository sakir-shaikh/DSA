# BinarySearch

## Algorithm
# Binary Search Algorithm

## Description

Binary Search efficiently finds the position of a target value within a sorted array. It repeatedly divides the search interval in half.

## Pseudocode

```
function binarySearch(arr, target):
    left = 0
    right = arr.length - 1
    while left <= right:
        mid = left + (right - left) // 2
        if arr[mid] == target:
            return mid
        else if arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1
```

## Steps

1. Initialize left and right pointers.
2. While left <= right:
   - Calculate mid.
   - If arr[mid] == target, return mid.
   - If arr[mid] < target, search right half.
   - Else, search left half.
3. If not found, return -1.


## Examples
# Binary Search Examples

## Example 1

Input: arr = [1, 3, 5, 7, 9], target = 5
Output: 2
Explanation: 5 is at index 2.

## Example 2

Input: arr = [2, 4, 6, 8, 10], target = 7
Output: -1
Explanation: 7 is not present in the array.


## PatternRecognition
# Pattern Recognition: When to Use Binary Search

## How to Recognize Binary Search Problems

Binary Search is applicable when:

- The input is sorted or can be sorted
- You need to find an element, its position, or a boundary (first/last occurrence)
- The answer can be formulated as a search for a value (e.g., minimum, maximum, threshold)
- The problem asks for efficient search (O(log n))

## Common Patterns

- **Find an element in a sorted array**
- **Find the first/last occurrence of a value**
- **Search in a rotated sorted array**
- **Search for a value that satisfies a condition (e.g., smallest/largest possible value)**
- **Search in 2D matrix (matrix is sorted)**
- **Find lower/upper bounds**
- **Peak element in an array**
- **Allocate resources (e.g., minimum days, maximum capacity)**

## Typical Question Keywords

- "Find"
- "Search"
- "Minimum/Maximum"
- "First/Last occurrence"
- "Sorted"
- "Efficiently"
- "O(log n)"

## Example Interview Prompts

- "Given a sorted array, find if a target exists."
- "Find the first and last position of a target in a sorted array."
- "Given a sorted array, find the peak element."
- "Given a matrix where each row and column is sorted, search for a target."
- "Given an array of weights and days, find the minimum capacity to ship within days."

## How to Get the 'Click'

- Check if the input is sorted or can be sorted
- Ask: "Can I divide the problem into halves?"
- Look for monotonicity (does the answer space increase/decrease predictably?)
- If brute force is O(n), but you need O(log n), think binary search
- If you need to find a boundary, consider binary search

---

**Tip:** Practice recognizing these patterns in LeetCode/InterviewBit questions. Over time, you'll get the 'click' and instantly know when binary search applies!


## README
# Binary Search

## Overview

Binary Search is a fundamental algorithm for searching a sorted array in O(log n) time. It is widely used in real-life applications (search engines, databases, interview questions).

## Real-life Use Cases

- Finding an element in a sorted list
- Lower/upper bound problems
- Search in rotated sorted array
- Efficient search in large datasets

## Interview Relevance

Binary Search is a must-know for technical interviews. Variants are frequently asked (first/last occurrence, search in 2D matrix, etc.).

---

## Files

- `Algorithm.md`: Step-by-step explanation and pseudocode
- `Examples.md`: Worked examples
- `TestCases.md`: Sample test cases
- `Solution.java`: Java implementation


## TestCases
# Binary Search Test Cases

## Test Case 1

Input: arr = [1, 2, 3, 4, 5], target = 3
Expected Output: 2

## Test Case 2

Input: arr = [10, 20, 30, 40, 50], target = 10
Expected Output: 0

## Test Case 3

Input: arr = [10, 20, 30, 40, 50], target = 55
Expected Output: -1



