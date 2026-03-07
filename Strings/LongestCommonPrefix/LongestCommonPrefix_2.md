# Longest Common Prefix

## Problem Statement

Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "". All given strings consist of lowercase English letters.

## Examples

### Example 1

```
Input: strs = ["flower", "flow", "flight"]
Output: "fl"
Explanation: "fl" is the longest prefix common to all strings
```

### Example 2

```
Input: strs = ["dog", "racecar", "car"]
Output: ""
Explanation: No common prefix exists
```

### Example 3

```
Input: strs = ["interspecies", "interstellar", "interstate"]
Output: "inters"
```

## Approach & Intuition

There are four main approaches:

1. **Horizontal Scanning**

   ```java
   String prefix = strs[0];
   for (int i = 1; i < strs.length; i++) {
       while (strs[i].indexOf(prefix) != 0) {
           prefix = prefix.substring(0, prefix.length() - 1);
           if (prefix.isEmpty()) return "";
       }
   }
   return prefix;
   ```

2. **Vertical Scanning**

   ```java
   for (int i = 0; i < strs[0].length(); i++) {
       char c = strs[0].charAt(i);
       for (int j = 1; j < strs.length; j++) {
           if (i >= strs[j].length() || strs[j].charAt(i) != c) {
               return strs[0].substring(0, i);
           }
       }
   }
   return strs[0];
   ```

3. **Sorting Based (Most Efficient)**

   ```java
   Arrays.sort(strs);
   String first = strs[0];
   String last = strs[strs.length - 1];
   int i = 0;
   while (i < first.length() && i < last.length() &&
          first.charAt(i) == last.charAt(i)) {
       i++;
   }
   return first.substring(0, i);
   ```

4. **Divide and Conquer**
   - Split array into two halves
   - Find LCP of each half
   - Merge results

## Complexity Analysis

1. Horizontal Scanning:

   - Time: O(S), where S is sum of all characters
   - Space: O(1)

2. Vertical Scanning:

   - Time: O(S)
   - Space: O(1)

3. Sorting Based:

   - Time: O(NlogN \* M), where N is number of strings, M is max string length
   - Space: O(1)

4. Divide and Conquer:
   - Time: O(S)
   - Space: O(mlogn) due to recursion

## Edge Cases

1. Empty array
2. Array with single string
3. No common prefix
4. All strings same
5. Strings of varying lengths
6. Empty strings in array
7. Very long strings
8. Unicode characters

## Pattern Recognition

Use this approach when:

- Finding common starting substring
- Prefix matching problems
- Dictionary prefix problems
- Similar problems:
  - Longest Common Substring
  - Trie implementation
  - Auto-complete features

## Implementation Tips

1. Start with shortest string comparison
2. Use early termination
3. Consider StringBuilder for result
4. Handle null inputs
5. Choose approach based on input:
   - Few long strings → Horizontal
   - Many short strings → Vertical
   - General case → Sorting based

## Common Templates

```java
// Binary Search approach
private String commonPrefix(String left, String right) {
    int min = Math.min(left.length(), right.length());
    for (int i = 0; i < min; i++) {
        if (left.charAt(i) != right.charAt(i))
            return left.substring(0, i);
    }
    return left.substring(0, min);
}
```

## Related Problems

1. Implement Trie (Prefix Tree)
2. Add and Search Word
3. Design Search Autocomplete System
4. String Matching in Array

## Common Mistakes

1. Not handling empty array
2. Incorrect comparison of string lengths
3. Not considering empty strings
4. Inefficient string concatenation
5. Not handling Unicode properly

0
le
textstrs[i].length
le200

strs[i] consists of lowercase English letters.

Solution Approach (Sorting-Based)
The provided solution utilizes a clever approach that leverages lexicographical sorting to efficiently find the longest common prefix.

The core idea is as follows:
When an array of strings is sorted lexicographically, the longest common prefix of the entire array must be the common prefix of the first and the last string in the sorted array.

Let's break down why this works:

Sorting: By sorting the array, we ensure that the string with the lexicographically smallest prefix is at the beginning (strs[0]), and the string with the lexicographically largest prefix is at the end (strs[strs.length - 1]).

Convergence: Any character that is part of the common prefix of all strings must necessarily be present at the same position in both the first and the last string after sorting. If a character differs between strs[0] and strs[strs.length - 1] at a certain index, then no string in the array (including those in between strs[0] and strs[strs.length - 1]) can have a common prefix extending beyond that point. Conversely, if strs[0] and strs[strs.length - 1] share a common prefix, all strings lying lexicographically between them must also share that same prefix.

Algorithm Steps:
Handle Edge Cases: If the input array strs contains zero or one string, directly return the first (or only) string. (Note: The provided code handles strs.length <= 1 by returning strs[0]. For an empty array, strs[0] would cause an error. Assuming strs.length >= 1 based on typical problem constraints.)

Sort the Array: Sort the entire strs array lexicographically.

Identify Extremes: Get the first string (strs[0]) and the last string (strs[strs.length - 1]) from the sorted array.

Compare Characters: Iterate through the characters of the first string (or the shorter of the two) from left to right.

Build Prefix: Append characters to a StringBuilder as long as the characters at the current index in both the first and last strings match.

Stop on Mismatch: If a mismatch is found or the end of the shorter string is reached, stop the comparison.

Return Result: Convert the StringBuilder content to a String and return it.

Provided Solution Code
class Solution {
public String longestCommonPrefix(String[] strs) {
// Handle edge case: if the array has 0 or 1 string.
// If strs.length is 0, accessing strs[0] would throw an error.
// Assuming problem constraints guarantee at least one string (strs.length >= 1).
// If strs.length is 1, the string itself is the longest common prefix.
if (strs.length <= 1) {
return new StringBuilder().append(strs[0]).toString();
}

        // Sort the array of strings lexicographically.
        // After sorting, the strings with the smallest and largest prefixes
        // will be at the beginning and end of the array, respectively.
        Arrays.sort(strs);

        // Initialize a StringBuilder to build the common prefix.
        StringBuilder sb = new StringBuilder();

        // Get the first and last strings from the sorted array.
        // The longest common prefix of the entire array must be the
        // common prefix of these two extreme strings.
        String last = strs[strs.length - 1];
        String first = strs[0];

        // Iterate through the characters, comparing the first and last strings.
        // The loop runs up to the length of the first string (which is guaranteed
        // to be at least as long as the common prefix).
        int i = 0;
        while (i < first.length()) {
            // If characters at the current index do not match,
            // it means we've found the end of the common prefix.
            if (first.charAt(i) != last.charAt(i)) {
                break; // Exit the loop
            }
            // If characters match, append the character to the StringBuilder.
            sb.append(first.charAt(i));
            i++; // Move to the next character
        }

        // Convert the StringBuilder content to a String and return it.
        return sb.toString();
    }

}

Complexity Analysis
Time Complexity:

Sorting: The Arrays.sort(strs) operation takes O(N
cdotL
cdot
logN) time, where N is the number of strings in the array and L is the average length of the strings (or maximum length, depending on the specific sorting algorithm's comparison behavior for strings). String comparisons take O(L) time.

Comparison: The while loop iterates at most L_min times, where L_min is the length of the shortest string in the array. In each iteration, it performs a constant number of character comparisons and appends. So, this part takes O(L_min) time.

Overall: The dominant factor is the sorting step. Therefore, the total time complexity is O(N
cdotL
cdot
logN).

Space Complexity:

Sorting: The space complexity for Arrays.sort on objects in Java depends on the implementation. It might use O(N) auxiliary space for object references or O(
logN) for quicksort-like implementations. If string copies are made during sorting, it could be O(N
cdotL).

StringBuilder: The StringBuilder stores the longest common prefix, which can be at most L_min characters long. So, it uses O(L_min) space.

Overall: The space complexity is primarily determined by the sorting algorithm's auxiliary space requirements and the StringBuilder, resulting in O(L_min) or potentially O(N
cdotL) depending on the sort's internal workings.
