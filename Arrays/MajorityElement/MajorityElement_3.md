# Majority Element

## Problem Statement

Given an array `nums` of size n, find the majority element. The majority element is the element that appears more than ⌊n/2⌋ times. You may assume that the majority element always exists in the array.

## Examples

### Example 1

```
Input: nums = [3,2,3]
Output: 3
```

### Example 2

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

## Approach & Intuition

1. **Boyer-Moore Voting Algorithm**

   - Initialize count = 0 and candidate
   - For each element:
     - If count = 0, pick current as candidate
     - If current = candidate, count++
     - Else count--
   - Final candidate is majority element

2. **Alternative Approaches**
   - HashMap counting (O(n) space)
   - Sorting and taking middle (O(nlogn) time)
   - Bit manipulation

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

## Edge Cases

1. Array with single element
2. All elements same
3. Majority element appearing exactly n/2+1 times
4. Elements in different orders
5. Negative numbers

## Pattern Recognition

Use this approach when:

- Finding element appearing > n/2 times
- Need O(1) space solution
- Similar problems: N/3 majority elements

## Implementation Tips

1. No need to verify final candidate (given majority exists)
2. Can be extended for different thresholds
3. Consider using long for count with large arrays
4. Handle negative numbers properly

## Common Templates

```java
// Boyer-Moore Voting Algorithm
int count = 0, candidate = 0;
for (int num : nums) {
    if (count == 0) {
        candidate = num;
    }
    count += (num == candidate) ? 1 : -1;
}
return candidate;
```

## Related Problems

1. Majority Element II (elements > n/3)
2. Mode in Binary Search Tree
3. Find Duplicate Number
4. Voting Algorithm applications

## Common Mistakes

1. Not handling negative numbers
2. Unnecessary verification phase
3. Using extra space unnecessarily
4. Wrong count comparison
