package TwoPointers.ContainerWithMostWater;

public class ContainerWithMostWater_1_Java {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int maxArea = 0;
        while (right > left) {
            maxArea = Math.max(maxArea, ((right - left) * (Math.min(height[right], height[left]))));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater_1_Java solution = new ContainerWithMostWater_1_Java();
        
        // Test case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Test Case 1: " + (solution.maxArea(height1) == 49 ? "Passed" : "Failed") + " (Expected 49, Got " + solution.maxArea(height1) + ")");
        
        // Test case 2
        int[] height2 = {1, 1};
        System.out.println("Test Case 2: " + (solution.maxArea(height2) == 1 ? "Passed" : "Failed") + " (Expected 1, Got " + solution.maxArea(height2) + ")");
        
        // Test case 3
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Test Case 3: " + (solution.maxArea(height3) == 16 ? "Passed" : "Failed") + " (Expected 16, Got " + solution.maxArea(height3) + ")");
    }
}
