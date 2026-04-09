# Remove Element (13)

## Problem Statement
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` [in-place](https://en.wikipedia.org/wiki/In-place_algorithm). The order of the elements may be changed. Then return the number of elements in `nums` which are not equal to `val`.

Consider the number of elements in `nums` which are not equal to `val` be `k`, to get accepted, you need to do the following things:
1. Change the array `nums` such that the first `k` elements of `nums` contain the elements which are not equal to `val`. The remaining elements of `nums` are not important as well as the size of `nums`.
2. Return `k`.

**Constraints:**
- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`

## Approach & Intuition
The problem asks us to remove all occurrences of a specific value in-place and return the count of remaining elements. Since the order doesn't matter and we only need the first `k` elements to be correct, we can use a two-pointer approach (specifically, a read pointer and a write pointer).

### Step-by-Step Logic:
1. Initialize a pointer `k = 0`. This pointer will track the position where the next non-`val` element should be placed.
2. Iterate through the array using a loop variable `i` (the read pointer).
3. If the current element `nums[i]` is NOT equal to `val`:
   - Assign `nums[k] = nums[i]`.
   - Increment `k`.
4. After the loop, `k` will represent the number of elements not equal to `val`, and the first `k` elements of the array will be those elements.

### Intuition
By using `k` as the "write" index, we essentially pack all the non-target elements at the beginning of the array. Every time we encounter an element we want to keep, we move it to the next available slot at the front.

## Complexity Analysis
- **Time Complexity:** O(N) - We traverse the array exactly once, where N is the length of the array.
- **Space Complexity:** O(1) - No extra space is used as we modify the array in-place.

## Edge Cases
- **Empty array:** `nums.length == 0`. The loop won't run, and it will correctly return 0.
- **All elements match `val`:** `k` will never increment, returning 0.
- **No elements match `val`:** `k` will increment for every element, returning `nums.length`.
- **Single element array:** Works correctly whether it matches `val` or not.

## Common Mistakes
- **Creating a new array:** The problem specifically requires an in-place modification.
- **Incorrect indexing:** Forgetting to increment `k` only when a non-`val` element is found.
- **Overthinking the "remaining elements":** Some might try to "delete" or "nullify" the elements after index `k`, but the problem statement says they are not important.
