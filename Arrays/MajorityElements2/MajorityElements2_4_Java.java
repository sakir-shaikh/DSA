import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int threshold = nums.length / 3;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Test Case 1: " + solution.majorityElement(nums1));  // Output: [3]
        
        // Test Case 2
        int[] nums2 = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println("Test Case 2: " + solution.majorityElement(nums2));  // Output: [1, 2]
        
        // Test Case 3
        int[] nums3 = {1, 2};
        System.out.println("Test Case 3: " + solution.majorityElement(nums3));  // Output: [1, 2]
    }
}
