import java.util.*;
class Solution {
    public String firstNonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            q.add(c);
            while (!q.isEmpty() && map.get(q.peek()) > 1)
                q.poll();
            if (q.isEmpty())
                ans.append('#');
            else
                ans.append(q.peek());
        }
        return ans.toString();
    }
}