# Best Time to Buy and Sell Stock

## Problem Statement

You are given an array `prices` where `prices[i]` is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.

## Examples

### Example 1

```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5
Note: Not 7-1 = 6, as selling price needs to be after buying price
```

### Example 2

```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: No profit is possible, so return 0
```

### Example 3

```
Input: prices = [2,4,1,7]
Output: 6
Explanation: Buy on day 3 (price = 1) and sell on day 4 (price = 7)
```

## Approach & Intuition

1. **One Pass Solution (Optimal)**

   ```java
   public int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE;
       int maxProfit = 0;

       for (int price : prices) {
           minPrice = Math.min(minPrice, price);
           maxProfit = Math.max(maxProfit, price - minPrice);
       }
       return maxProfit;
   }
   ```

2. **Peak Valley Approach**

   ```java
   public int maxProfit(int[] prices) {
       int valley = prices[0];
       int maxProfit = 0;

       for (int i = 1; i < prices.length; i++) {
           if (prices[i] < valley) {
               valley = prices[i];
           } else {
               maxProfit = Math.max(maxProfit, prices[i] - valley);
           }
       }
       return maxProfit;
   }
   ```

3. **Kadane's Algorithm Variation**
   ```java
   public int maxProfit(int[] prices) {
       int currProfit = 0;
       int maxProfit = 0;

       for (int i = 1; i < prices.length; i++) {
           currProfit = Math.max(0, currProfit + prices[i] - prices[i-1]);
           maxProfit = Math.max(maxProfit, currProfit);
       }
       return maxProfit;
   }
   ```

## Complexity Analysis

1. One Pass:

   - Time: O(n)
   - Space: O(1)

2. Peak Valley:

   - Time: O(n)
   - Space: O(1)

3. Kadane's:
   - Time: O(n)
   - Space: O(1)

## Edge Cases

1. Empty array
2. Array with one element
3. Continuously decreasing prices
4. Continuously increasing prices
5. Same price throughout
6. Price becomes zero
7. Very large price differences
8. Negative prices (if allowed)

## Pattern Recognition

Use this approach when:

- Finding max difference with constraints
- Future value dependent problems
- Similar problems:
  - Stock Problems with k transactions
  - Maximum difference problems
  - Local minima/maxima problems

## Implementation Tips

1. **Track Minimum**

   ```java
   int minSoFar = prices[0];
   for (int price : prices) {
       minSoFar = Math.min(minSoFar, price);
   }
   ```

2. **Calculate Profit**

   ```java
   // Always ensure selling price comes after buying price
   profit = sellingPrice - buyingPrice;
   ```

3. **Handle Edge Cases**
   ```java
   if (prices == null || prices.length < 2) return 0;
   ```

## Common Templates

```java
// General template for min/max tracking
public int solve(int[] arr) {
    int min = arr[0];
    int result = 0;

    for (int i = 1; i < arr.length; i++) {
        result = Math.max(result, arr[i] - min);
        min = Math.min(min, arr[i]);
    }
    return result;
}
```

## Related Problems

1. Best Time to Buy and Sell Stock II (multiple transactions)
2. Best Time to Buy and Sell Stock III (at most 2 transactions)
3. Best Time to Buy and Sell Stock IV (at most k transactions)
4. Best Time to Buy and Sell Stock with Cooldown
5. Maximum Difference Between Increasing Elements

## Common Mistakes

1. Not considering empty/single element arrays
2. Using wrong initial values for min/max
3. Comparing wrong day combinations
4. Not handling negative differences
5. Overcomplicated solutions
6. Not maintaining proper buy-sell order
