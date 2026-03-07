class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        while (true) {

            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }

        }
        int slow2 = nums[0];
        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(solution.findDuplicate(nums)); // Output: 2
    }
}
