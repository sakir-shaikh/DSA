# Sort a Stack Using Recursion

🧩 **Problem**:  
Sort a stack such that the smallest elements are on top. You can only use recursion and the standard stack operations (push, pop, peek, isEmpty).

🧠 **Approach**:  
Use recursion to pop all elements, sort the smaller stack, and then insert each popped element back into the correct position using a helper `insert` method.

⏱️ **Time & Space Complexity**:  
O(n²) time and O(n) space due to recursive calls and auxiliary stack usage in the call stack.

📌 **Example**:  
Input: [3, 1, 4, 2]  
Output: [1, 2, 3, 4] (from top to bottom)

🏷️ **Tags**: Stack, Recursion, Sorting
