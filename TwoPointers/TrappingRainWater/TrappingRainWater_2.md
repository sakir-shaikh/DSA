# Trapping Rain Water (LeetCode 42)

## Problem Statement
Given `n` non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

**Constraints:**
- `n == height.length`
- `1 <= n <= 2 * 10^4`
- `0 <= height[i] <= 10^5`

## Approach & Intuition
The two-pointer approach is an efficient way to solve this problem by maintaining left and right pointers that move toward each other. We also keep track of the maximum heights encountered from the left and right sides.

1.  Initialize `left = 0`, `right = n - 1`.
2.  Initialize `maxLeft = 0`, `maxRight = 0`.
3.  Initialize `totalWater = 0`.
4.  While `left < right`:
    - If `height[left] < height[right]`:
        - This means the right side is tall enough to potentially trap water at the left position.
        - If `height[left] >= maxLeft`, update `maxLeft`.
        - Otherwise, add `maxLeft - height[left]` to `totalWater`.
        - Increment `left`.
    - Else:
        - This means the left side is tall enough to potentially trap water at the right position.
        - If `height[right] >= maxRight`, update `maxRight`.
        - Otherwise, add `maxRight - height[right]` to `totalWater`.
        - Decrement `right`.
5.  Return `totalWater`.

### Intuition
At any given index, the amount of water trapped is determined by the shorter of the two maximum heights (left and right) minus the current height: `water[i] = min(maxLeft[i], maxRight[i]) - height[i]`. The two-pointer approach avoids precalculating `maxLeft` and `maxRight` arrays by processing the smaller height first.

## Complexity Analysis
- **Time Complexity:** O(n) - We traverse the array once with two pointers.
- **Space Complexity:** O(1) - Only a few variables are used to store heights and the total water.

## Edge Cases
- **Array with less than 3 elements:** No water can be trapped. The code handles this naturally by returning 0.
- **Sorted array (ascending/descending):** No water can be trapped as there's no "valley."
- **Empty array:** Handled by the initial check, returns 0.
- **All same heights:** No water can be trapped.

## Common Mistakes
- **Incorrect pointer logic:** Moving the wrong pointer or updating the wrong maximum height.
- **Off-by-one errors:** Incorrect loop conditions or indexing.
- **Using extra space:** While O(n) space solutions (precalculating max arrays) are valid, the O(1) space two-pointer solution is preferred.
