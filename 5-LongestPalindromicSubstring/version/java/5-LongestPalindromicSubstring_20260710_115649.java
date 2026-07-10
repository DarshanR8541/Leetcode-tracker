// Last updated: 7/10/2026, 11:56:49 AM
1class Solution {
2    public String longestPalindrome(String s) {
3       if(s==null ||s.length()<2)
4       return s;
5       String longest="";
6       for(int i=0;i<s.length();i++){
7        String odd=expand(s,i,i);
8        String even=expand(s,i,i+1);
9        if(odd.length()>longest.length()){
10        longest=odd;
11        }
12        if(even.length()>longest.length()){
13        longest=even;
14       } 
15    }
16       return longest;
17    }
18    public String expand(String s,int left,int right){
19      while (left >= 0 && right < s.length()
20                && s.charAt(left) == s.charAt(right)) {
21            left--;
22            right++;
23        }
24        return s.substring(left+1,right);
25    }
26}