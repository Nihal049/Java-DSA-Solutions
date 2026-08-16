import java.util.*;
class Solution {
    public String maximumFrequency(String s) {
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);
        String ans = words[0];
        int max = map.get(ans);
        for (String word : words) {
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }
        return ans + " " + max;
    }
}