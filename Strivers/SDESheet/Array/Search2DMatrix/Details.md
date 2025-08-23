# Search in a 2D Matrix

## Problem Statement
Write an efficient algorithm that searches for a target value in an m x n matrix. The matrix has the following properties:
1. Integers in each row are sorted from left to right
2. The first integer of each row is greater than the last integer of the previous row

## Examples

### Example 1
```
Input: matrix = [
  [1,  3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 60]
], target = 3
Output: true
Explanation: 3 is found in the matrix
```

### Example 2
```
Input: matrix = [
  [1,  3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 60]
], target = 13
Output: false
Explanation: 13 is not in the matrix
```

### Example 3
```
Input: matrix = [[1]], target = 1
Output: true
```

## Approach & Intuition

1. **Binary Search on Flattened Matrix (Optimal)**
   ```java
   public boolean searchMatrix(int[][] matrix, int target) {
       if (matrix == null || matrix.length == 0) return false;
       
       int m = matrix.length;
       int n = matrix[0].length;
       int left = 0;
       int right = m * n - 1;
       
       while (left <= right) {
           int mid = left + (right - left) / 2;
           int element = matrix[mid / n][mid % n];
           
           if (element == target) return true;
           if (element < target) left = mid + 1;
           else right = mid - 1;
       }
       return false;
   }
   ```

2. **Row-wise Binary Search**
   ```java
   public boolean searchMatrix(int[][] matrix, int target) {
       int m = matrix.length;
       int n = matrix[0].length;
       
       // Find potential row
       int top = 0, bottom = m - 1;
       while (top < bottom) {
           int mid = top + (bottom - top + 1) / 2;
           if (matrix[mid][0] <= target) top = mid;
           else bottom = mid - 1;
       }
       
       // Binary search in the row
       int row = top;
       int left = 0, right = n - 1;
       while (left <= right) {
           int mid = left + (right - left) / 2;
           if (matrix[row][mid] == target) return true;
           if (matrix[row][mid] < target) left = mid + 1;
           else right = mid - 1;
       }
       return false;
   }
   ```

## Complexity Analysis
1. Flattened Binary Search:
   - Time: O(log(m*n))
   - Space: O(1)

2. Row-wise Binary Search:
   - Time: O(log m + log n)
   - Space: O(1)

## Edge Cases
1. Empty matrix
2. Single element matrix
3. Single row matrix
4. Single column matrix
5. Target smaller than smallest element
6. Target larger than largest element
7. Target between rows
8. Target at matrix boundaries
9. Duplicate elements (if allowed)

## Pattern Recognition
Use this approach when:
- Matrix has sorted properties
- Each row is sorted
- Row-wise relationship exists
- Similar problems:
  - Search in sorted 2D matrix II
  - Kth smallest in sorted matrix
  - Median in row-wise sorted matrix

## Implementation Tips
1. **Index Conversion**
   ```java
   // Convert 1D index to 2D
   int row = index / cols;
   int col = index % cols;
   
   // Convert 2D to 1D
   int index = row * cols + col;
   ```

2. **Boundary Checks**
   ```java
   if (matrix == null || matrix.length == 0 || 
       matrix[0] == null || matrix[0].length == 0) {
       return false;
   }
   ```

3. **Safe Mid Calculation**
   ```java
   int mid = left + (right - left) / 2;  // Avoid overflow
   ```

## Common Templates
```java
// Template for searching in sorted 2D matrix
public boolean search2DMatrix(int[][] matrix, int target) {
    int m = matrix.length, n = matrix[0].length;
    int left = 0, right = m * n - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int element = matrix[mid / n][mid % n];
        
        if (element == target) return true;
        if (element < target) left = mid + 1;
        else right = mid - 1;
    }
    return false;
}
```

## Related Problems
1. Search a 2D Matrix II
2. Kth Smallest Element in Sorted Matrix
3. Count Negative Numbers in Sorted Matrix
4. Find Peak Element II
5. Matrix Median

## Common Mistakes
1. Incorrect index conversion
2. Not handling empty matrix
3. Integer overflow in calculations
4. Wrong binary search boundaries
5. Inefficient row-by-row search
6. Not utilizing matrix properties
7. Confusion between m and n
