// Last updated: 7/9/2026, 9:20:47 AM
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int go= 0;
        int now= 0;
        for (int i = 0; i < nums.length - 1; i++) {
            go= Math.max(go, i + nums[i]);
            if (i == now) {
                jumps++;
              now = go;
            }
        }
        return jumps;
    }
}