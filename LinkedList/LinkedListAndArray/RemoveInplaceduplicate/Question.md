# Remove Duplicates from Sorted Array

## Problem Statement

Given a sorted array nums, remove the duplicates in-place such that each element appears only once and return the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

**Constraints:**

1. 1 ≤ nums.length ≤ 3 \* 10⁴
2. -100 ≤ nums[i] ≤ 100
3. nums is sorted in non-decreasing order
4. Return k elements where k is the new length

## Examples

### Example 1

```
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation:
- Initial array: [1,1,2]
- First unique: 1 kept at index 0
- Second unique: 2 moved to index 1
- Return k=2 (length of [1,2])
- Note: _ indicates ignored element
```

### Example 2

```
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation:
- Five unique elements: 0,1,2,3,4
- Each moved to their respective positions
- Return k=5
```

### Example 3

```
Input: nums = [1]
Output: 1, nums = [1]
Explanation:
- Single element is always unique
- Return k=1
```

## Approach & Intuition

1. **Two Pointers (Optimal)**

   ```java
   class Solution {
       public int removeDuplicates(int[] nums) {
           if (nums.length == 0) return 0;

           int writePointer = 1;  // Start from second position

           // Read from second element
           for (int readPointer = 1; readPointer < nums.length; readPointer++) {
               // Found a new unique element
               if (nums[readPointer] != nums[readPointer-1]) {
                   nums[writePointer] = nums[readPointer];
                   writePointer++;
               }
           }

           return writePointer;
       }
   }
   ```

2. **Using HashSet (Not In-Place)**
   ```java
   public int removeDuplicatesUsingSet(int[] nums) {
       if (nums.length == 0) return 0;

       HashSet<Integer> seen = new HashSet<>();
       int writePointer = 0;

       for (int num : nums) {
           if (seen.add(num)) {  // Returns true if num is new
               nums[writePointer++] = num;
           }
       }

       return writePointer;
   }
   ```

## Complexity Analysis

1. **Two Pointers Approach**

   - Time: O(n)
     - Single pass through array
   - Space: O(1)
     - No extra space needed
   - Pros:
     - In-place modification
     - Maintains order
     - Most efficient
   - Best approach for this problem

2. **HashSet Approach**
   - Time: O(n)
     - Single pass through array
   - Space: O(n)
     - HashSet stores unique elements
   - Cons:
     - Not in-place
     - Extra space needed
   - Not recommended for this problem

## Edge Cases

1. Empty array
2. Single element array
3. All elements same
4. All elements unique
5. Maximum length array
6. Array with negative numbers
7. Array with zeros
8. Array with repeated sequences
9. Array with maximum allowed value
10. Array with minimum allowed value

## Pattern Recognition

1. **Two Pointer Patterns**

   - Write pointer (slow)
   - Read pointer (fast)
   - Gap between pointers

2. **In-Place Modifications**

   - Overwriting elements
   - Order preservation
   - Memory constraints

3. **Sorted Array Properties**
   - Duplicates are adjacent
   - Order is maintained
   - Binary search possible

## Implementation Tips

1. **Two Pointer Setup**

   ```java
   int writePointer = 1;  // Start from 1 for sorted array

   for (int readPointer = 1; readPointer < nums.length; readPointer++) {
       // Compare with previous element
       if (nums[readPointer] != nums[readPointer-1]) {
           // Found new unique element
       }
   }
   ```

2. **Efficient Comparison**
   ```java
   // Compare with last written element
   if (nums[readPointer] != nums[writePointer-1]) {
       nums[writePointer++] = nums[readPointer];
   }
   ```

## Common Templates

```java
// Template for in-place duplicate removal
public int removeDuplicates(int[] arr) {
    if (arr == null || arr.length == 0) return 0;

    int writeIndex = 1;

    for (int readIndex = 1; readIndex < arr.length; readIndex++) {
        if (arr[readIndex] != arr[writeIndex-1]) {
            arr[writeIndex++] = arr[readIndex];
        }
    }

    return writeIndex;
}
```

## Related Problems

1. Remove Duplicates from Sorted Array II
2. Remove Element
3. Move Zeroes
4. Remove Duplicates from Sorted List
5. Sort Colors
6. Array Partition
7. Merge Sorted Array
8. Remove All Adjacent Duplicates

## Common Mistakes

1. Not handling empty array
2. Wrong pointer initialization
3. Incorrect comparison
4. Not maintaining order
5. Unnecessary swaps
6. Wrong return value
7. Off-by-one errors
8. Modifying read elements
9. Inefficient space usage
10. Not considering constraints
