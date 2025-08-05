# Valid Anagram

## Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

## Example

Input: s = "anagram", t = "nagaram"
Output: true
Explanation: Both strings contain the same characters in any order.

## Approach

- Convert both strings to character arrays.
- Sort them and compare the sorted versions.
- If they're equal, `t` is an anagram of `s`.

## Edge Cases

- Strings are empty.
- Strings have different lengths.

## Complexity

- Time: O(n log n) due to sorting.
- Space: O(n) for the sorted arrays.

## Implementation Notes

- Can also use a hash map for counting characters.

## References

- [LeetCode 242 - Valid Anagram](https://leetcode.com/problems/valid-anagram/)
- Tags: String, Sorting, Hashing
