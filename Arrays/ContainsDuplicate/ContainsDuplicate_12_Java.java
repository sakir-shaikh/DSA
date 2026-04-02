import java.util.HashSet;

public class ContainsDuplicate_12_Java {
    /**
     * Checks if the given array contains any duplicate elements.
     * 
     * @param nums The integer array to check.
     * @return true if any value appears at least twice, false otherwise.
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            // set.add(i) returns false if the element was already in the set
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate_12_Java solution = new ContainsDuplicate_12_Java();
        
        // Test Case 1: [1, 2, 3, 1] -> Expected: true
        int[] nums1 = {1, 2, 3, 1};
        boolean result1 = solution.containsDuplicate(nums1);
        System.out.println("Test Case 1: [1, 2, 3, 1] -> Result: " + result1 + " (" + (result1 == true ? "PASSED" : "FAILED") + ")");

        // Test Case 2: [1, 2, 3, 4] -> Expected: false
        int[] nums2 = {1, 2, 3, 4};
        boolean result2 = solution.containsDuplicate(nums2);
        System.out.println("Test Case 2: [1, 2, 3, 4] -> Result: " + result2 + " (" + (result2 == false ? "PASSED" : "FAILED") + ")");

        // Test Case 3: [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] -> Expected: true
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result3 = solution.containsDuplicate(nums3);
        System.out.println("Test Case 3: [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] -> Result: " + result3 + " (" + (result3 == true ? "PASSED" : "FAILED") + ")");
    }
}
