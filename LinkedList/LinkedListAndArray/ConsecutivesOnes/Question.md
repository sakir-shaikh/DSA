# Maximum Consecutive Ones

## Problem Statement

Given a binary array nums, return the maximum number of consecutive 1's in the array. A binary array contains only 0's and 1's.

**Constraints:**

1. 1 ≤ nums.length ≤ 10⁵
2. nums[i] is either 0 or 1
3. Return value must be non-negative integer

## Examples

### Example 1

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation:
- First sequence: [1,1] length=2
- Second sequence: [1,1,1] length=3
- Maximum length is 3
```

### Example 2

```
Input: nums = [1,0,1,1,0,1]
Output: 2
Explanation:
- Three sequences: [1], [1,1], [1]
- Maximum length is 2
```

### Example 3

```
Input: nums = [0,0,0]
Output: 0
Explanation:
- No 1's in array
- Maximum length is 0
```

## Approach & Intuition

1. **Single Counter (Optimal)**

   ```java
   class Solution {
       public int findMaxConsecutiveOnes(int[] nums) {
           int maxCount = 0;
           int currentCount = 0;

           for (int num : nums) {
               if (num == 1) {
                   currentCount++;
                   maxCount = Math.max(maxCount, currentCount);
               } else {
                   currentCount = 0;
               }
           }

           return maxCount;
       }
   }
   ```

2. **Two Pointer Approach**
   ```java
   public int findMaxConsecutiveOnes(int[] nums) {
       int maxCount = 0;
       int left = 0;

       for (int right = 0; right < nums.length; right++) {
           if (nums[right] == 0) {
               maxCount = Math.max(maxCount, right - left);
               left = right + 1;
           }
       }

       return Math.max(maxCount, nums.length - left);
   }
   ```

## Complexity Analysis

1. **Single Counter Approach**

   - Time: O(n)
     - Single pass through array
   - Space: O(1)
     - Only two variables
   - Pros:
     - Simple implementation
     - Most efficient
   - Best for most cases

2. **Two Pointer Approach**
   - Time: O(n)
     - Single pass through array
   - Space: O(1)
     - Only three variables
   - Pros:
     - Works for variants
     - Flexible for modifications
   - Good for extended problems

## Edge Cases

1. Empty array (not possible per constraints)
2. Array of all zeros
3. Array of all ones
4. Single element array
5. Maximum length array
6. Alternating 0s and 1s
7. Single 1 in array
8. Single 0 in array
9. Multiple sequences of same length
10. Sequence at array boundaries

## Pattern Recognition

1. **Counter Patterns**

   - Reset on condition
   - Maximum tracking
   - Running count

2. **Window Patterns**

   - Sliding window
   - Two pointers
   - Window reset

3. **Sequence Properties**
   - Binary values
   - Consecutive elements
   - Maximum length

## Implementation Tips

1. **Counter Implementation**

   ```java
   int maxCount = 0;
   int currentCount = 0;

   // Increment and reset pattern
   for (int num : nums) {
       if (num == 1) currentCount++;
       else currentCount = 0;
       maxCount = Math.max(maxCount, currentCount);
   }
   ```

2. **Two Pointer Implementation**
   ```java
   int left = 0;
   for (int right = 0; right < nums.length; right++) {
       if (nums[right] == 0) {
           // Process window [left, right)
           left = right + 1;
       }
   }
   ```

## Common Templates

```java
// Template for consecutive element counting
public int countConsecutive(int[] arr, int target) {
    int maxCount = 0;
    int currentCount = 0;

    for (int num : arr) {
        if (num == target) {
            currentCount++;
            maxCount = Math.max(maxCount, currentCount);
        } else {
            currentCount = 0;
        }
    }

    return maxCount;
}
```

## Related Problems

1. Max Consecutive Ones II (with flips)
2. Max Consecutive Ones III
3. Longest Subarray of 1's After Deleting One Element
4. Count Binary Substrings
5. Number of Substrings with Only 1s
6. Longest Substring Without Repeating Characters
7. Contiguous Array
8. Maximum Subarray

## Common Mistakes

1. Not handling empty array
2. Wrong counter reset
3. Missing edge cases
4. Off-by-one errors
5. Not updating maximum
6. Incorrect initialization
7. Complex implementations
8. Unnecessary space usage
9. Wrong comparison
10. Not considering constraints
