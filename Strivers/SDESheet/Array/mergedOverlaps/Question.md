```markdown
# LeetCode 56 - Merge Intervals

🔗 [Problem Link](https://leetcode.com/problems/merge-intervals/)

---

## 🧠 Problem Statement

Given an array of intervals where `intervals[i] = [start_i, end_i]`, merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

---

## ✅ Approach

1. Sort the intervals based on starting points.
2. Initialize a result list.
3. Traverse the intervals:
   - If the result is empty or current interval does not overlap with the last, add it.
   - Otherwise, merge it with the last interval in result.

**Complexity:** `O(n log n)` time due to sorting, `O(n)` space for the result.

---

## 📘 Example

**Input:**
```

\[\[1,3],\[2,6],\[8,10],\[15,18]]

```

**Output:**
```

\[\[1,6],\[8,10],\[15,18]]

```

---

## 🔁 Tags

`Array` `Sorting` `Greedy` `Intervals`
```
