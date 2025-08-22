# Roman to Integer

## Problem Statement

Convert a Roman numeral string to an integer. Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

```
Symbol       Value
I            1
V            5
X            10
L            50
C            100
D            500
M            1000
```

Special rules: When a smaller value appears before a larger value, it represents subtraction.

## Examples

### Example 1

```
Input: s = "III"
Output: 3
Explanation: Three ones = 3
```

### Example 2

```
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90, IV = 4
```

### Example 3

```
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V = 5, III = 3
```

## Approach & Intuition

1. **HashMap + Linear Traversal**

   ```java
   Map<Character, Integer> values = new HashMap<>();
   values.put('I', 1);
   values.put('V', 5);
   // ... other mappings

   int result = 0;
   for (int i = 0; i < s.length(); i++) {
       if (i + 1 < s.length() &&
           values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
           result -= values.get(s.charAt(i));
       } else {
           result += values.get(s.charAt(i));
       }
   }
   ```

2. **Switch Case + Linear Traversal**

   ```java
   int getValue(char c) {
       switch(c) {
           case 'I': return 1;
           case 'V': return 5;
           // ... other cases
       }
       return 0;
   }
   ```

3. **Array-based Mapping (Most Efficient)**
   ```java
   int[] values = new int[128];
   values['I'] = 1;
   values['V'] = 5;
   // ... other mappings
   ```

## Complexity Analysis

1. HashMap Approach:

   - Time: O(n)
   - Space: O(1) - fixed size map

2. Switch Case:

   - Time: O(n)
   - Space: O(1)

3. Array Mapping:
   - Time: O(n)
   - Space: O(1)

## Edge Cases

1. Single character ("I", "V", etc.)
2. Maximum value ("MMMCMXCIX" = 3999)
3. All subtractive combinations:
   - "IV" (4)
   - "IX" (9)
   - "XL" (40)
   - "XC" (90)
   - "CD" (400)
   - "CM" (900)
4. Repeated characters ("III", "XX")
5. Invalid Roman numerals (not part of problem)

## Pattern Recognition

Use this approach when:

- Converting from one number system to another
- Need to handle special cases in sequence
- Similar problems:
  - Integer to Roman
  - Base conversion problems
  - Pattern matching with rules

## Implementation Tips

1. **Value Mapping**

   ```java
   // Array-based mapping (fastest)
   int[] values = new int[128];
   values['I'] = 1;
   values['V'] = 5;
   values['X'] = 10;
   values['L'] = 50;
   values['C'] = 100;
   values['D'] = 500;
   values['M'] = 1000;
   ```

2. **Subtraction Rules**

   - I can be placed before V (5) and X (10)
   - X can be placed before L (50) and C (100)
   - C can be placed before D (500) and M (1000)

3. **Early Termination**
   ```java
   if (s.length() == 1) return values[s.charAt(0)];
   ```

## Common Templates

```java
// General template for symbol conversion
public int convert(String s) {
    int[] values = new int[128];
    // Initialize values

    int result = 0;
    int prev = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
        int curr = values[s.charAt(i)];
        if (curr >= prev) {
            result += curr;
        } else {
            result -= curr;
        }
        prev = curr;
    }
    return result;
}
```

## Related Problems

1. Integer to Roman
2. Basic Calculator
3. String to Integer (atoi)
4. Valid Number

## Common Mistakes

1. Not handling subtraction cases
2. Incorrect handling of repeated symbols
3. Over-complicating the solution
4. Not using efficient data structures
5. Missing special cases validation
