```markdown

# Merged Overlapping Intervals

## Problem Statement
Given a collection of intervals, merge all overlapping intervals.

## Clarification
- Intervals are represented as pairs `[start, end]`.
- Intervals may not be sorted initially.

## Example
Input: `[[1,3],[2,6],[8,10],[15,18]]`
Output: `[[1,6],[8,10],[15,18]]`

## Approach
- Sort intervals by start time, then merge overlapping intervals.

## Edge Cases
- If there are no intervals, return an empty list.
- If intervals do not overlap, return them as is.

## Implementation Notes
- The solution sorts the intervals and merges them in a single pass.

---

See `Solution.java` for implementation details.

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
