// Last updated: 7/9/2026, 9:19:09 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int p : position) {
            if (p % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }
}
