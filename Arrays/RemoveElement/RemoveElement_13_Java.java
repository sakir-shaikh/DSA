import java.util.Arrays;

public class RemoveElement_13_Java {
    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
     * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
     *
     * @param nums Array of integers
     * @param val Value to remove
     * @return Number of elements not equal to val
     */
    public int removeElement(int[] nums, int val) {
        int k = 0; 
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement_13_Java solution = new RemoveElement_13_Java();

        // Test Case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expectedK1 = 2;
        int k1 = solution.removeElement(nums1, val1);
        boolean passed1 = k1 == expectedK1;
        // Check first k elements
        Arrays.sort(nums1, 0, k1);
        if (passed1) {
            int[] expectedNums1 = {2, 2};
            for (int i = 0; i < k1; i++) {
                if (nums1[i] != expectedNums1[i]) {
                    passed1 = false;
                    break;
                }
            }
        }
        System.out.println("Test Case 1: " + (passed1 ? "PASSED" : "FAILED"));

        // Test Case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int expectedK2 = 5;
        int k2 = solution.removeElement(nums2, val2);
        boolean passed2 = k2 == expectedK2;
        Arrays.sort(nums2, 0, k2);
        if (passed2) {
            int[] expectedNums2 = {0, 0, 1, 3, 4};
            for (int i = 0; i < k2; i++) {
                if (nums2[i] != expectedNums2[i]) {
                    passed2 = false;
                    break;
                }
            }
        }
        System.out.println("Test Case 2: " + (passed2 ? "PASSED" : "FAILED"));
        
        // Test Case 3: Empty array
        int[] nums3 = {};
        int val3 = 0;
        int k3 = solution.removeElement(nums3, val3);
        System.out.println("Test Case 3: " + (k3 == 0 ? "PASSED" : "FAILED"));

        // Test Case 4: All elements are val
        int[] nums4 = {2, 2, 2};
        int val4 = 2;
        int k4 = solution.removeElement(nums4, val4);
        System.out.println("Test Case 4: " + (k4 == 0 ? "PASSED" : "FAILED"));

        // Test Case 5: No elements are val
        int[] nums5 = {1, 2, 3};
        int val5 = 4;
        int k5 = solution.removeElement(nums5, val5);
        System.out.println("Test Case 5: " + (k5 == 3 ? "PASSED" : "FAILED"));
    }
}
