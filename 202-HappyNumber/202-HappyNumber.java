// Last updated: 7/9/2026, 9:20:08 AM
class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }
            n = sum;
        }

        return n == 1;
    }
}