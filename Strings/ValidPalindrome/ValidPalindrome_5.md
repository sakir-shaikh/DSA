# Valid Palindrome

## Problem Statement
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

### Constraints
- `1 <= s.length <= 2 * 10^5`
- `s` consists only of printable ASCII characters.

## Approach & Intuition
The problem can be solved efficiently using the Two-Pointer approach.

1.  **Initialize Pointers:** Set two pointers, `left` at the start of the string (0) and `right` at the end (`s.length() - 1`).
2.  **Iterate and Compare:**
    - Move `left` pointer forward if the current character is not alphanumeric.
    - Move `right` pointer backward if the current character is not alphanumeric.
    - If both characters at `left` and `right` are alphanumeric, compare them after converting to lowercase.
    - If they don't match, return `false`.
    - If they match, increment `left` and decrement `right`.
3.  **Completion:** If the pointers meet or cross without finding a mismatch, the string is a palindrome. Return `true`.

## Complexity Analysis
- **Time Complexity:** `O(n)`, where `n` is the length of the string. We traverse the string at most once.
- **Space Complexity:** `O(1)`, as we only use a few extra variables for pointers and character comparisons.

## Edge Cases
- **Empty or Space-only String:** Should return `true` after removing non-alphanumeric characters.
- **String with Only Special Characters:** Should return `true`.
- **Palindrome with Mixed Case and Punctuation:** Handled correctly by skipping non-alphanumeric and case conversion.

## Common Mistakes
- **Not Handling Case Sensitivity:** Always convert to lowercase (or uppercase) before comparing.
- **Incorrect Alphanumeric Check:** Forgetting to handle digits or including spaces by mistake.
- **Off-by-one Errors:** Careful with pointer initialization and boundaries.
