# Container With Most Water (LeetCode 11)

## Problem Statement
You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

**Constraints:**
- `n == height.length`
- `2 <= n <= 10^5`
- `0 <= height[i] <= 10^4`

## Approach & Intuition
The two-pointer approach is optimal for this problem. We start with two pointers at the extreme ends of the array. The distance between the pointers (the width of the container) is maximized at the start.

1.  Initialize `left` pointer at index 0 and `right` pointer at index `n-1`.
2.  Initialize `maxArea` as 0.
3.  While `left < right`:
    - Calculate the current area: `width = right - left`, `h = min(height[left], height[right])`, `area = width * h`.
    - Update `maxArea = max(maxArea, area)`.
    - To potentially find a larger area, we must find a taller line. Since the width only decreases as we move the pointers inward, we move the pointer that points to the shorter line.
    - If `height[left] < height[right]`, increment `left`.
    - Otherwise, decrement `right`.
4.  Return `maxArea`.

### Example Trace
`height = [1, 8, 6, 2, 5, 4, 8, 3, 7]`
- Initial: `left=0 (h=1), right=8 (h=7)`, `area = 8 * 1 = 8`, `maxArea=8`
- `1 < 7` -> `left++`
- `left=1 (h=8), right=8 (h=7)`, `area = 7 * 7 = 49`, `maxArea=49`
- ... continue ...

## Complexity Analysis
- **Time Complexity:** O(n) - Each element is visited at most once as pointers move toward each other.
- **Space Complexity:** O(1) - Constant space used for pointers and area variable.

## Edge Cases
- **Only Two Lines:** Minimum `n=2`. The pointers will move inward once, calculating the area between the two lines.
- **All Lines Same Height:** The max area will be the area between the two outermost lines.
- **Heights are zero:** Area will be 0.

## Common Mistakes
- **Brute Force:** Using two nested loops results in O(n^2), which is too slow for `n=10^5`.
- **Incorrect Pointer Movement:** Moving the pointer pointing to the taller line instead of the shorter one.
