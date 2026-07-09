// Last updated: 7/9/2026, 9:20:26 AM
class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}