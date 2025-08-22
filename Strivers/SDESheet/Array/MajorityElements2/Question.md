# Majority Elements II

## Problem Statement

Given an integer array `nums` of size n, find all elements that appear more than `⌊n/3⌋` times.

## Example

**Input:** nums = [3,2,3]  
**Output:** [3]

**Input:** nums = [1,2]  
**Output:** [1,2]

**Input:** nums = [1,1,1,3,3,2,2,2]  
**Output:** [1,2]

## Approach

1. Use a HashMap to store the frequency count of each element
2. Iterate through the array and update frequencies
3. Check for elements with frequency > n/3
4. Return list of majority elements

## Complexity Analysis

- Time Complexity: O(n) - single pass through array
- Space Complexity: O(n) - for storing frequencies in HashMap

## Pattern Recognition

- When asked to find elements appearing more than n/k times
- When multiple elements can be in the result
- Can also be solved using Boyer-Moore Voting Algorithm for O(1) space
- Similar to Majority Element I but with different threshold (n/3 vs n/2)

## Edge Cases

- Empty array
- Array with one element
- All elements appearing equal number of times
- No elements appearing more than n/3 times
- Maximum possible result size is 2 (since n/3 + n/3 + n/3 = n)
