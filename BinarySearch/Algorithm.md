# Binary Search Algorithm

## Description

Binary Search efficiently finds the position of a target value within a sorted array. It repeatedly divides the search interval in half.

## Pseudocode

```
function binarySearch(arr, target):
    left = 0
    right = arr.length - 1
    while left <= right:
        mid = left + (right - left) // 2
        if arr[mid] == target:
            return mid
        else if arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1
```

## Steps

1. Initialize left and right pointers.
2. While left <= right:
   - Calculate mid.
   - If arr[mid] == target, return mid.
   - If arr[mid] < target, search right half.
   - Else, search left half.
3. If not found, return -1.
