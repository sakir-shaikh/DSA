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
