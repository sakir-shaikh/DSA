# Maximum Subarray Sum (Kadane's Algorithm)

## Problem Statement

Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum. A subarray is a contiguous part of an array.

## Examples

### Example 1

```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6
```

### Example 2

```
Input: nums = [1]
Output: 1
```

### Example 3

```
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: [5,4,-1,7,8] is the subarray with largest sum
```

## Approach & Intuition

1. **Kadane's Algorithm (Optimal)**

   ```java
   public int maxSubArray(int[] nums) {
       int maxSoFar = nums[0];
       int maxEndingHere = nums[0];

       for (int i = 1; i < nums.length; i++) {
           maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
           maxSoFar = Math.max(maxSoFar, maxEndingHere);
       }
       return maxSoFar;
   }
   ```

2. **Divide and Conquer**

   ```java
   private int maxCrossingSum(int[] nums, int left, int mid, int right) {
       int sum = 0;
       int leftSum = Integer.MIN_VALUE;
       for (int i = mid; i >= left; i--) {
           sum += nums[i];
           leftSum = Math.max(leftSum, sum);
       }

       sum = 0;
       int rightSum = Integer.MIN_VALUE;
       for (int i = mid + 1; i <= right; i++) {
           sum += nums[i];
           rightSum = Math.max(rightSum, sum);
       }

       return leftSum + rightSum;
   }
   ```

3. **Dynamic Programming Variation**
   ```java
   public int maxSubArray(int[] nums) {
       int[] dp = new int[nums.length];
       dp[0] = nums[0];
       int maxSum = dp[0];

       for (int i = 1; i < nums.length; i++) {
           dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
           maxSum = Math.max(maxSum, dp[i]);
       }
       return maxSum;
   }
   ```

## Complexity Analysis

1. Kadane's Algorithm:

   - Time: O(n)
   - Space: O(1)

2. Divide and Conquer:

   - Time: O(n log n)
   - Space: O(log n) due to recursion

3. Dynamic Programming:
   - Time: O(n)
   - Space: O(n)

## Edge Cases

1. Empty array
2. Single element array
3. All negative numbers
4. All positive numbers
5. Alternating positive/negative
6. Maximum sum at beginning
7. Maximum sum at end
8. Very large numbers (overflow)
9. Equal positive and negative numbers

## Pattern Recognition

Use this approach when:

- Finding maximum/minimum sum subarray
- Contiguous sequence problems
- Local vs global maximum problems
- Similar problems:
  - Maximum Product Subarray
  - Circular Array Maximum Sum
  - Maximum Sum Rectangle in 2D array

## Implementation Tips

1. **Initialize Properly**

   ```java
   // Don't initialize to 0 as all numbers might be negative
   int maxSoFar = nums[0];
   int maxEndingHere = nums[0];
   ```

2. **Handle Overflow**

   ```java
   // Use long for large numbers
   long maxEndingHere = nums[0];
   long maxSoFar = nums[0];
   ```

3. **Track Subarray (if needed)**
   ```java
   int start = 0, end = 0, s = 0;
   for (int i = 0; i < n; i++) {
       if (maxEndingHere < 0) {
           maxEndingHere = nums[i];
           s = i;
       } else {
           maxEndingHere += nums[i];
       }
       if (maxEndingHere > maxSoFar) {
           maxSoFar = maxEndingHere;
           start = s;
           end = i;
       }
   }
   ```

## Common Templates

```java
// Kadane's Algorithm Template
public int kadane(int[] arr) {
    int maxEndingHere = arr[0];
    int maxSoFar = arr[0];

    for (int i = 1; i < arr.length; i++) {
        maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }
    return maxSoFar;
}
```

## Related Problems

1. Maximum Product Subarray
2. Maximum Sum Circular Subarray
3. Maximum Absolute Sum of Any Subarray
4. Maximum Sum Rectangle in 2D Matrix
5. Longest Subarray with Sum K

## Common Mistakes

1. Wrong initialization of maximum values
2. Not handling all negative numbers
3. Incorrect handling of single element
4. Forgetting to update global maximum
5. Integer overflow for large numbers
6. Unnecessary complex solutions
