// Last updated: 7/9/2026, 9:20:18 AM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        return result.trim();
    }
}