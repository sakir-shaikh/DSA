class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (r > l) {
            char left = s.charAt(l);
            char right = s.charAt(r);
            if (!Character.isLetterOrDigit(left)) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                r--;
                continue;
            }
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            r--;
            l++;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";

        System.out.println("Test 1: " + sol.isPalindrome(test1)); // true
        System.out.println("Test 2: " + sol.isPalindrome(test2)); // false
        System.out.println("Test 3: " + sol.isPalindrome(test3)); // true
    }
}
