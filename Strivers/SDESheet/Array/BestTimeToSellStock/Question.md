
# Best Time to Buy and Sell Stock

## Problem Statement
Given an array where each element represents the price of a stock on a given day, find the maximum profit you can achieve by buying and selling once.

## Clarification
- You must buy before you sell.
- Return 0 if no profit is possible.

## Example
Input: `[7, 1, 5, 3, 6, 4]`
Output: `5` (Buy on day 2, sell on day 5)

## Approach
- Track the minimum price so far and calculate the profit at each step.

## Edge Cases
- If prices are always decreasing, return 0.
- If the array is empty or has one element, return 0.

## Implementation Notes
- The solution uses a single pass to track minimum price and maximum profit.

---

See `Solution.java` for implementation details.
