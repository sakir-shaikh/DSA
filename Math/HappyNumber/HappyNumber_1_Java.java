public class Solution {
    public boolean isHappy(int n) {
        boolean result = false;
        int slow = ss(n);
        int fast = ss(ss(n));
        while (!result) {
            slow = ss(slow);
            fast = ss(ss(fast));
            if (fast == 1) {
                result = true;
                break;
            }
            if (fast == slow) {
                break;
            }
        }
        return result;
    }

    static int ss(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            int square = digit * digit;
            n = n / 10;
            result += square;
        }
        return result;
    }
}