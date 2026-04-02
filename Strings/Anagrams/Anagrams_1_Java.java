import java.util.Arrays;

public class Anagrams_1_Java {
    /**
     * Checks if two strings are anagrams of each other.
     * 
     * @param s The first string.
     * @param t The second string.
     * @return true if t is an anagram of s, false otherwise.
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagrams_1_Java solution = new Anagrams_1_Java();

        // Test Case 1: s = "anagram", t = "nagaram" -> Expected: true
        String s1 = "anagram", t1 = "nagaram";
        boolean result1 = solution.isAnagram(s1, t1);
        System.out.println("Test Case 1: s=\"" + s1 + "\", t=\"" + t1 + "\" -> Result: " + result1 + " (" + (result1 == true ? "PASSED" : "FAILED") + ")");

        // Test Case 2: s = "rat", t = "car" -> Expected: false
        String s2 = "rat", t2 = "car";
        boolean result2 = solution.isAnagram(s2, t2);
        System.out.println("Test Case 2: s=\"" + s2 + "\", t=\"" + t2 + "\" -> Result: " + result2 + " (" + (result2 == false ? "PASSED" : "FAILED") + ")");

        // Test Case 3: s = "listen", t = "silent" -> Expected: true
        String s3 = "listen", t3 = "silent";
        boolean result3 = solution.isAnagram(s3, t3);
        System.out.println("Test Case 3: s=\"" + s3 + "\", t=\"" + t3 + "\" -> Result: " + result3 + " (" + (result3 == true ? "PASSED" : "FAILED") + ")");
    }
}
