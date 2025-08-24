# Best Time to Buy and Sell Stock

## Problem Statement

You are given an array `prices` where `prices[i]` is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.

**Constraints:**

1. 1 ≤ prices.length ≤ 10⁵
2. 0 ≤ prices[i] ≤ 10⁴
3. You must buy before you sell
4. You can only do one transaction

## Examples

### Example 1

```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation:
- Buy on day 2 (price = 1)
- Sell on day 5 (price = 6)
- Profit = 6 - 1 = 5
- Note: Cannot get profit 6 by buying at price 1 and selling at 7, as selling price needs to be after buying price
```

### Example 2

```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation:
- Prices are decreasing every day
- Best strategy is to not buy at all
- Return 0 as no profit is possible
```

### Example 3

```
Input: prices = [2,4,1,7]
Output: 6
Explanation:
- Buy on day 3 when price = 1
- Sell on day 4 when price = 7
- Maximum profit = 7 - 1 = 6
```

### Example 4

```
Input: prices = [3,3,3,3]
Output: 0
Explanation:
- All prices are same
- No profit possible as buying and selling at same price gives 0 profit
```

## Approach & Intuition

1. **One Pass Solution (Optimal)**

   ```java
   public int maxProfit(int[] prices) {
       if (prices == null || prices.length < 2) return 0;

       int minPrice = prices[0];
       int maxProfit = 0;

       for (int i = 1; i < prices.length; i++) {
           // If current price is less than min, update min
           minPrice = Math.min(minPrice, prices[i]);
           // Try to sell at current price
           maxProfit = Math.max(maxProfit, prices[i] - minPrice);
       }
       return maxProfit;
   }
   ```

   **Visual Example:**

   ```
   prices = [7,1,5,3,6,4]

   Day 1: price = 7
   minPrice = 7, maxProfit = 0

   Day 2: price = 1
   minPrice = 1, maxProfit = 0

   Day 3: price = 5
   minPrice = 1, maxProfit = 4 (5-1)

   Day 4: price = 3
   minPrice = 1, maxProfit = 4

   Day 5: price = 6
   minPrice = 1, maxProfit = 5 (6-1)

   Day 6: price = 4
   minPrice = 1, maxProfit = 5
   ```

2. **Peak Valley Approach**

   ```java
   public int maxProfit(int[] prices) {
       if (prices == null || prices.length < 2) return 0;

       int valley = prices[0];  // Potential buying point
       int maxProfit = 0;

       for (int i = 1; i < prices.length; i++) {
           // Found a new valley (potential buying point)
           if (prices[i] < valley) {
               valley = prices[i];
           }
           // Try selling at current price
           else {
               int currentProfit = prices[i] - valley;
               maxProfit = Math.max(maxProfit, currentProfit);
           }
       }
       return maxProfit;
   }
   ```

   **Key Insight:**

   - Valley = Local minimum (best buying point)
   - Peak = Local maximum (best selling point)
   - Keep track of lowest valley seen so far

3. **Kadane's Algorithm Variation**

   ```java
   public int maxProfit(int[] prices) {
       if (prices == null || prices.length < 2) return 0;

       int currProfit = 0;
       int maxProfit = 0;

       for (int i = 1; i < prices.length; i++) {
           // Calculate profit if we buy at previous price and sell at current
           int dailyProfit = prices[i] - prices[i-1];

           // Either start fresh or continue with previous profit
           currProfit = Math.max(0, currProfit + dailyProfit);

           // Update maximum profit if current is better
           maxProfit = Math.max(maxProfit, currProfit);
       }
       return maxProfit;
   }
   ```

   **Why it works:**

   - Convert to maximum subarray sum problem
   - dailyProfit represents price change
   - Positive sum means profitable period
   - Reset to 0 when cumulative profit becomes negative

## Complexity Analysis

1. **One Pass Solution (Optimal)**

   - Time: O(n)
     - Single pass through the array
     - Each operation (min, max) is O(1)
   - Space: O(1)
     - Only two variables used regardless of input size
   - Most efficient solution for this problem

2. **Peak Valley Approach**

   - Time: O(n)
     - Single pass through prices array
     - Each comparison is O(1)
   - Space: O(1)
     - Constant extra space used
   - Same complexity as One Pass but slightly more comparisons

3. **Kadane's Algorithm Variation**
   - Time: O(n)
     - One pass through array starting from index 1
     - Each iteration does constant work
   - Space: O(1)
     - Only tracking current and max profit
   - Useful when problem can be converted to maximum subarray sum

## Edge Cases

1. **Invalid Input**

   ```java
   if (prices == null || prices.length < 2) return 0;
   ```

   - Empty array → return 0
   - Single element array → return 0
   - Null input → return 0

2. **Special Price Patterns**

   ```
   Decreasing: [7,6,4,3,1] → 0
   Increasing: [1,2,3,4,5] → 4
   Flat: [3,3,3,3] → 0
   ```

3. **Price Extremes**

   ```
   All zeros: [0,0,0] → 0
   Maximum allowed: [0,10000] → 10000
   Single spike: [1,1000,1] → 999
   ```

4. **Buy-Sell Points**

   ```
   Buy-sell same day: Not allowed
   Multiple equal minimums: Take first occurrence
   Multiple equal maximums: Take first valid occurrence after buy
   ```

5. **Array Length Edge Cases**

   ```
   Two elements: Consider direct difference
   Maximum length (10⁵): Handle time limit
   ```

6. **Corner Cases**
   - Maximum profit possible (10⁴)
   - Price becomes zero after non-zero
   - Large price differences
   - Alternating prices [1,5,1,5,1,5]

## Pattern Recognition

This problem exhibits several important patterns:

1. **Minimum Element Tracking**

   - Similar to finding running minimum
   - Track best value seen so far
   - Examples:
     - Water Container Problem
     - Sliding Window Minimum

2. **Maximum Difference Problems**

   - Find largest gap between elements
   - Order matters (like stocks)
   - Examples:
     - Maximum Product Subarray
     - Best Time to Buy and Sell Stock series

3. **State Maintenance**
   - Keep track of optimal state
   - Update based on new information
   - Examples:
     - Maximum Subarray
     - Longest Increasing Subsequence

## Implementation Tips

1. **Efficient Minimum Tracking**

   ```java
   // Method 1: Direct comparison
   minPrice = Math.min(minPrice, currentPrice);

   // Method 2: Conditional update (slightly faster)
   if (currentPrice < minPrice) {
       minPrice = currentPrice;
   }
   ```

2. **Profit Calculation**

   ```java
   // Safe profit calculation
   public int calculateProfit(int buyPrice, int sellPrice) {
       if (buyPrice > sellPrice) return 0;
       return sellPrice - buyPrice;
   }
   ```

3. **Input Validation**
   ```java
   public int maxProfit(int[] prices) {
       // Null check
       if (prices == null) return 0;

       // Length check
       if (prices.length < 2) return 0;

       // Range check (if needed)
       for (int price : prices) {
           if (price < 0) throw new IllegalArgumentException("Negative prices not allowed");
       }

       // Main logic here
   }
   ```

## Common Templates

1. **Basic Stock Problem Template**

   ```java
   public int stockProblemTemplate(int[] prices) {
       if (prices == null || prices.length < 2) return 0;

       int minSoFar = prices[0];
       int maxProfit = 0;

       for (int i = 1; i < prices.length; i++) {
           // Try to sell at current price
           maxProfit = Math.max(maxProfit, prices[i] - minSoFar);
           // Update minimum if needed
           minSoFar = Math.min(minSoFar, prices[i]);
       }
       return maxProfit;
   }
   ```

2. **Dynamic Programming Template**
   ```java
   public int dpStockTemplate(int[] prices) {
       int n = prices.length;
       if (n < 2) return 0;

       int[] dp = new int[n];  // dp[i] = max profit up to day i
       int minPrice = prices[0];

       for (int i = 1; i < n; i++) {
           dp[i] = Math.max(dp[i-1], prices[i] - minPrice);
           minPrice = Math.min(minPrice, prices[i]);
       }
       return dp[n-1];
   }
   ```

## Related Problems

1. **Stock Series**

   - Best Time to Buy and Sell Stock II (multiple transactions)
   - Best Time to Buy and Sell Stock III (at most 2 transactions)
   - Best Time to Buy and Sell Stock IV (k transactions)
   - Best Time to Buy and Sell Stock with Cooldown
   - Best Time to Buy and Sell Stock with Transaction Fee

2. **Maximum Difference Problems**

   - Maximum Difference Between Increasing Elements
   - Maximum Product Subarray
   - Container With Most Water

3. **State Tracking Problems**
   - Maximum Subarray
   - Longest Increasing Subsequence
   - Maximum Product Subarray

## Common Mistakes

1. **Algorithm Mistakes**

   - Using sorting (changes order of days)
   - Using additional data structures unnecessarily
   - Overcomplicated solutions with nested loops

2. **Edge Case Mistakes**

   ```java
   // Wrong: Missing null check
   if (prices.length < 2) return 0;

   // Wrong: Bad initialization
   int minPrice = 0;  // Should be prices[0] or Integer.MAX_VALUE

   // Wrong: Invalid profit calculation
   profit = Math.max(price - minPrice, profit);  // Needs bounds check
   ```

3. **Logical Mistakes**

   - Buying and selling on same day
   - Not maintaining temporal order
   - Wrong comparison in profit calculation
   - Unnecessary sorting or preprocessing
   - Using maximum element instead of maximum profit

4. **Optimization Mistakes**
   - Using extra space when O(1) is possible
   - Unnecessary iterations
   - Not breaking early when possible
   - Complex data structures when simple variables suffice
