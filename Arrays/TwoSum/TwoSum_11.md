# Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

**Constraints:**
- 2 ≤ nums.length ≤ 10⁴
- -10⁹ ≤ nums[i] ≤ 10⁹
- -10⁹ ≤ target ≤ 10⁹
- Only one valid answer exists.

## Examples

### Example 1
```text
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

### Example 2
```text
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

### Example 3
```text
Input: nums = [3,3], target = 6
Output: [0,1]
```

## Approach & Intuition

1. **Hash Map Approach (One-Pass)**
   Instead of using nested loops (O(n²)), we use a hash map to store the values we have seen so far and their indices. For each number `nums[i]`, we check if `target - nums[i]` already exists in the map. If it does, we have found our pair.

   ```java
   public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if (map.containsKey(complement)) {
               return new int[] { map.get(complement), i };
           }
           map.put(nums[i], i);
       }
       return new int[] {};
   }
   ```

## Complexity Analysis

- **Time Complexity:** O(n)
  We traverse the list containing `n` elements only once. Each lookup in the table costs only O(1) time.
- **Space Complexity:** O(n)
  The extra space required depends on the number of items stored in the hash map, which stores at most `n` elements.

## Edge Cases
- **Negative Numbers:** The hash map approach works fine with negative numbers.
- **Large Targets:** Handles large integer values within the constraints.
- **Duplicates:** Correctly handles duplicate values as it stores the index of the first occurrence and searches as it goes.
