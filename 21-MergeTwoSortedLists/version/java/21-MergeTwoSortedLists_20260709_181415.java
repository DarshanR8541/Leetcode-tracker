// Last updated: 7/9/2026, 6:14:15 PM
1class Solution {
2    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
3
4        if(list1!=null && list2!=null){
5        if(list1.val<list2.val){
6            list1.next=mergeTwoLists(list1.next,list2);
7            return list1;
8            }
9            else{
10                list2.next=mergeTwoLists(list1,list2.next);
11                return list2;
12        }
13        }
14        if(list1==null)
15            return list2;
16        return list1;
17    }
18}
19