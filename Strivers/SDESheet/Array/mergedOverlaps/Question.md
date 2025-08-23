# Merge Overlapping Intervals

## Problem Statement
Given an array of intervals where `intervals[i] = [starti, endi]`, merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

**Constraints:**
1. 1 <= intervals.length <= 10⁴
2. intervals[i].length == 2
3. 0 <= starti <= endi <= 10⁴

## Examples

### Example 1
```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: 
- [1,3] and [2,6] overlap → merge to [1,6]
- [8,10] doesn't overlap with [1,6] → keep as is
- [15,18] doesn't overlap with any → keep as is
```

### Example 2
```
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: 
Intervals [1,4] and [4,5] are considered overlapping because they share end/start point
```

### Example 3
```
Input: intervals = [[1,4],[2,3]]
Output: [[1,4]]
Explanation: 
[2,3] is completely inside [1,4], so they merge into [1,4]
```

## Approach & Intuition

1. **Sort and Merge (Optimal)**
   ```java
   public int[][] merge(int[][] intervals) {
       // Sort intervals based on start time
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       List<int[]> merged = new ArrayList<>();
       
       for (int[] interval : intervals) {
           // If merged is empty or no overlap with last merged interval
           if (merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0]) {
               merged.add(interval);
           } else {
               // Merge with last interval in result
               merged.get(merged.size()-1)[1] = 
                   Math.max(merged.get(merged.size()-1)[1], interval[1]);
           }
       }
       
       return merged.toArray(new int[merged.size()][]);
   }
   ```

Key intuition:
1. Sort by start time to process intervals in order
2. If current interval starts after last merged interval ends → add new interval
3. Otherwise, extend last merged interval's end time if needed

2. **Graph-based Approach (Alternative)**
   ```java
   class Solution {
       private Map<int[], List<int[]>> buildGraph(int[][] intervals) {
           Map<int[], List<int[]>> graph = new HashMap<>();
           for (int[] interval : intervals) {
               graph.put(interval, new ArrayList<>());
           }
           
           for (int[] interval1 : intervals) {
               for (int[] interval2 : intervals) {
                   if (interval1 != interval2 && overlap(interval1, interval2)) {
                       graph.get(interval1).add(interval2);
                   }
               }
           }
           return graph;
       }
       
       private boolean overlap(int[] a, int[] b) {
           return Math.min(a[1], b[1]) >= Math.max(a[0], b[0]);
       }
       
       public int[][] merge(int[][] intervals) {
           Map<int[], List<int[]>> graph = buildGraph(intervals);
           Set<int[]> visited = new HashSet<>();
           List<int[]> merged = new ArrayList<>();
           
           for (int[] interval : intervals) {
               if (!visited.contains(interval)) {
                   visited.add(interval);
                   Stack<int[]> stack = new Stack<>();
                   stack.add(interval);
                   int[] component = new int[]{interval[0], interval[1]};
                   
                   while (!stack.isEmpty()) {
                       int[] current = stack.pop();
                       for (int[] neighbor : graph.get(current)) {
                           if (!visited.contains(neighbor)) {
                               visited.add(neighbor);
                               stack.add(neighbor);
                               component[0] = Math.min(component[0], neighbor[0]);
                               component[1] = Math.max(component[1], neighbor[1]);
                           }
                       }
                   }
                   merged.add(component);
               }
           }
           return merged.toArray(new int[merged.size()][]);
       }
   }
   ```

## Complexity Analysis

1. **Sort and Merge (Optimal)**
   - Time: O(n log n) 
     * Sorting takes O(n log n)
     * One pass through intervals takes O(n)
   - Space: O(n) for storing result
     * O(1) if we don't count output array
   - Best for most cases due to simplicity and efficiency

2. **Graph-based Approach**
   - Time: O(n²)
     * Building graph takes O(n²)
     * DFS takes O(V + E) = O(n + n²)
   - Space: O(n²)
     * Graph adjacency list takes O(n²)
     * Visited set takes O(n)
   - More complex but helps understand interval relationships

## Edge Cases
1. Empty array `[]`
2. Single interval `[[1,2]]`
3. No overlapping intervals `[[1,2],[4,5],[7,8]]`
4. All intervals overlapping `[[1,5],[2,3],[3,4]]`
5. Equal intervals `[[1,1],[1,1]]`
6. Maximum length intervals `[[0,10000],...]`
7. Intervals with same start time `[[1,4],[1,5]]`
8. Intervals with same end time `[[1,4],[2,4]]`
9. Touching intervals `[[1,2],[2,3],[3,4]]`
10. Completely contained intervals `[[1,10],[2,3],[4,5]]`

## Pattern Recognition
This problem relates to:
1. **Interval Problems**
   - Insert Interval
   - Meeting Rooms
   - Meeting Rooms II
   - Minimum Number of Arrows to Burst Balloons

2. **Sorting + Linear Pass**
   - Similar to merge sort merge step
   - Connected intervals form groups

3. **Graph Problems**
   - Connected components
   - Graph coloring
   - Interval graph representation

## Implementation Tips
1. **Sorting Comparator**
   ```java
   // Sort by start time
   Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
   
   // Alternative syntax
   Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
   ```

2. **Efficient Merging**
   ```java
   // Check for overlap
   if (lastEnd >= currentStart) {
       // Merge by extending end
       lastEnd = Math.max(lastEnd, currentEnd);
   }
   ```

## Common Templates
```java
// Template for interval merging problems
public int[][] mergeIntervals(int[][] intervals) {
    // 1. Sort by start time
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    List<int[]> merged = new ArrayList<>();
    
    for (int[] interval : intervals) {
        // 2. Check if we can merge with last interval
        if (merged.isEmpty() || 
            merged.get(merged.size()-1)[1] < interval[0]) {
            merged.add(interval);
        } else {
            // 3. Merge with last interval
            merged.get(merged.size()-1)[1] = 
                Math.max(merged.get(merged.size()-1)[1], interval[1]);
        }
    }
    
    return merged.toArray(new int[merged.size()][]);
}
```

## Related Problems
1. Insert Interval
2. Meeting Rooms
3. Meeting Rooms II
4. Non-overlapping Intervals
5. Minimum Number of Arrows to Burst Balloons
6. Car Pooling
7. Remove Covered Intervals
8. Interval List Intersections

## Common Mistakes
1. Not sorting intervals first
2. Wrong sorting criteria (end time vs start time)
3. Incorrect overlap check
4. Not handling empty input
5. Not handling single interval case
6. Modifying input array when not allowed
7. Wrong comparison in merging condition
8. Not updating merged interval end correctly
6. Intervals with same end time
7. One interval completely inside another
8. Adjacent intervals (end = start)
9. Negative intervals

## Pattern Recognition
Use this approach when:
- Dealing with interval overlapping
- Need to merge ranges
- Finding free time slots
- Similar problems:
  - Insert Interval
  - Meeting Rooms
  - Employee Free Time

## Implementation Tips
1. **Sorting Comparator**
   ```java
   // Sort by start time
   Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
   
   // For more robustness
   Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
   ```

2. **Overlap Check**
   ```java
   boolean isOverlapping(int[] i1, int[] i2) {
       return i1[1] >= i2[0] && i1[0] <= i2[1];
   }
   ```

3. **Merge Operation**
   ```java
   int[] merge(int[] i1, int[] i2) {
       return new int[]{
           Math.min(i1[0], i2[0]),
           Math.max(i1[1], i2[1])
       };
   }
   ```

## Common Templates
```java
// General interval merging template
public int[][] mergeIntervals(int[][] intervals) {
    if (intervals.length <= 1) return intervals;
    
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> result = new ArrayList<>();
    int[] current = intervals[0];
    result.add(current);
    
    for (int[] interval : intervals) {
        if (current[1] >= interval[0]) {
            current[1] = Math.max(current[1], interval[1]);
        } else {
            current = interval;
            result.add(current);
        }
    }
    
    return result.toArray(new int[result.size()][]);
}
```

## Related Problems
1. Insert Interval
2. Meeting Rooms II
3. Employee Free Time
4. Minimum Number of Arrows to Burst Balloons
5. Non-overlapping Intervals

## Common Mistakes
1. Not sorting intervals first
2. Wrong comparison for overlap
3. Not handling empty/single interval case
4. Incorrect merging of intervals
5. Not considering adjacent intervals
6. Integer overflow in comparator
7. Modifying input array directly

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

```
