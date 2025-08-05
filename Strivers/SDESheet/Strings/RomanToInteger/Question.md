# Roman to Integer

## Problem Statement

Given a Roman numeral, convert it to an integer. Roman numerals are usually written from largest to smallest left to right, but if a smaller value precedes a larger one, it is subtracted.

## Example

Input: "MCMXCIV"
Output: 1994
Explanation: M=1000, CM=900, XC=90, IV=4. Total = 1994.

## Approach

- Create a hashmap for symbol-to-value mapping.
- Traverse the string from left to right.
- If a character has a smaller value than the next one, subtract it; otherwise, add it.
- Handle the last character separately if needed.

## Edge Cases

- Input is an empty string.
- Input contains invalid Roman numerals.

## Complexity

- Time: O(n)
- Space: O(1)

## Implementation Notes

- Use a map for symbol values.
- Check for subtraction cases.

## References

- [LeetCode 13 - Roman to Integer](https://leetcode.com/problems/roman-to-integer/)
- Tags: String, Hash Map, Greedy, Simulation
