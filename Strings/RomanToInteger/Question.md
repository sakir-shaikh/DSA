# Roman to Integer

## Problem Statement

Convert a given Roman numeral string into an integer. Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M.

```
Symbol    Value    Subtraction Cases
I         1        IV (4), IX (9)
V         5        -
X         10       XL (40), XC (90)
L         50       -
C         100      CD (400), CM (900)
D         500      -
M         1000     -
```

**Constraints:**

1. 1 ≤ s.length ≤ 15
2. s contains only valid Roman numerals [I,V,X,L,C,D,M]
3. s is guaranteed to be a valid roman numeral in range [1, 3999]
4. Answer must be in the range [1, 3999]

## Examples

### Example 1

```
Input: s = "III"
Output: 3
Explanation:
I = 1
II = 1 + 1
III = 1 + 1 + 1
```

### Example 2

```
Input: s = "MCMXCIV"
Output: 1994
Explanation:
M = 1000
CM = 900 (1000 - 100)
XC = 90 (100 - 10)
IV = 4 (5 - 1)
Total = 1000 + 900 + 90 + 4
```

### Example 3

```
Input: s = "IX"
Output: 9
Explanation:
- When I comes before X, subtract:
- IX = X - I = 10 - 1 = 9
```

## Approach & Intuition

1. **Array-based Mapping (Optimal)**

   ```java
   class Solution {
       public int romanToInt(String s) {
           // Direct access array for O(1) lookups
           int[] values = new int[128];
           values['I'] = 1;
           values['V'] = 5;
           values['X'] = 10;
           values['L'] = 50;
           values['C'] = 100;
           values['D'] = 500;
           values['M'] = 1000;

           int sum = 0;
           int prev = 0;

           // Process right to left
           for (int i = s.length() - 1; i >= 0; i--) {
               int curr = values[s.charAt(i)];
               if (curr >= prev) {
                   sum += curr;
               } else {
                   sum -= curr;  // Subtraction case
               }
               prev = curr;
           }

           return sum;
       }
   }
   ```

2. **HashMap Approach**

   ```java
   class Solution {
       public int romanToInt(String s) {
           Map<Character, Integer> values = new HashMap<>();
           values.put('I', 1);
           values.put('V', 5);
           values.put('X', 10);
           values.put('L', 50);
           values.put('C', 100);
           values.put('D', 500);
           values.put('M', 1000);

           int result = 0;

           for (int i = 0; i < s.length(); i++) {
               if (i + 1 < s.length() &&
                   values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                   result -= values.get(s.charAt(i));
               } else {
                   result += values.get(s.charAt(i));
               }
           }

           return result;
       }
   }
   ```

3. **Switch-Case Approach**
   ```java
   class Solution {
       public int romanToInt(String s) {
           int result = 0;

           for (int i = 0; i < s.length(); i++) {
               int curr = getValue(s.charAt(i));
               if (i + 1 < s.length() && curr < getValue(s.charAt(i + 1))) {
                   result -= curr;
               } else {
                   result += curr;
               }
           }

           return result;
       }

       private int getValue(char c) {
           switch(c) {
               case 'I': return 1;
               case 'V': return 5;
               case 'X': return 10;
               case 'L': return 50;
               case 'C': return 100;
               case 'D': return 500;
               case 'M': return 1000;
               default: return 0;
           }
       }
   }
   ```

## Complexity Analysis

1. **Array-based Approach (Optimal)**

   - Time: O(n)
     - Single pass through string
     - O(1) lookup in array
   - Space: O(1)
     - Fixed size array (128)
   - Pros:
     - Fastest lookups
     - Most memory efficient
     - Best for most cases

2. **HashMap Approach**

   - Time: O(n)
     - Single pass through string
     - O(1) average lookup in HashMap
   - Space: O(1)
     - Fixed size map (7 entries)
   - Pros:
     - More readable
     - Flexible for modifications
   - Cons:
     - Slightly more overhead

3. **Switch-Case Approach**
   - Time: O(n)
     - Single pass
     - O(1) lookup in switch
   - Space: O(1)
     - No extra storage
   - Pros:
     - No data structures
     - Good for small sets
   - Cons:
     - Less maintainable
     - Limited to chars

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
5. String of length 1
6. String of maximum length (15)
7. All valid subtraction pairs
8. Maximum consecutive same character
9. All ascending values
10. All descending values

## Pattern Recognition

1. **Number System Conversion**

   - Symbol to value mapping
   - Rule-based conversion
   - Positional value systems

2. **Special Case Handling**

   - Look-ahead comparison
   - Value-based decisions
   - Pattern matching

3. **String Processing**
   - Character-by-character
   - Direction of processing
   - State tracking

## Implementation Tips

1. **Value Mapping Setup**

   ```java
   int[] values = new int[128];
   values['I'] = 1;
   values['V'] = 5;
   values['X'] = 10;
   values['L'] = 50;
   values['C'] = 100;
   values['D'] = 500;
   values['M'] = 1000;
   ```

2. **Right-to-Left Processing**

   ```java
   int prev = 0;
   for (int i = s.length() - 1; i >= 0; i--) {
       int curr = values[s.charAt(i)];
       if (curr >= prev) {
           sum += curr;
       } else {
           sum -= curr;
       }
       prev = curr;
   }
   ```

3. **Subtraction Rules Check**
   ```java
   // For left-to-right processing
   if (i + 1 < s.length() &&
       values[s.charAt(i)] < values[s.charAt(i + 1)]) {
       // Subtraction case
   }
   ```

## Common Templates

```java
// Template for numeral system conversion
public int convertNumeral(String s, int[] values) {
    int result = 0;
    int prev = 0;

    // Right to left processing
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
5. Evaluate Reverse Polish Notation
6. Parse Lisp Expression
7. Excel Sheet Column Number
8. Different Number System Conversions

## Common Mistakes

1. Wrong subtraction rule application
2. Missing value comparisons
3. Incorrect value mapping
4. Not tracking previous value
5. Wrong processing direction
6. Inefficient data structure choice
7. Complex validation logic
8. Missing edge cases
9. Wrong loop conditions
10. Not considering constraints
