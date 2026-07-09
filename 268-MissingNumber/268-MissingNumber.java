// Last updated: 7/9/2026, 9:19:48 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int a=n*(n+1)/2;
        int value=0;
        for (int num : nums){
            value += num;
        }
        return a-value;
    }
}


