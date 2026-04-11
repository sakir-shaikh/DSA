# Pattern Recognition: When to Use Quick Sort

## How to Recognize Quick Sort Problems

- The problem requires sorting efficiently (O(n log n) average)
- You need in-place sorting
- The input is not guaranteed to be sorted or nearly sorted
- Partitioning is a key step

## Common Patterns

- **Sort an array efficiently in-place**
- **Find the kth largest/smallest element (QuickSelect)**
- **Problems involving partitioning**

## Typical Question Keywords

- "Sort"
- "Partition"
- "Kth largest/smallest"
- "In-place"
- "O(n log n)"

## Example Interview Prompts

- "Sort an array of integers in-place."
- "Find the kth largest element in an array."
- "Partition an array around a pivot."

## How to Get the 'Click'

- If the problem asks for in-place sorting, think Quick Sort
- If partitioning is mentioned, Quick Sort or QuickSelect may apply
- If you need to find order statistics efficiently, consider QuickSort/QuickSelect

---

**Tip:** Quick Sort is fast and in-place, but not stable. Practice partitioning problems to recognize when to use it!
