public class Solution {
    // Count set bits in an integer
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    // Find single number in array
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    // Check if a number is power of two
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(13)); // Output: 3
        System.out.println(singleNumber(new int[]{2,2,1})); // Output: 1
        System.out.println(isPowerOfTwo(16)); // Output: true
    }
}
