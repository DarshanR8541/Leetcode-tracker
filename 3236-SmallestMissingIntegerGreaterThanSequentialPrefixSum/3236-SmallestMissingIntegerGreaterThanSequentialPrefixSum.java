// Last updated: 7/9/2026, 9:19:02 AM
class Solution {
    public int missingInteger(int[] nums) {
        int prevSum = nums[0];

        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int seqIndex = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1] + 1) { prevSum += nums[i]; seqIndex = i; set.add(nums[i]); }
            else break;
        }

        for(int i = seqIndex; i < nums.length; i++) {
            if(nums[i] >= prevSum) set.add(nums[i]);
        }

        while(set.contains(prevSum)) {
            prevSum++;
        }

        return prevSum;
    }
}