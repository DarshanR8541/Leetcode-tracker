// Last updated: 7/9/2026, 9:19:12 AM
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(freq.values());
        return set.size() == freq.size();
    }
}
