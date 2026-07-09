// Last updated: 7/9/2026, 9:21:23 AM
class Solution {
    public boolean isPalindrome(int x) {  
        if (x < 0) return false;
        int original = x;
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return original == rev;
    }
}
