// Last updated: 7/9/2026, 9:20:57 AM
import java.util.*;

class Solution {
    private static final Map<Character, String> PHONE_MAP = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = PHONE_MAP.get(digits.charAt(index));
        for (char c : letters.toCharArray()) {
            current.append(c);                                 // Choose
            backtrack(digits, index + 1, current, result);     // Explore
            current.deleteCharAt(current.length() - 1);        // Un-choose (Backtrack)
        }
    }
}
