// Last updated: 7/10/2026, 12:20:23 PM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int closest=nums[0]+nums[1]+nums[2];
5        for(int i=0;i<nums.length-2;i++){
6            int left =i+1;
7            int right=nums.length-1;
8            while(left<right){
9                int sum=nums[i]+nums[left]+nums[right];
10                if(Math.abs(target-sum)<Math.abs(target-closest)){
11                    closest=sum;
12                }
13                if(sum<target){
14                    left++;
15                }else if(sum>target){
16                    right--;
17                }else{
18                    return sum;
19                }
20            }
21        }
22        return closest;
23    }
24}