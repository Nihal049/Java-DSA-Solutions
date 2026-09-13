import java.util.*;
class Solution {
    String removeDuplicates(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                ans.append(c);
                map.put(c, 1);
            }
        }
        return ans.toString();
    }
}