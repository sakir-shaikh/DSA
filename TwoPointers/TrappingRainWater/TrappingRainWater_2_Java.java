public class TrappingRainWater_2_Java {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        TrappingRainWater_2_Java solution = new TrappingRainWater_2_Java();

        // Test Case 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Test Case 1: " + (solution.trap(height1) == 6 ? "PASSED" : "FAILED (expected 6, got " + solution.trap(height1) + ")"));

        // Test Case 2
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Test Case 2: " + (solution.trap(height2) == 9 ? "PASSED" : "FAILED (expected 9, got " + solution.trap(height2) + ")"));

        // Test Case 3: Empty array
        int[] height3 = {};
        System.out.println("Test Case 3: " + (solution.trap(height3) == 0 ? "PASSED" : "FAILED (expected 0, got " + solution.trap(height3) + ")"));

        // Test Case 4: No water can be trapped
        int[] height4 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 4: " + (solution.trap(height4) == 0 ? "PASSED" : "FAILED (expected 0, got " + solution.trap(height4) + ")"));
    }
}
