// Last updated: 7/9/2026, 9:18:57 AM
class Solution {

    public int[] frequencySort(int[] nums) {
       
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

      
        Arrays.sort(arr, (a, b) -> {
            int fa = freq.get(a);
            int fb = freq.get(b);
            if (fa == fb) {
                return b - a; 
            }
            return fa - fb; 
        });

        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }
}
