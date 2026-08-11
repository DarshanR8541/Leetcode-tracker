// Last updated: 8/11/2026, 3:59:35 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5
6        List<Integer> result = new ArrayList<>();
7
8        if (s == null || words == null || words.length == 0) {
9            return result;
10        }
11
12        int wordLen = words[0].length();
13        int wordCount = words.length;
14        int totalLen = wordLen * wordCount;
15
16        if (s.length() < totalLen) {
17            return result;
18        }
19
20        Map<String, Integer> wordMap = new HashMap<>();
21
22        for (String word : words) {
23            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
24        }
25
26        for (int i = 0; i < wordLen; i++) {
27
28            int left = i;
29            int right = i;
30            int count = 0;
31
32            Map<String, Integer> currentMap = new HashMap<>();
33
34            while (right + wordLen <= s.length()) {
35
36                String word = s.substring(right, right + wordLen);
37                right += wordLen;
38
39                if (wordMap.containsKey(word)) {
40
41                    currentMap.put(
42                        word,
43                        currentMap.getOrDefault(word, 0) + 1
44                    );
45
46                    count++;
47
48                    while (currentMap.get(word) > wordMap.get(word)) {
49                        String leftWord = s.substring(left, left + wordLen);
50
51                        currentMap.put(
52                            leftWord,
53                            currentMap.get(leftWord) - 1
54                        );
55
56                        left += wordLen;
57                        count--;
58                    }
59
60                    if (count == wordCount) {
61                        result.add(left);
62
63                        String leftWord = s.substring(left, left + wordLen);
64
65                        currentMap.put(
66                            leftWord,
67                            currentMap.get(leftWord) - 1
68                        );
69
70                        left += wordLen;
71                        count--;
72                    }
73
74                } else {
75                    currentMap.clear();
76                    count = 0;
77                    left = right;
78                }
79            }
80        }
81
82        return result;
83    }
84}