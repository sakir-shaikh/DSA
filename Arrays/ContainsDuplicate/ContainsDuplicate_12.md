# Contains Duplicate

## Problem Statement
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

### Example 1:
- Input: `nums = [1, 2, 3, 1]`
- Output: `true`

### Example 2:
- Input: `nums = [1, 2, 3, 4]`
- Output: `false`

### Example 3:
- Input: `nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]`
- Output: `true`

### Constraints:
- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

## Approach & Intuition
The problem asks us to detect if there are any duplicate elements in the array. A common and efficient way to do this is by using a `HashSet`.

1.  Initialize an empty `HashSet` of integers.
2.  Iterate through each element `i` in the array `nums`.
3.  For each element, try to add it to the `HashSet`.
    - If `set.add(i)` returns `false`, it means the element already exists in the set, thus we have found a duplicate. Return `true`.
4.  If the loop finishes without finding any duplicates, return `false`.

## Complexity Analysis
- **Time Complexity:** O(N), where N is the length of the array. We traverse the array once, and `HashSet` operations (add/contains) are O(1) on average.
- **Space Complexity:** O(N) in the worst case where all elements are distinct and we store all of them in the `HashSet`.

## Edge Cases
- **Single element array:** Should return `false` as there can be no duplicates.
- **Array with all same elements:** Should return `true`.
- **Large elements:** Handles values up to `10^9` using `Integer` objects in the set.

## Common Mistakes
- **Using a nested loop:** O(N^2) time complexity, which might lead to Time Limit Exceeded for large inputs.
- **Sorting first:** O(N log N) time complexity, which is better than O(N^2) but worse than O(N) using a `HashSet`.
