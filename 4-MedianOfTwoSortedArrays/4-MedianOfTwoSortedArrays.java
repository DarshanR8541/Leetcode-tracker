// Last updated: 7/9/2026, 9:21:27 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int size =m+n;
        int ms[]=new int[size];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]) ms[k++]=nums1[i++];
            else ms[k++]=nums2[j++];
        }
        while(i<m){
            ms[k++]=nums1[i++];
        }
        while(j<n){
            ms[k++]=nums2[j++];
        }
        double median;
        if(size%2==0){
            median=((ms[size/2]+ms[size/2 -1])/2.0);
        }
        else{
            median=(ms[size/2]);
        }
        return median;
    }
}     