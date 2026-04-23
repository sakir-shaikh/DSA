import java.util.*;

public class TwoEditWords_6_Java {
    /**
     * Finds all words from queries that, after a maximum of two edits, equal some word from dictionary.
     * 
     * @param queries String array of query words
     * @param dictionary String array of dictionary words
     * @return List of words from queries that match a dictionary word within 2 edits
     */
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();
        for (String curr : queries) {
            for (String dic : dictionary) {
                int diff = 0;
                for (int k = 0; k < curr.length(); k++) {
                    if (dic.charAt(k) != curr.charAt(k)) {
                        diff++;
                    }
                    if (diff > 2) {
                        break;
                    }
                }
                if (diff <= 2) {
                    result.add(curr);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoEditWords_6_Java solution = new TwoEditWords_6_Java();

        // Test Case 1: Example from LeetCode
        String[] queries1 = {"word", "note", "ants", "wood"};
        String[] dictionary1 = {"wood", "joke", "moat"};
        List<String> expected1 = Arrays.asList("word", "note", "wood");
        List<String> result1 = solution.twoEditWords(queries1, dictionary1);
        System.out.println("Test Case 1: " + (result1.equals(expected1) ? "PASSED" : "FAILED"));

        // Test Case 2: No matches
        String[] queries2 = {"yes"};
        String[] dictionary2 = {"not"};
        List<String> expected2 = Collections.emptyList();
        List<String> result2 = solution.twoEditWords(queries2, dictionary2);
        System.out.println("Test Case 2: " + (result2.equals(expected2) ? "PASSED" : "FAILED"));

        // Test Case 3: Exact match (0 edits)
        String[] queries3 = {"abc"};
        String[] dictionary3 = {"abc"};
        List<String> expected3 = Arrays.asList("abc");
        List<String> result3 = solution.twoEditWords(queries3, dictionary3);
        System.out.println("Test Case 3: " + (result3.equals(expected3) ? "PASSED" : "FAILED"));

        // Test Case 4: Exactly two edits
        String[] queries4 = {"abcd"};
        String[] dictionary4 = {"abef"};
        List<String> expected4 = Arrays.asList("abcd");
        List<String> result4 = solution.twoEditWords(queries4, dictionary4);
        System.out.println("Test Case 4: " + (result4.equals(expected4) ? "PASSED" : "FAILED"));
    }
}
